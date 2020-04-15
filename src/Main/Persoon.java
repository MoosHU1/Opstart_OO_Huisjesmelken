package Main;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam=nm;
        leeftijd=lft;

    }

    @Override
    public String toString() {
        return "En heeft huisbaas " +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
