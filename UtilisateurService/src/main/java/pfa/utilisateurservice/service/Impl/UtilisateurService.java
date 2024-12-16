package pfa.utilisateurservice.service.Impl;

import pfa.utilisateurservice.dto.request.UtilisateurRequestDto;
import pfa.utilisateurservice.dto.response.UtilisateurResponseDto;

import java.util.List;

public interface UtilisateurService {
    UtilisateurResponseDto inscrireUtilisateur(UtilisateurRequestDto utilisateurRequestDto);

    UtilisateurResponseDto mettreAJourUtilisateur(Long id, UtilisateurRequestDto utilisateurRequestDto);

    List<UtilisateurResponseDto> listerTousLesUtilisateurs();

    void supprimerUtilisateur(Long id);

    UtilisateurResponseDto changerRole(Long id, String nouveauRole);
}
