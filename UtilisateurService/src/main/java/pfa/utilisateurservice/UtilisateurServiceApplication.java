package pfa.utilisateurservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import pfa.utilisateurservice.service.Impl.UtilisateurService;

@SpringBootApplication
@EnableDiscoveryClient
public class UtilisateurServiceApplication  {


   @Bean
   CommandLineRunner init(UtilisateurService utilisateurService) {
       return args -> {
//           Etudiant etudiant = new Etudiant();
//           etudiant.setNom("Jon djDe");
//           etudiant.setPrenom("Dkde");
//           etudiant.setEmail("jodkfn@de.es");
//           utilisateurService.save(etudiant);


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
