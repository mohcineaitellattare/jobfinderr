package com.job.finderr.model.dao;

import com.job.finderr.bean.Anonce;
import com.job.finderr.bean.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnonceDao extends JpaRepository<Anonce,Long> {

    public Anonce findByEntreprise(Entreprise entreprise);
    
}
