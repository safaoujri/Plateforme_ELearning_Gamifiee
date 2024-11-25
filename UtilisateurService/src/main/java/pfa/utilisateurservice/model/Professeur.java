package pfa.utilisateurservice.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PROFESSEUR")
public class Professeur extends Utilisateur {

    private int nombreDeCoursCrees;
    private int nombreDeMiniJeux;


}
