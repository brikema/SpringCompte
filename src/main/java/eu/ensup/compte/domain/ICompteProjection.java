package eu.ensup.compte.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Compte.class)
public interface ICompteProjection {
    public Long getCode();
    public double getSolde();
}
