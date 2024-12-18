import java.util.ArrayList;

public class CubeR {
    protected ArrayList<Face> cube;


    public CubeR(ArrayList<Face> cube) {
        this.cube = new ArrayList<>();
    }

    private void initializerIncialColor()
    {
        Face redFace = new Face('R');
        Face blueFace = new Face('B');
        Face whiteFace = new Face('W');
        Face orangeFace = new Face('O');
        Face greenFace = new Face('G');
        Face yellowFace = new Face('Y');

        cube.add(whiteFace); //First Face
        cube.add(blueFace);
        cube.add(redFace);
        cube.add(orangeFace);
        cube.add(greenFace);
        cube.add(yellowFace);//Last Face
    }
}
