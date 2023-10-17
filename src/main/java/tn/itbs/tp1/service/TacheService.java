package tn.itbs.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.itbs.tp1.entities.Tache;
import tn.itbs.tp1.repo.TacheRepo;

import java.util.List;
import java.util.Optional;

@Service
public class TacheService {

    @Autowired
    private TacheRepo tacheRepo;

    public ResponseEntity<Object> addTache(Tache tache) {
        tacheRepo.findById(tache.getId())
                .ifPresentOrElse(p -> {
                            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tache existe deja");
                        },
                        () -> {
                            tacheRepo.save(tache);
                        });

        return ResponseEntity.ok().body("ajout avec succe");
    }
    public Optional<Tache> getTacheById(int id){
        return tacheRepo.findById(id);
    }

    public List<Tache> getAllTaches(){
        return (List<Tache>) tacheRepo.findAll();
    }

    public Tache updateTache(int id, Tache tache){
        tacheRepo.findById(id)
                .ifPresentOrElse(
                        p -> {
                            tache.setId(id);
                            tacheRepo.save(tache);
                        },
                        () -> {
                            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tache n'existe pas");
                        });

        return tache;

    }
    public void deleteTache(int id) {
        tacheRepo.deleteById(id);
    }
    public List<Tache> getTachesByProjectId(int id) {

        return null;
    }
    public Tache updateTacheStatus(int id, String newStatus) {
        Optional<Tache> optionalTache = tacheRepo.findById(id);
        if (optionalTache.isPresent()) {
            Tache tache = optionalTache.get();
            tache.setStatut(newStatus);
            return tacheRepo.save(tache);
        }
        return null;
    }

}
