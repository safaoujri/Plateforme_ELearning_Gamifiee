package pfa.utilisateurservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public  class Utilisateur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role; // Étudiant, Professeur, Admin

    private String photoProfil;
    private String niveauEtudes;

    // Relation avec les centres d'intérêt (vecteurs de scores)
    @ElementCollection
    @CollectionTable(name = "utilisateur_interets", joinColumns = @JoinColumn(name = "utilisateur_id"))
    @MapKeyColumn(name = "interet")
    @Column(name = "score")
    private Map<String, Integer> interetsScores = new HashMap<>(); // Map des centres d'intérêt avec leur score

    // Getters et setters
}

