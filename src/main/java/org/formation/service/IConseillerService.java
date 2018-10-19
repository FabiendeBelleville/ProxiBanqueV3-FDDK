package org.formation.service;

import org.formation.model.Conseiller;

public interface IConseillerService {

	public void createConseiller(Conseiller c);

	public Conseiller findConseillerById(String id);

}
