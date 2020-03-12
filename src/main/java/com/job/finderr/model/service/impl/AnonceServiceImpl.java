package com.job.finderr.model.service.impl;

import com.job.finderr.bean.Anonce;
import com.job.finderr.bean.Entreprise;
import com.job.finderr.model.dao.AnonceDao;
import com.job.finderr.model.service.AnonceService;
import com.job.finderr.model.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnonceServiceImpl implements AnonceService {

    @Autowired
    private AnonceDao anonceDao;
    @Autowired
    private EntrepriseService entrepriseService;
    @Override
    public Anonce findByEntreprise(Entreprise entreprise) {
        return anonceDao.findByEntreprise(entreprise);
    }

    @Override
    public List<Anonce> findAll() {
        return anonceDao.findAll();
    }

    @Override
    public int save(Anonce anonce) {

        Entreprise entreprise=entrepriseService.findByNom(anonce.getEntreprise().getNom());
        if (entreprise==null){
            System.out.println("fuck this shit********************************************************************");
            return -1;
        }
        anonce.setEntreprise(entreprise);
        anonceDao.save(anonce);
        return 1;
    }
}
