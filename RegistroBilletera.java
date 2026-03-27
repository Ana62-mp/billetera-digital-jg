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






}