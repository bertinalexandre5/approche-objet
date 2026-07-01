package fr.diginamic.chaines;


public class TestStringBuilder {
    public static void main(String[] args) {
    StringBuilder build = new StringBuilder();
        long debut = System.currentTimeMillis();

        for (int i=1; i <= 100000; i++) {
        build.append(i);
        }


//// Code à chronométrer
//        long fin = System.currentTimeMillis();
//        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

//        String texte = "";
//        long debut = System.currentTimeMillis();
//
//        for (int i=1; i <= 100000; i++) {
//        texte = texte + i;
//        }


// Code à chronométrer
        long fin = System.currentTimeMillis();
        System.out.println("Temps avec String :" + (fin - debut));
    }
}
