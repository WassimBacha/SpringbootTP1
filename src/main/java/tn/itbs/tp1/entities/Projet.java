package tn.itbs.tp1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class Projet {
    @Id
    private int Id;
    private String nomprojet;
    private String description;
    private Date DateDebut;
    private Date DateFin;
}
