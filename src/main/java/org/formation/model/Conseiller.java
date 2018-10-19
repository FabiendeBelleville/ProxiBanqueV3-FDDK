package org.formation.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Fabien & Diea ; Elle correspond au model de fiche Conseiller
 *
 */
@XmlRootElement
@Entity
@Table(name = "conseiller")
public class Conseiller {
	// Attributs

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String login;
	private String password;
	// One Conseiller To Many Clients
	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	Set<Client> clientsDuConseiller = new HashSet<>();

	// Constructeur
	public Conseiller() {
	}

	public Conseiller(Long id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Set<Client> getClientsDuConseiller() {
//		return clientsDuConseiller;
//	}
//
//	public void setClientsDuConseiller(Set<Client> clientsDuConseiller) {
//		this.clientsDuConseiller = clientsDuConseiller;
//	}

	// methodes
//	public void addClient(Client c) {
//		clientsDuConseiller.add(c);
//		c.setConseiller(this);
//	}

	@Override
	public String toString() {
		return "Conseiller [login=" + login + "]";
	}

}
