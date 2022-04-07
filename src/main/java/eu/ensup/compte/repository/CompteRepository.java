package eu.ensup.compte.repository;

import eu.ensup.compte.domain.Compte;
import eu.ensup.compte.domain.ETypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {

    @RestResource(path = "/byType")
    List<Compte> findByType(@Param(value="type") ETypeCompte typeCompte);
}
