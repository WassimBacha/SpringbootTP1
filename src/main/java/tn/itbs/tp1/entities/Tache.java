package tn.itbs.tp1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private Date dateEcheance;

    //@Enumerated(EnumType.STRING)
    private String statut;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet Projet;



    @OneToMany(mappedBy = "Tache", cascade = CascadeType.ALL)
    private List<Etiquette> etiquettes;

    public enum StatutTache {
        EnAttente,
        EnCours,
        Terminée
    }


}

