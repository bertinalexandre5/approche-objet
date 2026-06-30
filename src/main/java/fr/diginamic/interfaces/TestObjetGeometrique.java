package fr.diginamic.interfaces;

import java.util.ArrayList;

public class TestObjetGeometrique {
    public static void main(String[] args) {

    ObjetGeometrique[] tab = new ObjetGeometrique[2];

    tab[0] = new Cercle(5.0);
    tab[1] = new Rectangle(15.0,10.5);

    for (int i = 0; i < tab.length; i++) {
        System.out.println("Périmètre : " + tab[i].perimetre());
        System.out.println("Surface : " + tab[i].surface());
    }

    for (ObjetGeometrique ob: tab) {
        System.out.println(ob);
        System.out.println(ob);

    }

    }
}
