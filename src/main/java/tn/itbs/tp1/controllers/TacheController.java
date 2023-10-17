package tn.itbs.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.server.ResponseStatusException;
import tn.itbs.tp1.entities.Projet;
import tn.itbs.tp1.entities.Tache;
import tn.itbs.tp1.service.TacheService;

import java.util.Optional;

@RestController
@RequestMapping("/taches")
public class TacheController {

    @Autowired
    private TacheService tacheService;

    @PostMapping("/addProject")
    public ResponseEntity<Object> addTache(@RequestBody Tache tache) {
        return tacheService.addTache(tache);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tache> getTacheById(@PathVariable int id) {
        Optional<Tache> tache = tacheService.getTacheById(id);
        if (tache.isPresent()) {
            return ResponseEntity.ok(tache.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tache n'existe pas");
        }

    }

}
