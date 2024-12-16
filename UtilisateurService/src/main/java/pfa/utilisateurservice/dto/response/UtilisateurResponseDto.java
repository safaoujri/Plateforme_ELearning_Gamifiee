package pfa.utilisateurservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurResponseDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String photoProfil;
    private String niveauEtudes;
    private Set<InteretResponseDto> interets;

    // Getters et setters

}
