package sistemas;

import java.util.ArrayList;
import java.util.List;

import exceptions.BairroJaCadastradoException;
import exceptions.DadosInvalidosException;
import exceptions.HorarioJaCadastradoException;
import exceptions.LoginInvalidoException;
import exceptions.UsuarioJaExistenteException;
import models.Dados;
import models.Endereco;
import models.Horario;
import models.TipoCarona;
import models.Usuario;

public final class SistemaUsuarioCRUD {
	
	private static final SistemaUsuarioCRUD INSTANCIA = new SistemaUsuarioCRUD();
	private List<Usuario> usuariosAtivados;
	private List<Usuario> usuariosDesativados;
	
	private SistemaUsuarioCRUD(){
		usuariosAtivados = new ArrayList<Usuario>();
		usuariosDesativados = new ArrayList<Usuario>();
	}

	public static SistemaUsuarioCRUD getInstance(){
		return INSTANCIA;
	}
	
	// Cadastro com foto de usuario default
	public Usuario cadastraUsuario(Dados dadosPessoais, Endereco endereco, Integer numeroVagas) throws UsuarioJaExistenteException {
		Usuario novoUsuario = new Usuario(dadosPessoais, endereco, numeroVagas);
		novoUsuario.setIdioma(SistemaUsuarioLogin.getInstance().getIdioma());
		if (!isUsuarioExistente(novoUsuario))
			usuariosAtivados.add(novoUsuario);

		return novoUsuario;
	}
	
	public Usuario desativaUsuario(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Usuario usuarioASerDesativado = removeUsuario(matricula, email, senha);
		usuariosDesativados.add(usuarioASerDesativado);
		return usuarioASerDesativado;
	}
	
	public Usuario consultaUsuario(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		return usuariosAtivados.get(buscaIndexUsuario(matricula, email, senha));
	}
	
	List<Usuario> getListaUsuariosAtivados(){
		return usuariosAtivados;
	}
	
	private Usuario removeUsuario(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		int indexUsuarioASerRemovido = buscaIndexUsuario(matricula, email, senha);
		
		return usuariosAtivados.remove(indexUsuarioASerRemovido);
	}
	
	
	private int buscaIndexUsuario(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Dados matriculaSenhaUsuario = new Dados(matricula, email, senha);
		
		for (int i = 0; i < usuariosAtivados.size(); i++) {
			if(usuariosAtivados.get(i).getDadosUsuario().equals(matriculaSenhaUsuario))
				return i;
		}
		
		throw new LoginInvalidoException();
	}
	
	public void cadastraHorario(Usuario usuario,TipoCarona tipo, Horario horario) throws HorarioJaCadastradoException{
		if(tipo == TipoCarona.IDA)
			usuario.adicionarHorarioIda(horario);
		else
			usuario.adicionarHorarioVolta(horario);
	}
	
	public void cadastraHorario(Usuario usuario,TipoCarona tipo, String dia, int hora) throws HorarioJaCadastradoException{
		Horario horario = new Horario(dia,hora);
		cadastraHorario(usuario,tipo,horario);
	}
	
	private boolean isUsuarioExistente(Usuario novoUsuario) throws UsuarioJaExistenteException {
		for (Usuario usuario : usuariosAtivados) {
			if(usuario.getEmail().equals(novoUsuario.getEmail()) ||
				usuario.getDadosUsuario().getMatricula().equals(novoUsuario.getDadosUsuario().getMatricula()))
				throw new UsuarioJaExistenteException();
		}
		return false;
	}
	public void cadastraNovoEndereco(Usuario usuario,String rua, String bairro) throws BairroJaCadastradoException{
      usuario.addEnderecoAlternativo(new Endereco(rua, bairro));
  }
}
