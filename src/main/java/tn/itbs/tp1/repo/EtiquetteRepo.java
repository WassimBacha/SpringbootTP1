package tn.itbs.tp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.itbs.tp1.entities.Etiquette;


public interface EtiquetteRepo extends JpaRepository<Etiquette, Integer>  {
}
