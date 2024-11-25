package pfa.utilisateurservice.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("ETUDIANT")

public class Etudiant extends Utilisateur{

    private int niveau ;
    private int pointsExp;
    private int classement;
    private int coursTermines;
    private int nombreMiniJeuxTermines;
}
