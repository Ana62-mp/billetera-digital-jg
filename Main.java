public class Main {

    public static void main(String[] args) {

        System.out.println("===== Billetera Digital =====");
        System.out.println();

        // INTEGRANTE 1 - Billetera
        Billetera b = new Billetera("Carlos Mendoza", "BW-00123", 500);
        b.mostrarInfo();
        b.depositar(150);
        b.retirar(200);

        System.out.println();

        // INTEGRANTE 2 - Transaccion
        Transaccion t = new Transaccion("TRANSFERENCIA", 75, "Pago de servicio");
        t.mostrarDetalle();
        t.aplicarComision(2.5);
        t.marcarFallida();

        System.out.println();

        // INTEGRANTE 3 - Contacto
        Contacto c = new Contacto("Laura Torres", "BW-00456", "BilleteraXYZ");
        c.mostrarContacto();
        c.marcarFavorito();
        c.enviarDinero(120);

        System.out.println();

        // INTEGRANTE 4 - RegistroBilletera
        RegistroBilletera r = new RegistroBilletera("Banco Digital");

        r.registrarBilletera("BW-00123", "Carlos Mendoza");
        r.registrarBilletera("BW-00456", "Laura Torres");

        r.buscarCuenta("BW-00123");
        r.buscarCuenta("BW-99999");

        r.mostrarRegistro();

        System.out.println();
        System.out.println("===== Fin del sistema =====");
    }
}