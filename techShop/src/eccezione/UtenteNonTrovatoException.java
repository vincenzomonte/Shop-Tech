package eccezione;

/**
 * Eccezione Utente non trovato
 * @author angelo
 *
 */
public class UtenteNonTrovatoException extends Exception{

	public UtenteNonTrovatoException(String msg) {
		super(msg);
	}
	public UtenteNonTrovatoException() {
		super();
	}
}