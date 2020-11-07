package com.job.finderr.model.service;

import com.job.finderr.bean.Anonce;
import com.job.finderr.bean.Entreprise;

import java.util.List;

public interface AnonceService {
   public Anonce findByEntreprise(Entreprise entreprise);
   public List<Anonce> findAll();
   public int save(Anonce anonce);
   public int applyToAnnonce(String annonceCode,String individuReference);
}
