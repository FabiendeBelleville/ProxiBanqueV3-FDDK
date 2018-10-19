package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Fabien & Marlon;Ceci est la classe Compte Epargne qui �tend la classe
 *         Compte;
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
//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

}
