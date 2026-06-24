package entites;

public class AdressePostale {

      int numeroRue;
      String libelleRue;
      String codePostal;
      String ville;

      public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
            this.numeroRue = numeroRue;
            this.libelleRue = libelleRue;
            this.codePostal = codePostal;
            this.ville = ville;
      }

      @Override
      public String toString() {
            return " AdressePostale [" +
                    " " + numeroRue +
                    ",  " + libelleRue + '\'' +
                    ",  " + codePostal + '\'' +
                    ",  " + ville + '\'' +
                    ']';
      }

}
