package com.job.finderr.model.ws;

import com.job.finderr.bean.Anonce;
import com.job.finderr.bean.Entreprise;
import com.job.finderr.model.service.AnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job.finder/anonce")
public class AnonceRest {

    @Autowired
    private AnonceService anonceService;

    @GetMapping("/entreprise/{entreprise}")
    public Anonce findByEntreprise(@PathVariable Entreprise entreprise) {
        return anonceService.findByEntreprise(entreprise);
    }

    @GetMapping("/")
    public List<Anonce> findAll() {
        return anonceService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Anonce anonce) {
        return anonceService.save(anonce);
    }

    @PostMapping("/applytoannonce/annonceCode/{annonceCode}/individuReference/{individuReference}")
    public int applyToAnnonce(@PathVariable String annonceCode,@PathVariable String individuReference){
        return anonceService.applyToAnnonce(annonceCode,individuReference);
    };
}
