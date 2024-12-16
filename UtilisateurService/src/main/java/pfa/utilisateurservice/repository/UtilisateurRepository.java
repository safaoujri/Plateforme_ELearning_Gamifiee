package pfa.utilisateurservice.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfa.utilisateurservice.entity.Role;
import pfa.utilisateurservice.entity.Utilisateur;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByEmail(String email);
    List<Utilisateur> findByRole(Role role);
    List<Utilisateur> findByInteretsScoresKeyIn(Set<String> interets);  // Filtrage par centres d'intérêt
}
