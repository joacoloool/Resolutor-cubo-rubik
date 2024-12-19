public class Face {

    private char[][] face;

    // Constructor
    public Face(char centerColor) {
        this.face = new char[3][3];
        initializeFace(centerColor);
    }

    // Inicializar la cara con el color del centro y espacios vacíos
    private void initializeFace(char centerColor) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = ' '; // Inicializamos las celdas vacías
            }
        }
        face[1][1] = centerColor; // Color del centro
    }

    // Método para establecer un color en una posición específica
    public void setFaceColorAt(char color, int x, int y) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3) {
            System.err.println("Posición fuera de rango: (" + x + ", " + y + ")");
            return;
        }
        face[x][y] = color;
    }

    // Método para rellenar la cara con un string de colores
    public void setFace(String faceColor) {
        if (faceColor.length() != 8) {
            throw new IllegalArgumentException("El string debe contener exactamente 8 colores (sin incluir el centro).");
        }

        int value = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (x == 1 && y == 1) {
                    continue; // No sobreescribimos el centro
                }
                setFaceColorAt(faceColor.charAt(value), x, y);
                value++;
            }
        }
    }

    // Método para imprimir la cara (para depuración)
    public void printFace() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(face[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para obtener el color del centro
    public char getCenterColor() {
        return face[1][1];
    }
    public String getColumn(int x) throws IllegalStateException
    {
        String columns = new String();
        if (x > 2)
        {
            throw new IllegalArgumentException("Maximo de filas que hay es 3 superaste el limite");
        }
        for(int i = 0 ; i < 3 ; i++)
        {
          columns.concat(String.valueOf(face[x][i]));
        }
        return columns;
    }
}
