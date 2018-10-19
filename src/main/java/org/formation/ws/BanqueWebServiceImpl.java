package org.formation.ws;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.IClientService;
import org.formation.service.ICompteService;
import org.formation.service.IConseillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Diea et Fabien : BanqueWebServiceImpl implements IBanqueWebService :
 *         les méthodes sont coddées pour accéder aux différents services. La
 *         partie Web Service étant bien séparée, la place est prête pour la
 *         mise en œuvre de la technologie JSP Servlet
 *
 */
@Service("banqueWebService")
public class BanqueWebServiceImpl implements IBanqueWebService {
	@Autowired
	private IClientService clientService;

	@Autowired
	private ICompteService compteService;

	@Autowired
	private IConseillerService conseillerService;

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
		compteService.faireVirement(compteService.findCompteById(emetteur), compteService.findCompteById(destinataire),
				montant);
	}

	// Conseiller
	@Override
	public void createConseiller(Conseiller c) {
		conseillerService.createConseiller(c);
	}

	@Override
	public Conseiller findConseillerById(String id) {
		return conseillerService.findConseillerById(id);
	}

}
