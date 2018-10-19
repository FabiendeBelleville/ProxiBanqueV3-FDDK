package org.formation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Fabien et Marlon. La classe Client est l'une des classe les plus
 *         importantes du package model par son nombre d'attributs, avec leurs
 *         getters et setters associ�s ainsi qu'une m�thode toString compl�te.
 *         Elle correspond au model de fiche client.
 */
@XmlRootElement
@Entity
@Table(name = "client")
public class Client {
//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String ville;
	private double firstDepotCC;
	private double firstDepotCE;
	
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "id_cptC", unique = true)
	CompteCourant compteCourant;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "id_cptE", unique = true)
	CompteEpargne compteEpargne;

//	@ManyToOne(cascade = { CascadeType.PERSIST })
//	@JoinColumn(name = "id_conseiller")
//	Conseiller conseiller;

	public Client() {
	}

	public Client(Integer id) {
		this.idClient = id;
	}

	public Client(String nom, String prenom, String adresse, int cp, String ville, double firstDepotCC,
			double firstDepotCE, Conseiller conseiller) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = cp;
		this.ville = ville;
		this.firstDepotCC = firstDepotCC;
		this.firstDepotCE = firstDepotCE;
		// this.conseiller = conseiller;
	}

	public Client(Integer idClient, String nom, String prenom, String adresse, int cp, String ville) {
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = cp;
		this.ville = ville;
	}

	// Getters & setters
	public Integer getid() {
		return idClient;
	}

	public void setid(Integer id) {
		this.idClient = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public double getFirstDepotCC() {
		return firstDepotCC;
	}

	public void setFirstDepotCC(double firstDepotCC) {
		this.firstDepotCC = firstDepotCC;
	}

	public double getFirstDepotCE() {
		return firstDepotCE;
	}

	public void setFirstDepotCE(double firstDepotCE) {
		this.firstDepotCE = firstDepotCE;
	}

//	public Conseiller getConseiller() {
//		return conseiller;
//	}
//
//	public void setConseiller(Conseiller conseiller) {
//		this.conseiller = conseiller;
//	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

}
