package org.formation.dao;

import org.formation.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author Fabien & Diea ; CompteDao extends JpaRepository. Ainsi les méthodes
 *         de base du CRUD sont implémentées pour les tables des comptes
 *
 */
public interface CompteDao extends JpaRepository<Compte, Integer> {

}
