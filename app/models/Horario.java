package models;

import com.avaje.ebean.Model;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.*;

import java.io.Serializable;

import javax.persistence.*;
		import play.mvc.Controller;

@Entity
public class Horario extends Model implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private int dia;
	@Column
	private int hora;
	@Enumerated(EnumType.STRING)
	private TipoCarona tipo;
	@Transient
	private final String[][] dias = {MensagensSistema.SEGUNDA, MensagensSistema.TERCA, MensagensSistema.QUARTA, MensagensSistema.QUINTA, MensagensSistema.SEXTA};
	public static Finder<Long, Horario> find = new Finder<>(Horario.class);

	public Horario(){}
	public Horario(String dia, int hora, TipoCarona tipo) {
		setDia(dia);
		this.hora = hora;
		this.tipo = tipo;
	}

	public Horario(String dia, int hora) {
		setDia(dia);
		this.hora = hora;
	}

	public Long getId() {
		return id;
	}

	public String getDia() {
        Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
		return dias[dia - 2][idioma.ordinal()];
	}
	
	public String getDiaAbreviado() {
      Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
      String str =  (dias[dia - 2][idioma.ordinal()]).substring(0,3);
      return str;
  }

    public int getNumeroDia(){
        return this.dia;
    }

	public void setDia(String dia) {
        Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
        for(int i =0; i < 5; i++) {
            if (dia.equals(dias[i][idioma.ordinal()]))
                this.dia = i + 2;
        }
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Dia: " + getDia() + " Hora: " + hora + "Tipo: " + tipo;
	}

	public TipoCarona getTipo() {
		return tipo;
	}

	public void setTipo(TipoCarona tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Horario))
			return false;
		Horario outroHorario = (Horario) obj;
		
		return (outroHorario.getNumeroDia() == dia) && (outroHorario.getHora() == hora);
	}

	public static void deletar(Long periodoId) {
		find.byId(periodoId).delete();
	}

}