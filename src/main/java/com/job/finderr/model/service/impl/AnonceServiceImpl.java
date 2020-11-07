package com.job.finderr.model.service.impl;

import com.job.finderr.bean.Anonce;
import com.job.finderr.bean.Entreprise;
import com.job.finderr.bean.Individu;
import com.job.finderr.model.dao.AnonceDao;
import com.job.finderr.model.dao.IndividuDao;
import com.job.finderr.model.service.AnonceService;
import com.job.finderr.model.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class AnonceServiceImpl implements AnonceService {

    @Autowired
    private AnonceDao anonceDao;
    @Autowired
    private EntrepriseService entrepriseService;
    @Autowired
    private IndividuDao individuDao;
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
        Anonce anonce1=anonceDao.findByCode(anonce.getCode());
        Entreprise entreprise=entrepriseService.findByNom(anonce.getEntreprise().getNom());
        if(anonce1!=null){
            System.out.println("here i am||ther is a prublem in save anonce");
            return -1;
        }else if (entreprise==null){
            System.out.println("iam here");
            return -2;
        }
        List anonces= entreprise.getAnonces();
        anonces.add(anonce);
        entreprise.setAnonces(anonces);
        anonce.setEntreprise(entreprise);
        anonceDao.save(anonce);
        return 1;
    }

    @Override
    public int applyToAnnonce(String annonceCode, String individuReference) {
        Anonce anonce=anonceDao.findByCode(annonceCode);
        Individu individu=individuDao.findByReference(individuReference);
        if(anonce==null){
            System.out.println("i am in apply to annonce||can't find annonce");
            return -1;
        }else if(individu==null){
            System.out.println("i am in apply to annonce||can't find individu");
            return -2;
        }else{
            List interestedIndividiList=anonce.getIndividuInterese();
            List anonces = individu.getAnonces();
            interestedIndividiList.add(individu);
            anonce.setIndividuInterese(interestedIndividiList);
            anonces.add(anonce);
            individu.setAnonces(anonces);
            save(anonce);
            return 1;
        }
    }
}
