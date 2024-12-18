public class Main {
    public static void main(String[] args) {

        char[][] faces = new char[3][3];
        String color = "RNAAVRBVR";
        int value = 0;
        for (int i=0; i<3;i++)
        {
            for (int n=0; n<3; n++)
            {
                faces[i][n] = color.toCharArray()[value];
                value++;
                System.out.print(faces[i][n]);
            }
            System.out.println();
        }


    }
}