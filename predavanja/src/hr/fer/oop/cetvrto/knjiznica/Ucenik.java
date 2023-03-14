package hr.fer.oop.cetvrto.knjiznica;

public class Ucenik {
	
	public String ime;
	public String prezime;
	
	private int brRaz;
	private String nazRaz;
	
	public Ucenik(String ime, String prez, int brr, String nr) {
		this.ime = ime; //"ime" je i varijabla u klasi i parametar konstruktora
		prezime = prez;
		brRaz = brr;
		nazRaz = nr;
	}

	//default konstruktor - ako nismo napisali NITI JEDAN konstruktor, ovaj se stvori automatski
	//Ako smo dodali jedan ili više vlasittih konstruktora, a želimo imati i default, moramo ga napisati
	public Ucenik() {
	}

	public String getRazred() {
		return brRaz + nazRaz;
	}
	
	//primjer settera koji radi neki dodatni posao, npr. sanity check nad podatkom koji upisujemo
	public void setBrRaz(int b) {
		if (b<1 || b>4) {
			System.out.println("Razred mora biti 1-4");
			return;
		}
		brRaz = b;
	}
	
	
	//ispisuje podatke iz objekta na ekran
	//ovo je ok ali što ako želim npr. ispisati podatke o učeniku i knjizi koju je posudio u istom retku?
	void print() {
		System.out.println(ime + " " + prezime + ", " + this.brRaz+nazRaz);
	}
	
	//bolje je imati ovu fju: podatke o objektu sprema u string, i vraća taj string
	public String toString() {
		return ime + " " + prezime + ", " + this.brRaz+nazRaz;
	}

}
