package com.job.finderr.model.ws;

import com.job.finderr.bean.Individu;
import com.job.finderr.model.service.IndividuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job.finder/individu")
public class IndividuRest {

    @GetMapping("/reference/{reference}")
    public Individu findByReference(@PathVariable String reference) {
        return individuService.findByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Individu individu) {

        return individuService.save(individu);
    }

    @GetMapping("/")
    public List<Individu> findAll() {
        return individuService.findAll();
    }

    @Autowired
    private IndividuService individuService;
}
