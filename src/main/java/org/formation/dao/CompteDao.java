package org.formation.dao;

import org.formation.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteDao extends JpaRepository<Compte, Integer> {

}
