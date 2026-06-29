package listes;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.addAll(List.of(-1, 5, 7, 3, -2, 4, 8, 5));

        for (int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        int plusGrand = lista.get(0);

        for (int i=0; i< lista.size(); i++) {
            int element = lista.get(i);
            if (element > plusGrand) {
                plusGrand = element;
            }

        }
        System.out.println("le plus grand élément de ma liste est : " + plusGrand);
        System.out.println("--------");
        int plusPetit = Collections.min(lista);
        System.out.println("Plus petit élément est :" + plusPetit);
        lista.remove(Integer.valueOf(plusPetit));
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            int element = lista.get(i);
            if (element < 0) {
                int positif = element * -1;
                lista.set(i, positif);
            };
        }
        System.out.println("Ma liste avec chiffres positif : " + lista);

    }
}
