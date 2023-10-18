package tn.itbs.tp1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nomprojet;
    private String description;
    private Date DateDebut;
    private Date DateFin;


    @ManyToOne
    @JoinColumn(name = "Utulisateur_id")
    private Utulisateur Utulisateur;



   //@one to many relation with tache
    @OneToMany(mappedBy = "Projet", cascade = CascadeType.ALL)
    private List<Tache> Tache;



}
