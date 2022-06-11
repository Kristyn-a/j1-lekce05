package cz.czechitas.lekce5.model;

public class Adresa {
    private String uliceaCisla;
    private String obec;
    private int psc;

    public Adresa(String uliceaCisla, String obec, int psc) {
        this.uliceaCisla = uliceaCisla;
        this.obec = obec;
        this.psc = psc;
    }

    public Adresa() {

    }

    public String getUliceaCisla() {
        return uliceaCisla;
    }

    public void setUliceaCisla(String uliceaCisla) {
        this.uliceaCisla = uliceaCisla;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public int getPsc() {
        return psc;
    }

    public void setPsc(int psc) {
        this.psc = psc;
    }

    @Override
    public String toString() {
        return uliceaCisla + " , " + obec + " , " + psc;
    }
}
