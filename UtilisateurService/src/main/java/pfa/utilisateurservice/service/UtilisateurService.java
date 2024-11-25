package pfa.utilisateurservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import pfa.utilisateurservice.model.Utilisateur;
import pfa.utilisateurservice.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService<T extends Utilisateur> {
    @Autowired
    @Qualifier("utilisateurRepository")

    private UtilisateurRepository<T> repository;

    public List<Utilisateur> findAll() {
        return repository.findAll();
    }
    public Utilisateur findById(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Étudiant non trouvé avec l'ID : " + id));
    }
    public T save(T user) {
        return repository.save(user);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }




}
