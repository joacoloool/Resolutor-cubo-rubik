import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CubeR rubikCube = new CubeR();

        ArrayList<String> faceColors = new ArrayList<>();
        faceColors.add("WWWWWWWW"); // Cara Blanca
        faceColors.add("BBBBBBBB"); // Cara Azul
        faceColors.add("RRRRRRRR"); // Cara Roja
        faceColors.add("OOOOOOOO"); // Cara Naranja
        faceColors.add("GGGGGGGG"); // Cara Verde
        faceColors.add("YYYYYYYY"); // Cara Amarilla

        rubikCube.personalizeCubeColors(faceColors);
        rubikCube.printCube();

    }
}