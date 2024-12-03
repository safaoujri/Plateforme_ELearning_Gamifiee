package pfa.utilisateurservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurRequestDto {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String photoProfil;
    private String niveauEtudes;
    private Set<Long> interetsIds;

}
