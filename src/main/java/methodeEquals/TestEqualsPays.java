package methodeEquals;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", 1500);
        Pays pays2 = new Pays("France", 1500);

        System.out.println("france1.equals(france2) : " + pays1.equals(pays2));
        System.out.println("---------");
        System.out.println("france1 == france2 : " + (pays1 == pays2));
    }
}

