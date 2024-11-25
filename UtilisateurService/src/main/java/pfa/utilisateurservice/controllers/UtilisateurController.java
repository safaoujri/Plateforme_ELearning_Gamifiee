package pfa.utilisateurservice.controllers;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfa.utilisateurservice.model.Etudiant;
import pfa.utilisateurservice.model.Professeur;
import pfa.utilisateurservice.model.Utilisateur;
import pfa.utilisateurservice.service.EtudiantService;
import pfa.utilisateurservice.service.ProfesseurService;
import pfa.utilisateurservice.service.UtilisateurService;

import java.util.List;

@RestController

public class UtilisateurController {
    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private ProfesseurService professeurService;

    //CRUD pour les etudiants
    @GetMapping("/etudiants")
    public List<Utilisateur> getEtudiants() {
        return etudiantService.findAll();
    }
    @PostMapping("/etudiants")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.save(etudiant);
    }

//    @GetMapping("/etudiants/{id}")
//    public Etudiant getEtudiantById(@PathVariable Long id) {
//        return etudiantService.findById(id).orElse(null);
//
//    }

    @DeleteMapping("/etudiants/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.delete(id);
    }

    // CRUD pour les professeurs
    @GetMapping("/professeurs")
    public List<Utilisateur> getAllProfesseurs() {
        return professeurService.findAll();
    }

    @PostMapping("/professeurs")
    public Professeur createProfesseur(@RequestBody Professeur professeur) {
        return professeurService.save(professeur);
    }

//    @GetMapping("/professeurs/{id}")
//    public Professeur getProfesseurById(@PathVariable Long id) {
//        return professeurService.findById(id).orElse(null);
//    }

    @DeleteMapping("/professeurs/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        professeurService.delete(id);
    }





}
