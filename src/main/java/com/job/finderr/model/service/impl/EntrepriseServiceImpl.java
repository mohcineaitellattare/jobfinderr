package com.job.finderr.model.service.impl;


import com.job.finderr.bean.Entreprise;
import com.job.finderr.model.dao.EntrepriseDao;
import com.job.finderr.model.dao.IndividuDao;

import com.job.finderr.model.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    private EntrepriseDao entrepriseDao;

    @Override
    public Entreprise findByNom(String nom) {
        return entrepriseDao.findByNom(nom);
    }

    @Override
    public int save(Entreprise entreprise) {
        Entreprise entreprise1=entrepriseDao.findByNom(entreprise.getNom());
        if(entreprise1!=null){
            System.out.println("problen in save entreprise");
            return -1;
        }
            entrepriseDao.save(entreprise);
        return 1;
    }

    @Override
    public List<Entreprise> findAll() {
        return entrepriseDao.findAll();
    }
}
