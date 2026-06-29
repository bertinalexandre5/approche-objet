package methodeEquals;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", 1500);
        Pays pays2 = new Pays("France", 1500);
        Pays pays3 = new Pays("Espagne", 1200);


        System.out.println("pays1.equals(pays2) : " + pays1.equals(pays2));
        System.out.println("---------");
        System.out.println("pays1 == pays2 : " + (pays1 == pays2));
        System.out.println("---------");
        System.out.println("pays1.equals(pays3) : " + pays1.equals(pays3));
        System.out.println("---------");
        System.out.println("pays1 == pays3 : " + (pays1 == pays3));
    }
}

