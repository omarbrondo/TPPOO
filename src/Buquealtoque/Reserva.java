package Buquealtoque;

public class Reserva {
    private static int contadorId = 1;
    private int id;
    private String clienteDni;
    private String buqueId;
    private int destino;
    private int fila;
    private int columna;
    private boolean pagada;

    public Reserva(String clienteDni, String buqueId, int destino, int fila, int columna) {
        this.id = contadorId++;
        this.clienteDni = clienteDni;
        this.buqueId = buqueId;
        this.destino = destino;
        this.fila = fila;
        this.columna = columna;
        this.pagada = false;
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

    public int getDestino() {
        return destino;
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

    /*public double calcularMonto() {
        //ARGENTINA 450000
        double precio = destino == 1 ? 45000 : 65000;
        return precio;
    }*/
    public double calcularMonto() {
        Buque buque = GestorReserva.encontrarBuque(buqueId);
        if (buque != null) {
            return buque.getMonto();
        } else {
            return 0.0; // O devuelve un valor predeterminado si el buque no se encuentra
        }
    }
}
