package hr.fer.oop.cetvrto;

public class Ucenik {
    private String ime, prezime;
    private int brRaz;
    private String nazRaz;

    public Ucenik(String ime, String prezime, int brRaz, String nazRaz) {
        this.ime = ime;
        this.prezime = prezime;
        this.brRaz = brRaz;
        this.nazRaz = nazRaz;
    }

    public Ucenik() {
        this("Marko", "Markic", 1, "a");
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrRaz() {
        return brRaz;
    }

    public void setBrRaz(int brRaz) {
        this.brRaz = brRaz;
    }

    public String getNazRaz() {
        return nazRaz;
    }

    public void setNazRaz(String nazRaz) {
        this.nazRaz = nazRaz;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d.%s", ime, prezime, brRaz, nazRaz);
    }

    public String razred() {
        return brRaz + nazRaz;
    }
}
