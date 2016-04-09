package controllers;

import javax.inject.Inject;

import models.Carro;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class HorariosController extends Controller {
	private FormFactory formFactory;
	private Usuario usuarioLogado;
	
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Carro> formularioCarro;
	private Form<Endereco> formularioEndereco;
	
	@Inject
	public HorariosController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioCarro = this.formFactory.form(Carro.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
	}
	
	public Result cadastraHorarios(){
		/*
		 * Deve salvar os horarios no usuario, mas para isso tem que pegar
		 * os atributos lá de alguma forma. Nao sei como fazer isso ainda.
		 * 
		 * Por enquanto ele vai so redirecionar para a pagina principal e
		 * mudar o atributo do usuario.
		 */
		
		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		usuarioLogado.cadastrouHorarios();
		
		return ok(viewMotorista.render(usuarioLogado));
		
	}
	
}