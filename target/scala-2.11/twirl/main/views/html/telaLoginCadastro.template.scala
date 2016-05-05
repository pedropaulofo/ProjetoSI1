
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object telaLoginCadastro_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class telaLoginCadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Dados],Form[Endereco],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioAutenticacao: Form[Dados], formularioEndereco: Form[Endereco], bairros: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.98*/("""

"""),_display_(/*3.2*/index("Sistema de Caronas: Vumbora")/*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   		<meta name="viewport" content="width=device-width, initial-scale=1">
    	<meta name="description" content="">
    	<meta name="author" content="">

    	<!-- <title>Vumbora</title> Pesquisar DAO Pattern -->

			<script
				src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
			<script
				src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
			<linkrel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"/>

	    <!-- Bootstrap Core CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/bootstrap.min.css" type="text/css">
			<link href="assets/CreativeTemplate/js/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.css" rel="stylesheet">

	    <!-- Custom Fonts -->
	    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
	    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
	    <link rel="stylesheet" href="assets/CreativeTemplate/font-awesome/css/font-awesome.min.css" type="text/css">

	    <!-- Plugin CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/animate.min.css" type="text/css">

	    <!-- Custom CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/creative.css" type="text/css">

	    <style type="text/css">
	    	body"""),format.raw/*40.11*/("""{"""),format.raw/*40.12*/("""
	    		"""),format.raw/*41.8*/("""background-image: url("assets/CreativeTemplate/img/fundoCarro.png");
	    		background-size: cover;
	    	"""),format.raw/*43.7*/("""}"""),format.raw/*43.8*/("""
	    	"""),format.raw/*44.7*/("""input"""),format.raw/*44.12*/("""{"""),format.raw/*44.13*/("""
				"""),format.raw/*45.5*/("""color: black;
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			"""),format.raw/*47.4*/("""select"""),format.raw/*47.10*/("""{"""),format.raw/*47.11*/("""
				"""),format.raw/*48.5*/("""color: black;
			"""),format.raw/*49.4*/("""}"""),format.raw/*49.5*/("""

			"""),format.raw/*51.4*/("""input[type=file]"""),format.raw/*51.20*/("""{"""),format.raw/*51.21*/("""
				"""),format.raw/*52.5*/("""margin-left: 35%;
				margin-right: 35%;
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/("""

	    """),format.raw/*56.6*/("""</style>

	    <script type="text/javascript">
	    	function alertaCadastroEfetuado()"""),format.raw/*59.40*/("""{"""),format.raw/*59.41*/("""
	    		"""),format.raw/*60.8*/("""alert("""),_display_(/*60.15*/Messages("ela_login.sucesso_cadastro")),format.raw/*60.53*/(""");
	    	"""),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
	    """),format.raw/*62.6*/("""</script>
	    <script>
			function loginEfetuadoComSucesso()"""),format.raw/*64.38*/("""{"""),format.raw/*64.39*/("""
	    		"""),format.raw/*65.8*/("""alert("""),_display_(/*65.15*/Messages("ela_login.sucesso_login")),format.raw/*65.50*/(""");
			"""),format.raw/*66.4*/("""}"""),format.raw/*66.5*/("""
	    """),format.raw/*67.6*/("""</script>

	    <script type="text/javascript">
       function passageiro()"""),format.raw/*70.29*/("""{"""),format.raw/*70.30*/("""
		   """),format.raw/*71.6*/("""document.getElementById('infoMotorista').style.visibility = 'hidden';
		"""),format.raw/*72.3*/("""}"""),format.raw/*72.4*/("""
	   """),format.raw/*73.5*/("""function motorista()"""),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
		   """),format.raw/*74.6*/("""document.getElementById('infoMotorista').style.visibility = 'visible';
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""

       """),format.raw/*77.8*/("""function cadastro()"""),format.raw/*77.27*/("""{"""),format.raw/*77.28*/("""
			"""),format.raw/*78.4*/("""document.getElementById('loginCadastroBox').innerHTML = document.getElementById('divCadastro').innerHTML;
       """),format.raw/*79.8*/("""}"""),format.raw/*79.9*/("""

       """),format.raw/*81.8*/("""function login()"""),format.raw/*81.24*/("""{"""),format.raw/*81.25*/("""
		"""),format.raw/*82.3*/("""document.getElementById('loginCadastroBox').innerHTML = document.getElementById('divLogin').innerHTML;
       """),format.raw/*83.8*/("""}"""),format.raw/*83.9*/("""

       """),format.raw/*85.8*/("""function start()"""),format.raw/*85.24*/("""{"""),format.raw/*85.25*/("""
       	"""),format.raw/*86.9*/("""login();
       """),format.raw/*87.8*/("""}"""),format.raw/*87.9*/("""

       """),format.raw/*89.8*/("""window.onload = start;
    </script>
	<link rel="icon" type="img/ico" href="assets/SBAdminTemplate/img/favicon.ico">
	</head>
	<body>
	<br/>
	<img src="assets/CreativeTemplate/img/logo_curso.png" style="margin-left: 20px;">

	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-5" align="left" style="margin-left: 20px;">
				<h1 class="text-faded">
					<span style="color: #F33"><br/>
       		      <span style="color: #F63">"""),_display_(/*102.43*/Messages("tela_login.cabecalho")),format.raw/*102.75*/("""</span><span style="color: rgba(255,102,51,0.7)"><span style="color: rgba(255,51,51,0.7)"> </span></span></h1>
		        <h2 class="text-faded">"""),_display_(/*103.35*/Messages("tela_login.subtitulo")),format.raw/*103.67*/("""</h2>
				<img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*104.106*/Messages("tela_login.listagem1")),format.raw/*104.138*/("""</h4>
				<br/>
		        <img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*106.112*/Messages("tela_login.listagem2")),format.raw/*106.144*/("""</h4>
		        <br/>
		        <img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*108.112*/Messages("tela_login.listagem3")),format.raw/*108.144*/("""</h4>
			</div>

		<div class="col-lg-2">
			<div class="container-fluid">
			</div>
		</div>
		<div id="loginCadastroBox" class="col-lg-4" style="border: 1px solid #888; border-radius: 20px; vertical-align: center; background: #000; filter:alpha(opacity=80); opacity: 0.8; margin-left: 80px; text-align: center; color: white;">
	    </div>

			<div id="divLogin" style="display: none">

		"""),_display_(/*120.4*/helper/*120.10*/.form(action = routes.AutenticacaoController.efetuaLogin())/*120.69*/ {_display_(Seq[Any](format.raw/*120.71*/("""
				"""),format.raw/*121.5*/("""<img src="assets/CreativeTemplate/img/logo_vumbora.png" width="300">
				"""),_display_(/*122.6*/helper/*122.12*/.inputText(formularioAutenticacao("matricula"), '_label -> Messages("tela_login.login"))),format.raw/*122.100*/("""
				"""),_display_(/*123.6*/helper/*123.12*/.inputPassword(formularioAutenticacao("senha"), '_label -> Messages("global.senha"))),format.raw/*123.96*/("""
				"""),format.raw/*124.5*/("""<input type="submit" value="Login" class="btn btn-default btn-xl"></input>
			""")))}),format.raw/*125.5*/("""
				"""),format.raw/*126.5*/("""<a class="btn" onclick="cadastro()">"""),_display_(/*126.42*/Messages("tela_login.nao_cadastrado")),format.raw/*126.79*/("""</a>
			</div>
</div>
		<div id="divCadastro" style="display: none">
				"""),_display_(/*130.6*/helper/*130.12*/.form(action = routes.AutenticacaoController.cadastraUsuario())/*130.75*/ {_display_(Seq[Any](format.raw/*130.77*/("""
				"""),format.raw/*131.5*/("""<img src="assets/CreativeTemplate/img/logo_vumbora.png" width="300">
				"""),_display_(/*132.6*/helper/*132.12*/.inputText(formularioAutenticacao("nome"), '_label ->  Messages("global.nome"))),format.raw/*132.91*/("""
				"""),_display_(/*133.6*/helper/*133.12*/.inputText(formularioAutenticacao("matricula"), '_label -> Messages("global.matricula"))),format.raw/*133.100*/("""
				"""),_display_(/*134.6*/helper/*134.12*/.inputText(formularioAutenticacao("numeroDeTelefone"), '_label -> Messages("global.telefone"))),format.raw/*134.106*/("""
				"""),_display_(/*135.6*/helper/*135.12*/.inputText(formularioAutenticacao("email"), '_label -> "Email")),format.raw/*135.75*/("""
				"""),_display_(/*136.6*/helper/*136.12*/.inputPassword(formularioAutenticacao("senha"), '_label -> Messages("global.senha"))),format.raw/*136.96*/("""
				"""),_display_(/*137.6*/helper/*137.12*/.inputText(formularioEndereco("rua"), '_label -> Messages("global.rua"))),format.raw/*137.84*/("""
				"""),_display_(/*138.6*/helper/*138.12*/.select(formularioEndereco("bairro"), helper.options(bairros), '_label -> Messages("global.bairro"))),format.raw/*138.112*/("""
				"""),_display_(/*139.6*/helper/*139.12*/.select(formularioAutenticacao("numeroVagas"), helper.options(Seq(Messages("tela_login.sem_carro"),"1","2","3","4","5","6","7","8")), '_label -> Messages("tela_login.vagas"))),format.raw/*139.186*/("""
				"""),format.raw/*140.5*/("""<input type="submit" value="""),_display_(/*140.33*/Messages("tela_login.cadastrar")),format.raw/*140.65*/(""" """),format.raw/*140.66*/("""class="btn btn-default btn-xl"></input>
			</br>
				<a class="btn" onclick="login()">"""),_display_(/*142.39*/Messages("tela_login.sou_cadastrado")),format.raw/*142.76*/("""</a>
				</div>
				""")))}),format.raw/*144.6*/("""
			"""),format.raw/*145.4*/("""</div>
		</div>

		<!-- jQuery -->
	    <script src="assets/CreativeTemplate/js/jquery.js"></script>

	    <!-- Bootstrap Core JavaScript -->
	    <script src="assets/CreativeTemplate/js/bootstrap.min.js"></script>
	    <script src="assets/CreativeTemplate/js/bootstrap-switch/dist/js/bootstrap-switch.js"></script>
	    <script src="assets/CreativeTemplate/js/bootstrap-switch/dist/js/bootstrap-switch.min.js"></script>

	    <!-- Plugin JavaScript -->
	    <script src="assets/CreativeTemplate/js/jquery.easing.min.js"></script>
	    <script src="assets/CreativeTemplate/js/jquery.fittext.js"></script>
	    <script src="assets/CreativeTemplate/js/wow.min.js"></script>

	    <!-- Custom Theme JavaScript -->
	    <script src="assets/CreativeTemplate/js/creative.js"></script>
	</body>
</html>
""")))}),format.raw/*165.2*/("""
"""))
      }
    }
  }

  def render(formularioAutenticacao:Form[Dados],formularioEndereco:Form[Endereco],bairros:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(formularioAutenticacao,formularioEndereco,bairros)

  def f:((Form[Dados],Form[Endereco],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (formularioAutenticacao,formularioEndereco,bairros) => apply(formularioAutenticacao,formularioEndereco,bairros)

  def ref: this.type = this

}


}

/**/
object telaLoginCadastro extends telaLoginCadastro_Scope0.telaLoginCadastro
              /*
                  -- GENERATED --
                  DATE: Thu May 05 01:05:33 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/telaLoginCadastro.scala.html
                  HASH: ce6857ac3a04fc86aab3f654af368bf2e8ca8972
                  MATRIX: 802->1|993->97|1021->100|1065->136|1103->137|1131->139|2875->1855|2904->1856|2939->1864|3072->1970|3100->1971|3134->1978|3167->1983|3196->1984|3228->1989|3272->2006|3300->2007|3331->2011|3365->2017|3394->2018|3426->2023|3470->2040|3498->2041|3530->2046|3574->2062|3603->2063|3635->2068|3706->2112|3734->2113|3768->2120|3882->2206|3911->2207|3946->2215|3980->2222|4039->2260|4075->2269|4103->2270|4136->2276|4225->2337|4254->2338|4289->2346|4323->2353|4379->2388|4412->2394|4440->2395|4473->2401|4577->2477|4606->2478|4639->2484|4738->2556|4766->2557|4798->2562|4846->2582|4875->2583|4908->2589|5008->2662|5036->2663|5072->2672|5119->2691|5148->2692|5179->2696|5319->2809|5347->2810|5383->2819|5427->2835|5456->2836|5486->2839|5623->2949|5651->2950|5687->2959|5731->2975|5760->2976|5796->2985|5839->3001|5867->3002|5903->3011|6380->3460|6434->3492|6607->3637|6661->3669|6801->3780|6856->3812|7012->3939|7067->3971|7229->4104|7284->4136|7702->4527|7718->4533|7787->4592|7828->4594|7861->4599|7962->4673|7978->4679|8089->4767|8122->4773|8138->4779|8244->4863|8277->4868|8387->4947|8420->4952|8485->4989|8544->5026|8645->5100|8661->5106|8734->5169|8775->5171|8808->5176|8909->5250|8925->5256|9026->5335|9059->5341|9075->5347|9186->5435|9219->5441|9235->5447|9352->5541|9385->5547|9401->5553|9486->5616|9519->5622|9535->5628|9641->5712|9674->5718|9690->5724|9784->5796|9817->5802|9833->5808|9956->5908|9989->5914|10005->5920|10202->6094|10235->6099|10291->6127|10345->6159|10375->6160|10490->6247|10549->6284|10601->6305|10633->6309|11461->7106
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|82->51|82->51|82->51|83->52|85->54|85->54|87->56|90->59|90->59|91->60|91->60|91->60|92->61|92->61|93->62|95->64|95->64|96->65|96->65|96->65|97->66|97->66|98->67|101->70|101->70|102->71|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|108->77|108->77|108->77|109->78|110->79|110->79|112->81|112->81|112->81|113->82|114->83|114->83|116->85|116->85|116->85|117->86|118->87|118->87|120->89|133->102|133->102|134->103|134->103|135->104|135->104|137->106|137->106|139->108|139->108|151->120|151->120|151->120|151->120|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|156->125|157->126|157->126|157->126|161->130|161->130|161->130|161->130|162->131|163->132|163->132|163->132|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|171->140|173->142|173->142|175->144|176->145|196->165
                  -- GENERATED --
              */
          