package Main;

public class Main {
    public static void main(String[] arg){

        Huis h1 = new Huis ("Nijenoord 1", 1970);
        Persoon p1 = new Persoon ("Ronald Plasterk", 52);
        h1.setHuisbaas(p1);

        System.out.println(p1);
        System.out.println(h1.toString());

    }

}
