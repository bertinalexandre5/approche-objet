package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
       double test1 = Operations.calcul(5,3,'+');
       double test2 = Operations.calcul(5,3,'-');
       double test3 = Operations.calcul(5,3,'*');
       double test4 = Operations.calcul(5,3,'/');

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
