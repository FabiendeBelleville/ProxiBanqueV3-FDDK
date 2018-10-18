package org.formation.ws;

import java.util.List;

import org.formation.model.Client;
import org.formation.service.IClientService;
import org.formation.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("banqueWebService")
public class BanqueWebServiceImpl implements IBanqueWebService {
	@Autowired
	private IClientService clientService;
	private ICompteService compteService;

	@Override
	public Client findById(String id) {
		return clientService.findById(id);
	}

	@Override
	public List<Client> getClients() {
		return clientService.findAll();
	}

	@Override
	public void updateClient(Client c) {
		clientService.updateClient(c);
	}

	@Override
	public Client deleteClient(Client c) {

		return clientService.deleteClient(c);
	}

	@Override
	public void createClient(Client c) {
		clientService.createClient(c);
	}

	@Override
	public void faireVirement(Integer emetteur, Integer destinataire, double montant) {

	}

}
