package org.formation;

import static org.junit.Assert.assertNotNull;

import org.formation.dao.ClientDao;
import org.formation.dao.CompteDao;
import org.formation.model.Client;
import org.formation.model.Compte;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleLayerJpaApplicationTests {

	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private CompteDao compteDao;

	@Test
	public void testClientService() {

		assertNotNull(clientDao);

	}

}
