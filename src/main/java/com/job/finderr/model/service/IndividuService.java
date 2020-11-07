package com.job.finderr.model.service;

import com.job.finderr.bean.Individu;

import java.util.List;

public interface IndividuService {
    public Individu findByReference(String reference);
    public int save(Individu individu);
    public List<Individu> findAll();
}
