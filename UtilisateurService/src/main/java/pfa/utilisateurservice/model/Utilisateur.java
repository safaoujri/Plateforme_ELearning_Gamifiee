package pfa.utilisateurservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 255)
public abstract class Utilisateur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long Id_Compte;
    public String nom_Compte;
    private String nom;
    private String prenom;
    @Column(unique = true, nullable = false)
    private String email;

    public String Mot_de_Passe;
    public String Photo_de_Profile;
    public Boolean isLocked=false;

    public Utilisateur(String alice, String mail, String password123) {
    }
}
