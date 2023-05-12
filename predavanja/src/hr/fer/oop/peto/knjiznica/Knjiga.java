package hr.fer.oop.peto.knjiznica;

public class Knjiga {
	private String naslov;
	private String autor;
	private int brKomada;
	
	//konstruktor s 3 parametra
	public Knjiga(String naslov, String autor, int brk) {
		this.naslov = naslov;
		this.autor = autor;
		brKomada = brk;
	}
	
	//nema def. konstruktora, ne možemo iz gl. programa reći Knjiga k = new Knjiga();
	
	//setteri i getteri
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	public String getNaslov() {
		return naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getBrKomada() {
		return brKomada;
	}

	public void setBrKomada(int brKomada) {
		this.brKomada = brKomada;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", autor=" + autor + ", brKomada=" + brKomada + "]";
	}
	
}
