package tn.itbs.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.itbs.tp1.entities.Utulisateur;
import tn.itbs.tp1.service.UtulisateurService;

public class UtulisateurControllers {
	
	 @Autowired
	 private UtulisateurService userServ ;
	 
	 @PostMapping("/addUser")
	 public ResponseEntity<Object> save(@RequestBody Utulisateur user ){
		 return userServ.addUser(user);
	 }

	 

}
