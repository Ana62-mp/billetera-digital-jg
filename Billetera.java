public class Billetera {
    // Atributos con los tipos exactos pedidos [cite: 215]
    private String propietario;
    private String numeroCuenta;
    private double saldo;
    private boolean activa;

    // Constructor: activa se inicializa en true automáticamente [cite: 218, 219]
    public Billetera(String propietario, String numeroCuenta, double saldoInicial) {
        this.propietario = propietario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.activa = true; 
    }

}
