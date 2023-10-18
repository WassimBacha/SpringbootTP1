package tn.itbs.tp1.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Etiquette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;


    @ManyToOne
    @JoinColumn(name = "tache_id")
    private Tache Tache;



}
