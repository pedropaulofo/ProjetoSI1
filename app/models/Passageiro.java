package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Passageiro extends Model implements TipoUsuario {
	
	public boolean oferecePedeCarona() {
		// TODO Auto-generated method stub
		return false;
	}
	
}