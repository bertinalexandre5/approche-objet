package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    private double salaireMensuel;


    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

        @Override
        public double getSalaire () {
            return salaireMensuel;
        }

    @Override
    public String getStatut() {
        return "Salarie";
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }
}
