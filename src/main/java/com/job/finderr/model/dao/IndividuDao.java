package com.job.finderr.model.dao;

import com.job.finderr.bean.Individu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividuDao extends JpaRepository<Individu,Long> {

    public Individu findByReference(String reference);
    
}
