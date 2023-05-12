package hr.fer.oop.peto.koord;
public class Main {

	public static void main(String[] args) {
		
		//primjer poziva statičke metode... 
		//static metoda se nalazi u nekoj klasi ali je "neovisna" o objektima iz nje
		//tj. static metodu mogu pozvati ako uopće još nemam ni jedan objekt neke klase
		System.out.println(Point.pozdrav());

		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		
		//static metodu mogu i pozvati "nad" objektom, ali to ne mijenja na stvari...
		//ona je statička i nema veze s tim objektom... Java dopušta ovo, ali uz warning:
		//The static method pozdrav() from the type Point should be accessed in a static way
		System.out.println(p1.pozdrav());
		
		System.out.println(p1);
		
		Point p2 = new Point(1,2);
		
		//usporedba referencci
		System.out.println("p1==p2 ? " + (p1==p2));
		
		//usporedba objekata
		System.out.println("p1.isEqualTo(p2) ? " + (p1.isEqualTo(p2)));
		
		//p3 je referenca koja pokazuje na isti objekt kao i p1
		Point p3 = p1;
		//p4 je referenca koja pokazuje na novi objekt, ali napravljen pomoću copy konstruktora
		//p4 i p1 su različiti objekti, ali s "istim sadržajem"
		Point p4 = new Point(p1);
		
		//zovem konstruktor koji prima char, double, double
		Point t = new Point('T', 3, 5);
		
		System.out.println(t);
		
		//slično kao i gore, pp1 i pp2 pokazuju na nove objekte, a pp3 na isti objekt kao i pp1
		Point pp1 = new Point(2,5);
		Point pp2 = new Point(pp1);
		Point pp3 = pp1;
		
		//objekti na koje pokazuju pp1 i pp2 imaju iste vrijednosti, dakle isEqualTo vraća true
		System.out.println(pp1 + " --- " + pp2 + " ---- " + pp3);
		System.out.println(pp1.isEqualTo(pp2));
		
		//sad smo promijenili objekt na koji pokazuje pp1
		pp1.setX(1);
		pp1.setY(2);
		
		//objekt na koji pokazuje pp2 je nepromijenjen, ali pp3 pokazuje na isti objekt kao i pp1
		System.out.println(pp1 + " --- " + pp2 + " ---- " + pp3);
		
		//stvaram još par novih točaka
		Point a = new Point('A', 0, 0);
		Point b = new Point('B', 1, 1);
		
		//metoda polovište vraća točku na pola puta između "this" i točke predane kao parametar
		Point pol = a.poloviste(b);
		System.out.println(a + " " + b + " " + pol);
		
		Point c = new Point('C', 2, 2);
		
		//metoda centerOf vraća centar između 3 točke
		//mogli smo napisati nestatičku metodu centerOf, onda bismo je zvali npr. a.centerOf(b,c)
		//ali ovo je prirodnije:
		//Point s = Point.centerOf(a, b, c);
		//System.out.println(s);
		System.out.println(Point.centerOf(a, b, c));
		
		//centerOf se može pozvati i ovako... neke točke imam od prije, neke stvorim "u letu"
		Point s2 = Point.centerOf(a, b, new Point(4,4));
		
		//ovo gore vrijedi samo za 3 točke...
		//što ako želim izračunati centar od proizvoljnog broja točaka?
		//mogu napisati centerOf koja prima polje
		Point[] polje = new Point[] {a,b,c,new Point('D',9,9)};
		System.out.println(Point.centerOf(polje));
		
		//problem s gornjim rješenjem je što moram ručno kreirati polje da bi ga
		//predao u fju centerOf... iako mi to polje ustvari ne treba...
		
		//bolji način: definiram centerOf s varijabilnim brojem parametara
		//onda metodu jednostavno pozovem tako da samo naredam sve točke koje želim...
		//npr. 5 točaka
		System.out.println(Point.centerOf(a,b,c, new Point(8,8), new Point(2,2)));
		
		//ili 8 točaka
		System.out.println(Point.centerOf(a,b,c, new Point(8,8), new Point(2,2), pp1, pp2, pp3));
		
		//ovo je zsanimljivo... centerOf s 3 parametra... 
		//tu se poziva ona specifična metoda koja prima baš 3 parametra!
		System.out.println(Point.centerOf(a, new Point(8,8), new Point(2,2)));
		
		//2 točke - nema specifične metode, opet se poziva ona s varargs
		System.out.println(Point.centerOf(a, new Point(2,2)));
		
		//statička metoda distanceBetween računa udaljenost između dvije točke
		System.out.println(Point.distanceBetween(a, b));
		
		//metoda distanceTo računa udaljenost točke nad kojom je pozvana (this) i točke predane kao parametar
		//Kako smo to napravili u implementaciji? pa pozvali smo distanceBetween :)
		System.out.println(a.distanceTo(b));
		
		// instance metode možemo zamisliti (a otprilike tako i funkcioniraju "ispod haube")
		//kao metode koje kao prvi skriveni parametar prenose referencu na objekt nad kojim su pozvane
		//dakle p1.distanceTo(p2) je ustvari interno "distanceTo(p1,p2)"
		//a taj "p1" je unutar metode "this"
		
		
		// line segment aka dužina
		
		//Dužina omeđena točkama a i b
		LineSegment ab = new LineSegment(a, b);
		
		//duljina dužine ab
		System.out.println(ab.length());
		
		//što ako promijenimo x koordinatu točke a?
		a.setX(100);
		
		//Hoće li nakon linije 124 ovo dolje ispisati istu duljinu ili drugu?
		//Ovo zavisi o načinu na koji smo napisali linesegment, konkretno njegov konstruktor
		System.out.println(ab.length());
		
		//uočimo da, kako god mi napisali konstruktor za linesegment, ako želimo, 
		//možemo promijeniti direktno točke linesegmenta, npr. ovako:
		ab.p1.setX(50);
		
		//a što ako točke p1 i p2 u linesegment proglasimo za private?
		//onda preko odgovarajućih gettera i settera, ako postoje
	}

}
