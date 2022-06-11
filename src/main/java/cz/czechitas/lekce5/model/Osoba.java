package cz.czechitas.lekce5.model;

public class Osoba {
    private String jmeno;
    private String prijmeni;

    private String rodneCislo;

    private Adresa trvalyPobyt;

    private Adresa dorucovaciAdresa;

    private String soukromyEmail;

    private String pracovniEmail;

    private  Telefon telefon;

    public Osoba(String jmeno, String prijmeni, String rodneCislo) {
        if(jmeno.isBlank()){
            System.err.println("Jméno nesmí být prázdné");
        }
        if(prijmeni.isBlank()){
            System.err.println("Příjmení nesmí být prázdné");
        }
        if(rodneCislo.isBlank()){
            System.err.println("Rodné číslo nesmí být prázdné");
        }
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rodneCislo = rodneCislo;
    }

    public void setJmeno (String jmeno) {
        if (jmeno.isBlank()){
            System.err.println("Jméno nemůže být prázdné");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getJmeno(){
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        if (prijmeni.isBlank()){
            System.err.println("Příjmení nemůže být prázdné");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        if (rodneCislo.isBlank()){
            System.err.println("Rodné číslo nemůže být prázdné");
            return;
        }
        if (!rodneCislo.contains("/")){
            System.err.println("Rodné číslo musí obsahovat lomítko");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Adresa getTrvalyPobyt() {
        return trvalyPobyt;
    }
    public void setTrvalyPobyt(Adresa trvalyPobyt) {
        this.trvalyPobyt = trvalyPobyt;
    }

    public Adresa getDorucovaciAdresa() {
        return dorucovaciAdresa;
    }

    public void setDorucovaciAdresa(Adresa dorucovaciAdresa) {
        this.dorucovaciAdresa = dorucovaciAdresa;
    }

    public String celeJmeno(){
            return jmeno + " " + prijmeni;
        }

    public String getSoukromyEmail() {
        return soukromyEmail;
    }

    public void setSoukromyEmail(String soukromyEmail) {
        if (!soukromyEmail.contains("@")){
            System.err.println("Soukromý email musí obsahovat zavináč");
        }
        this.soukromyEmail = soukromyEmail;
    }

    public String getPracovniEmail() {
        return pracovniEmail;
    }

    public void setPracovniEmail(String pracovniEmail) {
        if (!pracovniEmail.contains("@")){
            System.err.println("Pracovní email musí obsahovat zavináč");
        }
        this.pracovniEmail = pracovniEmail;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String toString(){
        return jmeno + " " + prijmeni + "( " + rodneCislo + ")";
        }
    }
