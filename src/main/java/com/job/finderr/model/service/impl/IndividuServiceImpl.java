package com.job.finderr.model.service.impl;

import com.job.finderr.bean.Individu;
import com.job.finderr.model.dao.IndividuDao;
import com.job.finderr.model.service.IndividuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IndividuServiceImpl implements IndividuService {
    @Autowired
    private IndividuDao individuDao;

    @Override
    public Individu findByReference(String reference) {
        return individuDao.findByReference(reference);
    }

    @Override
    public int save(Individu individu) {
         Individu individu1=individuDao.findByReference(individu.getReference());
         if (individu1!=null){
             System.out.println("there is a problem in save individu");
             return -1;
         }
        individuDao.save(individu);
        return 1;
    }

    @Override
    public List<Individu> findAll() {
        return individuDao.findAll();
    }
}
