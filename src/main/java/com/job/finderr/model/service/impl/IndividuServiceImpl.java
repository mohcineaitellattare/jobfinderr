package com.job.finderr.model.service.impl;

import com.job.finderr.bean.Individu;
import com.job.finderr.model.dao.IndividuDao;
import com.job.finderr.model.service.IndividuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividuServiceImpl implements IndividuService {
    @Autowired
    private IndividuDao individuDao;

    @Override
    public Individu findByReference(String reference) {
        return individuDao.findByReference(reference);
    }

    @Override
    public void save(Individu individu) {
         individuDao.save(individu);
    }

    @Override
    public List<Individu> findAll() {
        return individuDao.findAll();
    }
}
