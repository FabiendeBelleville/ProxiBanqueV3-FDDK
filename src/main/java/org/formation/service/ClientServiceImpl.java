package org.formation.service;

import java.util.List;

import org.formation.dao.ClientDao;
import org.formation.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Fabien et Diea ClientServiceImpl implements IClientService. ce sont
 *         les méthodes qui permettent de traiter les données et d'appeler les
 *         méthodes du DAO correspondant
 *
 */
@Service("clientService")
public class ClientServiceImpl implements IClientService {
	@Autowired
	private ClientDao clientDao;

	@Override
	public void createClient(Client c) {
		clientDao.save(c);
	}

	@Override
	public Client findById(String id) {
		Integer idInt = Integer.valueOf(id);
		return clientDao.findById(idInt).get();
	}

	@Override
	@JsonIgnoreProperties("costMaterials")
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public void updateClient(Client c) {
		clientDao.save(c);
	}

	@Override
	public Client deleteClient(Client c) {
		clientDao.delete(c);
		return c;
	}

}
