package eccezione;

/**
 * Eccezzione categoria non esiste
 * @author angelo
 *
 */
public class CategoriaNonEsisteException extends Exception {

	public CategoriaNonEsisteException (String msg) {
		super(msg);
	}
	public CategoriaNonEsisteException() {
		super();
	}
}