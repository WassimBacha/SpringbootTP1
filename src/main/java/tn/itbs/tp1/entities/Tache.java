package tn.itbs.tp1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Tache {
    @Id
    private int id;
    private String titre;
    private String description;
    private Date dateEcheance;
    private String statut;
}
