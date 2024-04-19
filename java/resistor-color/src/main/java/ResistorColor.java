import java.util.ArrayList;
import java.util.Arrays;

class ResistorColor {
    int colorCode(String color) {
        String[] colorsString = colors();
//        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colorsString));
//        return colorList.indexOf(color);
        return Arrays.asList(colorsString).indexOf(color);
    }

    String[] colors() {
        String[] colorsString = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorsString;
    }
}
