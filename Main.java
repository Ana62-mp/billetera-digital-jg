public class Main {

    public static void main(String[] args) {

        System.out.println("===== Billetera Digital =====");
        System.out.println();

        // Billetera
        Billetera b = new Billetera("Carlos Mendoza", "BW-00123", 500);
        b.mostrarInfo();
        b.depositar(150);
        b.retirar(200);

        System.out.println();

        // Transaccion
        Transaccion t = new Transaccion("TRANSFERENCIA", 75, "Pago de servicio");
        t.mostrarDetalle();
        t.aplicarComision(2.5);
        t.marcarFallida();

        System.out.println();

        // Contacto
        Contacto c = new Contacto("Laura Torres", "BW-00456", "BilleteraXYZ");
        c.mostrarContacto();
        c.marcarFavorito();
        c.enviarDinero(120);

        System.out.println();
        System.out.println("===== Fin del sistema =====");
    }
}