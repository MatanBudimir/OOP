package hr.fer.oop.cetvrto;

public class Knjiga {
    private String autor, naslov;
    private int n;

    public Knjiga(String autor, String naslov, int n) {
        this.autor = autor;
        this.naslov = naslov;
        this.n = n;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", autor, naslov);
    }
}
