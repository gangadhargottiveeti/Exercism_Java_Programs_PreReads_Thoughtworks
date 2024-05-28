import java.util.ArrayList;
import java.util.Arrays;

class ResistorColor {
    int colorCode(String color) {
        String[] colorsString = colors();

        return Arrays.asList(colorsString).indexOf(color);
    }

    String[] colors() {
        String[] colorsString = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorsString;
    }
}
