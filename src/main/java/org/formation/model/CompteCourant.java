package org.formation.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Fabien & Diea;Ceci est la classe Compte Courant qui etend la classe
 *         Compte; Elle contient un constructeur
 */
@Entity
@Table(name = "comptecourant")
public class CompteCourant extends Compte {

	private static double decouvertAutoriseCC = 1000;

	@OneToOne(mappedBy = "compteCourant")
	Client client;

	// Constructeur
	public CompteCourant() {
	}

	// Getters & Setters

	public static double getDecouvertAutoriseCC() {
		return decouvertAutoriseCC;
	}

	public static void setDecouvertAutoriseCC(double decouvertAutoriseCC) {
		CompteCourant.decouvertAutoriseCC = decouvertAutoriseCC;
	}

}
