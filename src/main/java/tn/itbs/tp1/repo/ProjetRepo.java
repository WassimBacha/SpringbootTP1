package tn.itbs.tp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.itbs.tp1.entities.Projet;

public interface ProjetRepo extends JpaRepository<Projet, Integer> {
}
