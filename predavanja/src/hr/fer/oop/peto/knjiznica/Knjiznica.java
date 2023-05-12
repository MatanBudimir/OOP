package hr.fer.oop.peto.knjiznica;

public class Knjiznica {

	public static void main(String[] args) {

		//Ovako smo napravili na početku:
		//onda smo zaključili da je bolje imati konstruktor za inicijalizaciju objekta
		//a uz to smo neke varijable proglasili za private
//		Ucenik marko;
//		marko = new Ucenik();
//		marko.ime = "Marko";
//		marko.prezime = new String("Markic");
//		marko.brRaz = 3;
//		marko.nazRaz = "C";
		
		Ucenik marko = new Ucenik("Marko", "Markic", 3, "C");
		
		System.out.println(marko);
		System.out.println(marko.ime + " " + marko.prezime);
		
		Ucenik ana = new Ucenik();
		ana.ime = "Ana";
		
		System.out.println(ana.ime + " " + ana.prezime);
		ana.prezime = "Anic";
		System.out.println(ana.ime + " " + ana.prezime);
		
		Knjiga k1 = new Knjiga("Otac Goriot", "Honore de Balzac", 10);
		
		//System.out.println(k1.autor + " : " + k1.naslov );
		System.out.println(k1.getAutor() + " : " + k1.getNaslov() );
		
		marko.print();
		
		System.out.println("Ucenik: " + marko.toString());
		System.out.println("Ucenik: " + marko);

		System.out.println(marko.getRazred());
		
		marko.ime = "Mirko";
		System.out.println(marko);
		
		marko.setBrRaz(12);
		System.out.println(marko);
		
		
	}

}
