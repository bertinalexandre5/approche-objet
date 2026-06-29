package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>();
        villes.addAll(List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        System.out.println();
        System.out.println("-------");

        String villeLaPlusLongue = villes.get(0);
        for (int i = 1; i < villes.size(); i++) {

            String villeCourante = villes.get(i);

            if (villeCourante.length() > villeLaPlusLongue.length()) {
                villeLaPlusLongue = villeCourante;
            }
        }
        System.out.println("La ville avec le plus de lettres : " + villeLaPlusLongue
                + " (" + villeLaPlusLongue.length() + " lettres)");

        System.out.println("-------");

        for (int i = 0; i < villes.size(); i++) {
            String ville = villes.get(i);
            String villeMajuscule = ville.toUpperCase();
            villes.set(i, villeMajuscule);

        }

        Iterator<String> iter = villes.iterator();
            while (iter.hasNext()){
                String name = iter.next();
                if (name.startsWith("N")) {
                    iter.remove();
                }
            }
        System.out.println("Villes ne commençant pas par (N) : " + villes);
    }
        }
