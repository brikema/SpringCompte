package eu.ensup.compte.service;

import eu.ensup.compte.domain.Compte;
import eu.ensup.compte.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CompteService implements ICompteService {

    @Autowired
    private CompteRepository compteRepository;

    @Override
    @Transactional
    public void virement(Long codeSource, Long codeDestination, double montant) {
        // TODO : Gérer les excpetions
        Compte c1 = compteRepository.getById(codeSource);
        Compte c2 = compteRepository.getById(codeDestination);
        c1.setSolde(c1.getSolde()-montant);
        c2.setSolde((c2.getSolde()+montant));
        //compteRepository.save(c1);
        //compteRepository.save(c2);
    }
}
