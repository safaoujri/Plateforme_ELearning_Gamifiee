package pfa.utilisateurservice.criteria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pfa.utilisateurservice.entity.Role;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UtilisateurCriteria {
    private String nom;
    private String prenom;
    private Role role;
    private Set<Long> interetsIds;
}
