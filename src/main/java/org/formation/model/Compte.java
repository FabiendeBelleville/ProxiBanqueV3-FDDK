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
//metrte en unique
	int numCpt;
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

	public int getNumCpt() {
		return numCpt;
	}

	public void setNumCpt(int numCpt) {
		this.numCpt = numCpt;
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

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numCpt=" + numCpt + ", dateOuverture=" + dateOuverture + ", solde=" + solde
				+ ", getDateOuverture()=" + getDateOuverture() + ", getId()=" + getId() + ", getNumCpt()=" + getNumCpt()
				+ ", getSolde()=" + getSolde() + "]";
	}

}
