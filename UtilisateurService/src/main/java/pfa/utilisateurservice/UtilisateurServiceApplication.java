package pfa.utilisateurservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import pfa.utilisateurservice.model.Utilisateur;
import pfa.utilisateurservice.service.UtilisateurService;

@SpringBootApplication
@EnableDiscoveryClient
public class UtilisateurServiceApplication  {


   @Bean
   CommandLineRunner init(UtilisateurService utilisateurService) {
       return args -> {
           Utilisateur utilisateur = new Utilisateur();
           utilisateur.setNom("Safaaaa");
           utilisateur.setPrenom("Oaa");
           utilisateur.setEmail("saaa@gmail.com");
           utilisateurService.save(utilisateur);

       };
//       // Afficher tous les utilisateurs pour vérifier l'insertion
//       utilisateurService.findAll().forEach(utilisateur -> {
//           System.out.println("Utilisateur ajouté : " + utilisateur.getNom() + " - " + utilisateur.getEmail());
//       });



   }

    public static void main(String[] args) {
        SpringApplication.run(UtilisateurServiceApplication.class, args);
    }

}
