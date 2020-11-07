package com.job.finderr.model.service;

import com.job.finderr.bean.Entreprise;


import java.util.List;

public interface EntrepriseService {
   public Entreprise findByNom(String nom);
   public List<Entreprise> findAll();
   public int save(Entreprise entreprise);
}
