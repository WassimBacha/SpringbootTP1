package tn.itbs.tp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.itbs.tp1.entities.Tache;

public interface TacheRepo extends JpaRepository<Tache, Integer> {
}
