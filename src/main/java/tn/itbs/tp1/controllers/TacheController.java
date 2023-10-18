package tn.itbs.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.server.ResponseStatusException;
import tn.itbs.tp1.entities.Projet;
import tn.itbs.tp1.entities.Tache;
import tn.itbs.tp1.service.TacheService;

import java.util.List;
import java.util.Optional;
//test git v3
//test git v3
@RequestMapping("/taches")


@RestController
public class TacheController {

    @Autowired
    private TacheService tacheService;

    @PostMapping("/addtache")
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
    @GetMapping
    public ResponseEntity<List<Tache>> getAllTaches() {
        List<Tache> tache = tacheService.getAllTaches();
        return ResponseEntity.ok(tache);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTache(@PathVariable int id, @RequestBody Tache tache) {
        return tacheService.updateTache(id, tache);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletetache(@PathVariable int id) {
        return tacheService.deletetache(id);
    }

}
