package eu.ensup.compte.controller;

import eu.ensup.compte.domain.Compte;
import eu.ensup.compte.repository.CompteRepository;
import eu.ensup.compte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteController {

    // TODO : Enlever le autowired
    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private UserService userService;

    public void CompteController(CompteRepository compteRepository){
        this.compteRepository = compteRepository;
    }

    @GetMapping(value = "/info")
    public UserDetails getInfo() {

        UserDetails user = userService.loadUserByUsername("admin");
        return user;

    }



/*    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping(path="/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping(path="/comptes/{id}")
    public Compte update(@PathVariable(name = "id")Long id, @RequestBody Compte compte){
        compte.setCode(id);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path="/comptes/{id}")
    public void delete(@PathVariable Long id){
        compteRepository.deleteById(id);
    }*/
}
