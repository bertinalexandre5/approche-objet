package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne test1 = new CalculMoyenne();
        test1.ajout(10.0);
        test1.ajout(25.00);
        test1.ajout(2.0);
        test1.ajout(5);

        double moyenne1 = test1.calcul();
        System.out.println("Test 1 - moyenne égale : "+ moyenne1);
        System.out.println("----------");


        CalculMoyenne test2 = new CalculMoyenne();
        test2.ajout(45.0);
        test2.ajout(18.6);
        double moyenne2 = test2.calcul();
        System.out.println("Test 2 - moyenne égale : " + moyenne2);
        System.out.println("----------");
    }
}
