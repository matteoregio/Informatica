package com.example.carte;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.paint.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class CarteController {
    @FXML
    private Label txtcarta;

    @FXML
    private ImageView imgRe;
    @FXML
    private ImageView imgRe1;
    @FXML
    private ImageView imgAsso;

    @FXML
    private RadioButton rdUno;
    @FXML
    private RadioButton rdDue;
    @FXML
    private RadioButton rdTre;

    @FXML
    private void initialize() throws FileNotFoundException, URISyntaxException {
        File f = Paths.get(CarteController.class.getResource("images/dorso.png").toURI()).toFile();
        FileInputStream input = new FileInputStream(f);
        Image image = new Image(input);

        imgRe.setImage(image);
        imgRe1.setImage(image);
        imgAsso.setImage(image);
        imgRe.setVisible(true);
        imgRe1.setVisible(true);
        imgAsso.setVisible(true);
    }


    @FXML
    protected void onMescolaButtonClick() throws FileNotFoundException, URISyntaxException{
        File f = Paths.get(CarteController.class.getResource("images/re.png").toURI()).toFile();
        FileInputStream input = new FileInputStream(f);
        Image image = new Image(input);

        imgRe.setImage(image);
        imgRe1.setImage(image);

        File f1 = Paths.get(CarteController.class.getResource("images/asso.png").toURI()).toFile();
        FileInputStream input1 = new FileInputStream(f1);
        Image image1 = new Image(input1);

        imgAsso.setImage(image1);

        if(rdUno.isSelected()){
            txtcarta.setText("Hai sbagliato!!! Hai trovato il re");
            txtcarta.setTextFill(Color.RED);
        }else if(rdDue.isSelected()) {
            txtcarta.setText("Hai sbagliato!!! Hai trovato il re");
            txtcarta.setTextFill(Color.RED);
        }else{
            txtcarta.setText("HAI VINTOOOOOO!!! Hai trovato l'asso");
            txtcarta.setTextFill(Color.GREEN);
        }
    }
}