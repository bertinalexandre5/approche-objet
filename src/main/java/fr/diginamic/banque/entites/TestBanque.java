package fr.diginamic.banque.entites;

import fr.diginamic.banque.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt = new Compte("FR78", 1000.00);
        System.out.println(cpt);


    Compte[] comptes = new Compte[2];
    comptes[0] = new Compte("FR25", 165.00);
    comptes[1] = new CompteTaux("FR85", 500.00, 2.5);

    for (int i=0; i<comptes.length; i++) {
        System.out.println(comptes[i]);
    }
    }
}
