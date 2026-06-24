package entites;

public class AdressePostale {

      int numeroRue;
      String libelleRue;
      String codePostal;
      String ville;

      public AdressePostale(int numero, String libelle, String code, String v) {
            this.numeroRue = numero;
            this.libelleRue = libelle;
            this.codePostal = code;
            this.ville = v
      }
}
