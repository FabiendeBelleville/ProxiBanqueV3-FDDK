package org.formation.service;

import java.util.List;

import org.formation.model.Compte;

/**
 * 
 * @author Fabien et Diea ; interface IClientService : ne concerne que les
 *         comptes bancaires : c'est la déclaration des méthodes qui vont êtres
 *         implémentées dans les classes implémentations
 *
 */
public interface ICompteService {

	public void createCompte(Compte cpt);

	public Compte findCompteById(Integer id);

	public List<Compte> findAllCompte();

	public void updateCompte(Compte cpt);

	public Compte deleteCompte(Compte cpt);

	public void faireVirement(Compte emetteur, Compte destinataire, double montant);
}
