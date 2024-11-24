package pfa.utilisateurservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pfa.utilisateurservice.model.Utilisateur;
import pfa.utilisateurservice.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> findById(int id) {
        return utilisateurRepository.findById(id);
    }
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

//    public Optional<Utilisateur> trouverParEmail(String email) {
//        return utilisateurRepository.findByEmail(email);
//    }


}
