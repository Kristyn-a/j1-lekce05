package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        Adresa adresa1 = new Adresa();
        adresa1.setUliceaCisla("Sokolovská 123");
        adresa1.setObec("Praha");
        adresa1.setPsc(13000);

        Osoba osoba1 = new Osoba("Eva", "Černá", "121212/212");
        osoba1.setPracovniEmail("eva.cerna@centrum.cz ");

        osoba1.setTrvalyPobyt(adresa1);

        Telefon telefon = new Telefon();
        telefon.setTelefonniCislo("25252525");
        osoba1.setTelefon(telefon);

        Osoba osoba2 = new Osoba("Tomáš","Novák","90909/303");
        osoba2.setSoukromyEmail("tomas.n@gmail.com");
        osoba2.setPracovniEmail("tomas@in.cz");
        osoba2.setTrvalyPobyt(adresa1);
        osoba2.setDorucovaciAdresa(new Adresa("Dlouhá 1","Ostrava",40000));

        System.out.println(osoba1);
        System.out.println(osoba2);

    }

}
