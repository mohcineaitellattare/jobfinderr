package com.job.finderr.model.ws;

import com.job.finderr.bean.Entreprise;
import com.job.finderr.model.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job.finder/entreprise")
public class EntrepriseRest {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/nom/{nom}")
    public Entreprise findByNom(@PathVariable String nom) {
        return entrepriseService.findByNom(nom);
    }

    @GetMapping("/")
    public List<Entreprise> findAll() {
        return entrepriseService.findAll();
    }

    @PostMapping("/")
    public void save(@RequestBody Entreprise entreprise) {
        entrepriseService.save(entreprise);
    }
}
