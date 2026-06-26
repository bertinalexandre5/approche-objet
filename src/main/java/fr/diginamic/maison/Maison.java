package fr.diginamic.maison;

public class Maison {

    private Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece nouvellePiece) {

        if (nouvellePiece == null) {
            System.out.println("Erreur : impossible d'ajouter une pièce null");
            return;   // on sort de la méthode immédiatement, sans rien ajouter
        }

        if (nouvellePiece.getSuperficie() <= 0) {
            System.out.println("Erreur : superficie incohérente (" + nouvellePiece.getSuperficie() + ")");
            return;
        }

        if (nouvellePiece.getEtage() < 0) {
            System.out.println("Erreur : étage incohérent (" + nouvellePiece.getEtage() + ")");
            return;
        }

        Piece[] nouveauTableau = new Piece[pieces.length + 1];

        for (int i = 0; i < pieces.length; i++) {
            nouveauTableau[i] = pieces[i];
        }
        nouveauTableau[pieces.length] = nouvellePiece;

        pieces = nouveauTableau;

    }

    public Piece[] getPieces() {
        return pieces;
    }


    public double superficieMaison() {
        double total = 0;



        for (int i = 0; i < pieces.length; i++) {
            Piece nouvellePiece = pieces[i];
            total += nouvellePiece.getSuperficie();
        }
        return total;

    }

    public double superficieEtage(int etageRecherche) {
        double total = 0;
        for (int i = 0; i < pieces.length; i++) {
            Piece nouvellePiece = pieces[i];

            if (nouvellePiece.getEtage() == etageRecherche) {
                total += nouvellePiece.getSuperficie();
            }

        }
        return total;

    }
    public double getSuperficieParType(String nomRecherche) {

        double total = 0;

        for (int i = 0; i < pieces.length; i++) {
            Piece nouvellePiece = pieces[i];

            // On compare des String → .equals(), PAS ==
            if (nouvellePiece.getNom().equals(nomRecherche)) {
                total += nouvellePiece.getSuperficie();
            }
        }

        return total;
    }

}

