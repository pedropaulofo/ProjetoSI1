package exceptions;

import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

public class UsuarioJaExistenteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioJaExistenteException(){
		super(setup());
	}
	
	public UsuarioJaExistenteException(String mensagem) {
		super(mensagem);
	}

	private static String setup(){
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
		return MensagensSistema.USUARIO_JA_EXISTENTE[idioma.ordinal()];
	}
}