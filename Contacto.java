public class Contacto {


    String nombre;
    String cuentaDestino;
    String banco;
    boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco) {
        this.nombre = nombre;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;

        this.favorito = false;
    }

}