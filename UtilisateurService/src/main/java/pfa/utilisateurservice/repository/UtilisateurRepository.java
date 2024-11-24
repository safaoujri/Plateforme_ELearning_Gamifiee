package pfa.utilisateurservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfa.utilisateurservice.model.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
//    Optional<Utilisateur> findByEmail(String email);

}
