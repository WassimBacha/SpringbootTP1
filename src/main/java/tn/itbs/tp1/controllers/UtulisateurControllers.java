package tn.itbs.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.itbs.tp1.entities.Utulisateur;
import tn.itbs.tp1.service.UtulisateurService;
//@RequestMapping("/user")

@RestController
@RequestMapping("/user")
public class UtulisateurControllers {
	
	 @Autowired
	 private UtulisateurService userServ ;

	 
	 @PostMapping("/adduser")
	 public ResponseEntity<?> addUser(@RequestBody Utulisateur user ){
		 return userServ.addUser(user);
	 }

	 

}
