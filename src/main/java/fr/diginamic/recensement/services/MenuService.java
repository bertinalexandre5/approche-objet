package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public interface MenuService {
    void traiter(Recensement recensement, Scanner scanner) ;

    Scanner nomVille = new Scanner(System.in);
    String ville = nomVille.nextLine();

}


