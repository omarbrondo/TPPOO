package Buquealtoque;

public class Buque {
    private String id;
    private boolean[][] asientos; // Matriz de asientos

    public Buque(String id) {
        this.id = id;
        this.asientos = new boolean[4][5]; // 4 filas y 5 columnas, total 20 asientos
    }

    public String getId() {
        return id;
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void mostrarAsientos() {
        System.out.println("Asientos del buque " + id + ":");

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j]) {
                    System.out.print("[X] "); // Ocupado
                } else {
                    System.out.print("[" + getAsientoId(i, j) + "] "); // Libre
                }
            }
            System.out.println();
        }
    }

    private String getAsientoId(int fila, int columna) {
        char letra = (char) ('A' + columna);
        int numero = fila + 1;
        return numero + String.valueOf(letra);
    }

    public int[] getFilaColumnaFromId(String asientoId) {
        if (asientoId.length() != 2) {
            return null;
        }
        int fila = Character.getNumericValue(asientoId.charAt(0)) - 1;
        int columna = asientoId.charAt(1) - 'A';
        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[0].length) {
            return new int[]{fila, columna};
        }
        return null;
    }
}
