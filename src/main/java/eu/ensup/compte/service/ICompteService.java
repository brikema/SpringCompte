package eu.ensup.compte.service;

public interface ICompteService{
    public void virement(Long coseSource, Long codeDestination, double montant);
}
