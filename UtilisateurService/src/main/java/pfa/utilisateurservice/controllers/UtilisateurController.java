package pfa.utilisateurservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pfa.utilisateurservice.model.Utilisateur;
import pfa.utilisateurservice.service.UtilisateurService;

import java.util.List;

@RestController

public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

//    @GetMapping("/{email}")
//    public ResponseEntity<Utilisateur> obtenirUtilisateurParEmail(@PathVariable String email) {
//        return utilisateurService.trouverParEmail(email)
//                .map(utilisateur -> new ResponseEntity<>(utilisateur, HttpStatus.OK))
//                .orElseThrow(() -> new ResourceNotFoundException("Utilisateur introuvable avec l'email : " + email));
//    }
    @GetMapping("/users")
    public List findAll() {
        return utilisateurService.findAll();
    }
    @GetMapping("/user/{id}")
    public Utilisateur findById(@PathVariable int id) throws Exception{
        return this.utilisateurService.findById(id).orElseThrow(()-> new
                Exception("Utilisateur not found"));
    }

}
