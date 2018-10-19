package org.formation.dao;

import org.formation.model.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author Fabien & Diea ; ConseillerDao extends JpaRepository. Ainsi les méthodes
 *         de base du CRUD sont implémentées pour la table conseiller.
 *
 */
public interface ConseillerDao extends JpaRepository<Conseiller, Integer>{

}
