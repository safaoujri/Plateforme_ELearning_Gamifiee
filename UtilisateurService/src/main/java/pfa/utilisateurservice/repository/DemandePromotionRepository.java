package pfa.utilisateurservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfa.utilisateurservice.entity.DemandePromotion;
import pfa.utilisateurservice.entity.StatutDemande;
import pfa.utilisateurservice.entity.Utilisateur;

@Repository
public interface DemandePromotionRepository extends JpaRepository<DemandePromotion, Long> {
    boolean existsByUtilisateurAndStatut(Utilisateur utilisateur, StatutDemande statut);
}

