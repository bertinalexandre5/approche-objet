package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> listVilles = new ArrayList<>();
        listVilles.add(new Ville("Nice", 343000));
        listVilles.add(new Ville("Carcassonne", 47800));
        listVilles.add(new Ville("Narbonne", 53400));
        listVilles.add(new Ville("Lyon", 484000));
        listVilles.add(new Ville("Foix", 9700));
        listVilles.add(new Ville("Pau", 77200));
        listVilles.add(new Ville("Marseille", 850700));
        listVilles.add(new Ville("Tarbes", 40600));

        Ville popMax = listVilles.get(0);
        for (int i = 0; i < listVilles.size(); i++) {
            Ville pop = listVilles.get(i);
            if (pop.getNb() > popMax.getNb()) {
                popMax = pop;
            }

        }
        System.out.println("La ville la plus peuplée est : " + popMax);


        Ville popMin = listVilles.get(0);
        for (int i = 0; i < listVilles.size(); i++) {
            Ville pop = listVilles.get(i);
            if (pop.getNb() < popMin.getNb()) {
                popMin = pop;
            }

        }
        listVilles.remove(popMin);
        System.out.println(listVilles);

        System.out.println("--------------");

        for (int i = 0; i < listVilles.size(); i++) {
            Ville grosseVille = listVilles.get(i);

            if (grosseVille.getNb() > 100000) {
                String nomMajuscule = grosseVille.getNom().toUpperCase();
                grosseVille.setNom(nomMajuscule);
            }
        }
        System.out.println(listVilles);
    }
}
