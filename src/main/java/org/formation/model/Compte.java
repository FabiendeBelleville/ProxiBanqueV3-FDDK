package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 * @author Fabien classe parente Compte
 */
@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String dateOuverture;
	private double solde;

	public Compte() {
		super();
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}



}
