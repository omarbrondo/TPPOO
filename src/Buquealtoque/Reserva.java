package Buquealtoque;

public class Reserva {
    private String clienteDni;
    private String buqueId;
    private int fila;
    private int columna;

    public Reserva(String clienteDni, String buqueId, int fila, int columna) {
        this.clienteDni = clienteDni;
        this.buqueId = buqueId;
        this.fila = fila;
        this.columna = columna;
    }

    public String getClienteDni() {
        return clienteDni;
    }

    public String getBuqueId() {
        return buqueId;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
