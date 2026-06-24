package entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 12;
        adr1.libelleRue = "Rue de Droite";
        adr1.codePostal = "31470";
        adr1.ville = "Fonsorbes";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 13;
        adr2.libelleRue = "Rue de Gauche";
        adr2.codePostal = "31470";
        adr2.ville = "Fontenilles";
    }
}
