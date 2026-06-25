package fr.diginamic.banque.entites;

import fr.diginamic.banque.Operation;
import fr.diginamic.banque.Credit;
import fr.diginamic.banque.Debit;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("01/06/2026", 500.00);
        operations[1] = new Debit("03/06/2026", 120.00);
        operations[2] = new Credit("10/06/2026", 1000.00);
        operations[3] = new Debit("15/06/2026", 75.50);


    double montantGlobal = 0.0;

    for (Operation operation : operations) {
        String date = operation.getDateOp();
        double montant = operation.getMontant();
        String type = operation.getType();
        System.out.println(type + " du "+ date + " : " + montant+ " €");


        if (type.equals("CREDIT")) {
            montantGlobal += montant;
        } else {
            montantGlobal -= montant;
        };

        System.out.println("----------------");
        System.out.println("Montant global : " + montantGlobal +" €");

        }

    }
}
