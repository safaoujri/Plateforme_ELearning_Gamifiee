package pfa.utilisateurservice.service.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pfa.utilisateurservice.dto.request.UtilisateurRequestDto;
import pfa.utilisateurservice.dto.response.UtilisateurResponseDto;
import pfa.utilisateurservice.entity.Role;
import pfa.utilisateurservice.entity.Utilisateur;
import pfa.utilisateurservice.mapper.UtilisateurMapper;
import pfa.utilisateurservice.repository.UtilisateurRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final UtilisateurMapper utilisateurMapper;

    @Override
    public UtilisateurResponseDto inscrireUtilisateur(UtilisateurRequestDto utilisateurRequestDto) {
        Utilisateur utilisateur = utilisateurMapper.dtoToModel(utilisateurRequestDto);
        utilisateur.setRole(Role.ETUDIANT);
        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
        return utilisateurMapper.modelToDto(savedUtilisateur);
    }

    @Override
    public UtilisateurResponseDto mettreAJourUtilisateur(Long id, UtilisateurRequestDto utilisateurRequestDto) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Utilisateur introuvable"));

        utilisateurMapper.updateModel(utilisateurRequestDto, utilisateur);
        Utilisateur updatedUtilisateur = utilisateurRepository.save(utilisateur);
        return utilisateurMapper.modelToDto(updatedUtilisateur);
    }

    @Override
    public List<UtilisateurResponseDto> listerTousLesUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurRepository.findAll();
        return utilisateurMapper.modelToDtos(utilisateurs);
    }

    @Override
    public void supprimerUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public UtilisateurResponseDto changerRole(Long id, String nouveauRole) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Utilisateur introuvable"));

        Role role = Role.valueOf(nouveauRole.toUpperCase());
        utilisateur.setRole(role);
        Utilisateur updatedUtilisateur = utilisateurRepository.save(utilisateur);
        return utilisateurMapper.modelToDto(updatedUtilisateur);
    }
}

