public class Face {

    protected char[][] face;

    public Face(char centerColor) {
        this.face = new char[3][3];
        face[1][1] = centerColor;
    }


    protected void setPosFace(char color, int x, int y) {
        try {
            face[x][y] = color;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println(e.getMessage());
        }
    }

    public void setFace(String faceColor) {
        int value = 0;
        for (int x = 0; x <3; x++)
        {
            for (int y = 0; y <3; y++)
            {
                if (x !=1 && y !=1){

                setPosFace(faceColor.toCharArray()[value], x, y);

                }
                value++;
            }

        }
    }
}
