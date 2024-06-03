package Buquealtoque;

public class PagoMercadoPago extends Pago {
    private String email;

    public PagoMercadoPago(String email) {
        this.email = email;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago de " + monto + " con MercadoPago...");
        // Lógica de pago con MercadoPago
    }
}
