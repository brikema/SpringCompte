package eu.ensup.compte.dto;

import lombok.Data;

@Data
public class VirementDTO {
    private Long codeSource;
    private Long codeDestination;
    private double montant;
}
