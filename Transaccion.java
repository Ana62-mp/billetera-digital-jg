public class Transaccion {

    String tipo;
    double monto;
    String descripcion;
    boolean exitosa;

    public Transaccion(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.exitosa = true;
    }

    public void mostrarDetalle() {
        System.out.println("--- Detalle de Transacción ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Descripción: " + descripcion);

        if (exitosa == true) {
            System.out.println("Estado: Exitosa");
        } else {
            System.out.println("Estado: Fallida");
        }
    }

    
}