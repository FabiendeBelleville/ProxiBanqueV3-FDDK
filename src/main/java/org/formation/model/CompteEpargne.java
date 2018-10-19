package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Fabien & Diea;Ceci est la classe Compte Epargne qui etend la classe
 *         Compte; Elle contien un constructeur et l'attribut tauxInteret.
 *
 */
@Entity
@Table(name = "compteepargne")
public class CompteEpargne extends Compte {

	private double tauxInteret;

	@OneToOne(mappedBy = "compteEpargne")
	Client client;

	public CompteEpargne() {
		super();
	}

	// Getters & Setters
	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

}
