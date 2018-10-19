package org.formation.service;

import java.util.List;

import org.formation.dao.CompteDao;
import org.formation.model.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Fabien et Diea CompteServiceImpl implements ICompteService. ce sont
 *         les méthodes qui permettent de traiter les données et d'appeler les
 *         méthodes du DAO correspondant
 *
 */
@Service("compteService")
public class CompteServiceImpl implements ICompteService {

	@Autowired
	private CompteDao compteDao;

	@Override
	public void createCompte(Compte cpt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte findCompteById(Integer id) {
		return compteDao.findById(id.intValue()).get();
	}

	@Override
	public List<Compte> findAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompte(Compte cpt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte deleteCompte(Compte cpt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void faireVirement(Compte emetteur, Compte destinataire, double montant) {
		emetteur.setSolde(emetteur.getSolde() - montant);
		destinataire.setSolde(destinataire.getSolde() + montant);
		compteDao.save(emetteur);
		compteDao.save(destinataire);
	}

}