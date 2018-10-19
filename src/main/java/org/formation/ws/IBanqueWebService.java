package org.formation.ws;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.formation.model.Client;
import org.formation.model.Conseiller;

/**
 * 
 * @author Diea et Fabien : IBanqueWebService est l'interface de notre Web
 *         Service. Cette interface contient la signature des différentes
 *         méthodes disponibles. les méthodes sont coddées dans son
 *         implémentation. La partie Web Service étant bien séparée, la place
 *         est prête pour la mise en œuvre de la technologie JSP Servlet.
 *
 */
@Path("/banque")
public interface IBanqueWebService {

	@POST
	@Path("/clients/")
	public void createClient(Client c);

	@GET
	@Path("/clients/{id}/")
	public Client findById(@PathParam("id") String id);

	@GET
	@Path("/clients")
	public List<Client> getClients();

	@PUT
	@Path("/clients/")
	public void updateClient(Client c);

	@PUT
	@Path("/virement/emetteur/{emetteur}/destinataire/{destinataire}/montant/{montant}")
	public void faireVirement(@PathParam("emetteur") Integer emetteur, @PathParam("destinataire") Integer destinataire,
			@PathParam("montant") double montant);

	@DELETE
	@Path("/clients/{id}/")
	public Client deleteClient(Client c);

	// Conseiller
	@POST
	@Path("/conseillers/")
	public void createConseiller(Conseiller c);

	@GET
	@Path("/conseillers/{id}/")
	public Conseiller findConseillerById(@PathParam("id") String id);
}
