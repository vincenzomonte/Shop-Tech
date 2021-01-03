package eccezione;

/**
 * Eccezione parametro non corretto
 * @author angelo
 *
 */
public class ParametroNonCorrettoException extends Exception{
	
	public ParametroNonCorrettoException() {
		super();
	}
	public ParametroNonCorrettoException(String msg) {
		super(msg);
	}
}