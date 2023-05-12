package hr.fer.oop.cetvrto.koord;

public class Main {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		
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
		
	}

}
