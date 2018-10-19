package org.formation.dao;

import org.formation.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Fabien & Diea ; ClientDao extends JpaRepository. Ainsi les méthodes
 *         de base du CRUD sont implémentées pour la table client en base de
 *         donnée
 *
 */
public interface ClientDao extends JpaRepository<Client, Integer> {

}
