package pfa.utilisateurservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfa.utilisateurservice.entity.Interet;

import java.util.Optional;
@Repository
public interface InteretRepository extends JpaRepository<Interet, Long> {
    Optional<Interet> findByNom(String nom);
}
