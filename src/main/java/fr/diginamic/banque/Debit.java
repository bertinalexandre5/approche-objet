package fr.diginamic.banque;

public class Debit extends Operation {

    public Debit(String dateOp, double montant) {
        super(dateOp, montant);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
