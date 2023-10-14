package tn.itbs.tp1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Utulisateur {
	
	@Id
	private int Id ;
	private String  nom ;
	private String prenom ;
	private String login ; 
	private String MDP ;
	private String email ; 
	
	
	

}
