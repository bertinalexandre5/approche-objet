package fr.diginamic.banque;

public class Credit extends Operation {

    public Credit(String dateOp, double montant) {
        super(dateOp, montant);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
