package org.formation.service;

import org.formation.model.Conseiller;

/**
 * 
 * @author Fabien et Diea ; interface IClientService : ne concerne que les
 *         conseillers : c'est la déclaration des méthodes qui vont êtres
 *         implémentées dans les classes implémentations
 *
 */
public interface IConseillerService {

	public void createConseiller(Conseiller c);

	public Conseiller findConseillerById(String id);

}
