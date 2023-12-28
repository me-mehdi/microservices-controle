package org.emsi.voitureservice.controller;


import java.util.List;

import org.emsi.voitureservice.client.ClientRestService;
import org.emsi.voitureservice.entities.Voiture;
import org.emsi.voitureservice.repository.VoitureRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/voitures")
public class VoitureController {

    private final VoitureRepository voitureRepository;
    private final ClientRestService clientRestService;



    @GetMapping
    public List<Voiture> findAll(){
        List<Voiture> voitures = voitureRepository.findAll();
        voitures.forEach(voiture -> voiture.setClient(clientRestService.findById(voiture.getClientId())));
        return voitures;
    }

    @GetMapping("/{id}")
    public Voiture findById(@PathVariable Long id){
        Voiture voiture = voitureRepository.findById(id).get();
        voiture.setClient(clientRestService.findById(voiture.getClientId()));
        return voiture;
    }

    @PostMapping
    public Voiture save(@RequestBody Voiture voiture){
        return voitureRepository.save(voiture);
    }
}
