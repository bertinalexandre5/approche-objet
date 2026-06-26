package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    private int nombreJoursTravailles;
    private double remunerationJournaliere;

    public Pigiste(String nom, String prenom, double remunerationJournaliere, int nombreJoursTravailles) {
        super(nom, prenom);
        this.remunerationJournaliere = remunerationJournaliere;
        this.nombreJoursTravailles = nombreJoursTravailles;
    }

    @Override
    public double getSalaire() {
        return nombreJoursTravailles * remunerationJournaliere;
    }

    @Override
    public String getStatut() {
        return "Pigiste";
    }

    public int getNombreJoursTravailles() {
        return nombreJoursTravailles;
    }

    public void setNombreJoursTravailles(int nombreJoursTravailles) {
        this.nombreJoursTravailles = nombreJoursTravailles;
    }

    public double getRemunerationJournaliere() {
        return remunerationJournaliere;
    }

    public void setRemunerationJournaliere(double remunerationJournaliere) {
        this.remunerationJournaliere = remunerationJournaliere;
    }
}
