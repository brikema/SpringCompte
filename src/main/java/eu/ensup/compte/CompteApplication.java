package eu.ensup.compte;

import eu.ensup.compte.config.PasswordConfig;
import eu.ensup.compte.domain.Compte;
import eu.ensup.compte.domain.ERole;
import eu.ensup.compte.domain.ETypeCompte;
import eu.ensup.compte.domain.User;
import eu.ensup.compte.repository.CompteRepository;
import eu.ensup.compte.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration repositoryRestConfiguration, UserRepository userRepository, PasswordConfig passwordConfig){
		return args -> {
			// TODO : voir pourquoi l'id est visible par dégaut sans la ligne usivante
			repositoryRestConfiguration.exposeIdsFor(Compte.class);

			userRepository.save(User.builder().username("admin").password(passwordConfig.passwordEncoder().encode("admin")).role(ERole.ROLE_ADMIN).build());
			userRepository.save(User.builder().username("user").password(passwordConfig.passwordEncoder().encode("user")).role(ERole.ROLE_USER).build());
			compteRepository.save(new Compte(null, 980000, new Date(), ETypeCompte.EPARGNE, "Jean Paul"));
			compteRepository.save(new Compte(null, 120005, new Date(), ETypeCompte.GRATUIT, "Jean Christophe"));
			compteRepository.save(new Compte(null, 55585021, new Date(), ETypeCompte.COURANT, "Jean Marc"));
			compteRepository.save(new Compte(null, 111203558, new Date(), ETypeCompte.COURANT, "Jean Paul"));
			compteRepository.findAll().forEach(cp -> {
				System.out.println(cp.getType());
				System.out.println(cp.getSolde());
			});
		};
	}
}
