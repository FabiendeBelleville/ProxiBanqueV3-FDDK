package org.formation.service;

import java.util.List;

import org.formation.model.Compte;

public interface ICompteService {

	public void createCompte(Compte cpt);

	public Compte findCompteById(Integer id);

	public List<Compte> findAllCompte();

	public void updateCompte(Compte cpt);

	public Compte deleteCompte(Compte cpt);

	public void faireVirement(Compte emetteur, Compte destinataire, double montant);
}
