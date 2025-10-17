public class OrologioDigitale {
    private int oreO;
    private int oreS;
    private int minO;
    private int minS;
    private String stato;
    private String statoS;

    public OrologioDigitale(){
        this.oreO = 0;
        this.oreS = 0;
        this.minO = 0;
        this.minS = 0;
    }

    public OrologioDigitale(int oreO, int minO){
        if(oreO > 23){
            oreO = 0;
        }if(minO > 59){
            minO = 0;
        }
        this.oreO = oreO;
        this.minO = minO;
    }

    public void impostaOrario(){
        if(this.stato.equals("IMPOSTA ORARIO")){
            this.stato = "NORMALE";
        }else{
            this.stato = "IMPOSTA ORARIO";
        }
    }

    public void impostaSveglia(){
        if(this.stato.equals("IMPOSTA SVEGLIA")){
            this.stato = "NORMALE";
        }else{
            this.stato = "IMPOSTA SVEGLIA";
        }
    }

    public void toggleSveglia(){
        if()
    }

    public void aumenta(){
        if(this.stato.equals("IMPOSTA SVEGLIA"))
    }
}
