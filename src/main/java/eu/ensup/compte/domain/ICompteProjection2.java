package eu.ensup.compte.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2", types = Compte.class)
public interface ICompteProjection2 {
    public ETypeCompte getType();
}
