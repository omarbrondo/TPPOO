package Buquealtoque;

public class Reserva {
    private String clienteDni;
    private String buqueId;
    private int fila;
    private int columna;
    private static int contadorReservas = 00100; // Contador para generar IDs únicos
    private int id;
    private boolean pagada;

    public Reserva(String clienteDni, String buqueId, int fila, int columna) {
    	this.id = contadorReservas++;
    	this.clienteDni = clienteDni;
        this.buqueId = buqueId;
        this.fila = fila;
        this.columna = columna;
        this.pagada = false; // Por defecto, la reserva está marcada como no pagada, la idea es que cambie despues de pagarla (eso lo vemos despues)

    }

    public int getId() {
        return id;
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
    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
