public class RegistroBilletera {

	// Constantes

	private static final int CAPACIDAD_MAXIMA = 10;
	private static final String MENSAJE_REGISTRO = "Billetera registrada: ";
	private static final String MENSAJE_ENCONTRADA = "Cuenta encontrada: ";
	private static final String MENSAJE_NO_ENCONTRADA = "Cuenta no encontrada: ";
	private static final String SEPARADOR = " - ";
	private static final String SEPARADOR_PROPIETARIO = " | Propietario: ";

// Atributos privados

	private final String nombreBanco;
	private final String[] cuentas;
	private final String[] propietarios;
	private int totalRegistros;
// Constructor registro

	public RegistroBilletera(String nombreBanco) {

		// Validación

		if (nombreBanco == null || nombreBanco.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre del banco no puede ser null o vacío");
		}

		this.nombreBanco = nombreBanco.trim();
		this.cuentas = new String[CAPACIDAD_MAXIMA];
		this.propietarios = new String[CAPACIDAD_MAXIMA];
		this.totalRegistros = 0;
	}

	// registra un nuevo
public boolean registrarBilletera(String cuenta, String propietario) {

		// Validación de parámetros

		if (cuenta == null || cuenta.trim().isEmpty()) {
			throw new IllegalArgumentException("La cuenta no puede ser null o vacía");
		}
		if (propietario == null || propietario.trim().isEmpty()) {
			throw new IllegalArgumentException("El propietario no puede ser null o vacío");
		}

		// Verificar capacidad

		if (totalRegistros >= CAPACIDAD_MAXIMA) {
			System.out.println("Error: Capacidad máxima alcanzada (" + CAPACIDAD_MAXIMA + " billeteras)");
			return false;
		}

		// Verificar si la cuenta ya existe (evitar duplicados)
		if (cuentaExiste(cuenta)) {
			System.out.println("Error: La cuenta " + cuenta + " ya está registrada");
			return false;
		}





}