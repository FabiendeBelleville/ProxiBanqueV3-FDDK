package org.formation.service;

import org.formation.dao.ConseillerDao;
import org.formation.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("conseillerService")
public class ConseillerServiceImpl implements IConseillerService {
	
	@Autowired
	private ConseillerDao conseillerDao;

	@Override
	public void createConseiller(Conseiller c) {
		conseillerDao.save(c);
	}

}
