package com.job.finderr.model.dao;

import com.job.finderr.bean.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseDao extends JpaRepository<Entreprise,Long> {

    public Entreprise findByNom(String nom);
    
}
