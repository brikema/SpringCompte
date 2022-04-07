package eu.ensup.compte.controller;

import eu.ensup.compte.dto.VirementDTO;
import eu.ensup.compte.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private CompteService compteService;

    @PutMapping(path = "/comptes/virement")
    public String virement(@RequestBody VirementDTO virementDTO){
        compteService.virement(virementDTO.getCodeSource(), virementDTO.getCodeDestination(), virementDTO.getMontant());
        return "Virement effectué avec succès";
    }
}
