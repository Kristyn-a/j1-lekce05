package cz.czechitas.lekce5.model;

public class Telefon {
    private String predcisli;

    private String telefonniCislo;

    public String getPredcisli() {
        return predcisli;
    }

    public void setPredcisli(String predcisli) {
        this.predcisli = predcisli;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(String telefonniCislo) {
        if (telefonniCislo.isBlank()){
            System.err.println("Telefonní číslo musí být vyplněno");
        }
        this.telefonniCislo = telefonniCislo;
    }
}
