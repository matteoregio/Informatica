import java.util.ArrayList;
import java.util.Arrays;

public class Fiore {
    private ArrayList<String> stati;

    public Fiore() {
        stati = new ArrayList<>(Arrays.asList(
                "  \\|/  \n  - @ -  \n  /|\\  ",
                "   |/  \n  - @ -  \n  /|\\  ",
                "    /  \n  - @ -  \n  /|\\  ",
                "       \n  - @ -  \n  /|\\  ",
                "       \n    @ -  \n  /|\\  ",
                "       \n    @    \n  /|\\  ",
                "       \n    @    \n   |\\  ",
                "       \n    @    \n    \\  ",
                "       \n    @    \n       ",
                "       \n         \n       "
        ));
    }

    public void mostra(int errori) {
        if (errori >= 0 && errori < stati.size()) {
            System.out.println(stati.get(errori));
        }
    }
}