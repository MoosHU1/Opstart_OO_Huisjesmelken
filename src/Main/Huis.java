package Main;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis (String adr, int bwjr) {
        adres=adr;
        bouwjaar=bwjr;

    }

    public void setHuisbaas(Persoon hb) {
        huisbaas = hb;

    }


    @Override
    public String toString() {
        return "Huis " +
                "adres='" + adres + '\'' +
                ", bouwjaar=" + bouwjaar +
                ", huisbaas=" + huisbaas +
                '}';
    }
}
