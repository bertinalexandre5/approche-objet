package fr.diginamic.banque;

public abstract class Operation {

    private String dateOp;
    private double montant;

    public Operation(String dateOp, double montant) {
        this.dateOp = dateOp;
        this.montant = montant;
    }

    public String getDateOp() {
        return dateOp;
    }


    public double getMontant() {
        return montant;
    }

    public abstract String getType();
}
