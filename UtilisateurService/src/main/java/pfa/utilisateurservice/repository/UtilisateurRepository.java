package pfa.utilisateurservice.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfa.utilisateurservice.model.Utilisateur;

@Repository
@Primary

public interface UtilisateurRepository<U extends Utilisateur> extends JpaRepository<Utilisateur, Long> {
//    Optional<Utilisateur> findByEmail(String email);

}
