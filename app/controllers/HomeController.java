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

public class HomeController extends Controller {
	private FormFactory formFactory;
	private Usuario usuarioLogado;
	
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Carro> formularioCarro;
	private Form<Endereco> formularioEndereco;
	
	@Inject
	public HomeController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioCarro = this.formFactory.form(Carro.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
	}
	
	public Result index(){
		usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		return exibePagina();
	}
	
	private Result exibePagina(){
		if (usuarioLogado == null)
			return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioCarro, formularioEndereco));
		else if(!usuarioLogado.isHorariosCadastrados())
			return ok(telaCadastroHorario.render(usuarioLogado));
		else
			return ok(viewMotorista.render(usuarioLogado)); 
	}
}