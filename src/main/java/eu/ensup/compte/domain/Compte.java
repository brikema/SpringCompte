package eu.ensup.compte.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private ETypeCompte type;
    private String User;
}
