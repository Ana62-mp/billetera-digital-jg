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

    public void aplicarComision(double porcentaje) {
        double comision = monto * (porcentaje / 100);
        double total = monto + comision;

        System.out.println("Comisión (" + porcentaje + "%): $" + comision);
        System.out.println("Monto total con comisión: $" + total);
    }

    public void marcarFallida() {
        exitosa = false;
        System.out.println("Transacción marcada como fallida.");
        System.out.println("Monto afectado: $" + monto);
    }
}