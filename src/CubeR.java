import java.util.ArrayList;

public class CubeR {
    protected ArrayList<Face> cube;

     public CubeR() {
        this.cube = new ArrayList<>();
        initializerIncialColor();
    }

    public void personalizeCubeColors(ArrayList<String> colorFaces)
    {
        int counter=0;
        for (Face face:cube)
        {
            face.setFace(colorFaces.get(counter));
            counter++;
        }
    }

    public void printCube() {
        for (Face face : cube)
        {
            System.out.println(face.getCenterColor());
            face.printFace();
        }
    }

     private void initializerIncialColor()
    {
        Face redFace = new Face('R');
        Face blueFace = new Face('B');
        Face whiteFace = new Face('W');
        Face orangeFace = new Face('O');
        Face greenFace = new Face('G');
        Face yellowFace = new Face('Y');

        cube.add(whiteFace); //Up Face
        cube.add(blueFace);//Front Face
        cube.add(redFace);//Left Face
        cube.add(orangeFace);//Right Face
        cube.add(greenFace);//Back Face
        cube.add(yellowFace);//Down Face
    }
}
