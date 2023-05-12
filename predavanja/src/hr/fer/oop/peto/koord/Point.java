package hr.fer.oop.peto.koord;
public class Point {

	private double x;
	private double y;
	public char naziv = 'P';
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(char naziv, double x, double y) {
		this(x,y);
		this.naziv = naziv;
	}
	
	public Point(Point p) {
		//mogli smo ovako:
		//this.x = p.x;
		//this.y = p.y;
		//ali možemo i ovo - poziv jednog konstruktora iz drugog:
		this(p.x,p.y);
	}
	
	public Point() {
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return naziv + "(" + x + "," + y + ")";
	}
	
	public boolean isEqualTo(Point other) {
		//uočite da ova provjera nije uvijek dobra. Zašto?
		if ((this.x == other.x) && (y == other.y))
			return true;
		return false;
	}
	
	//statička metoda... ne radi ništa pametno.. dodali smo ju samo da pokažemo da se može pozvati uvijek
	public static String pozdrav() {
		return "Hello P01!";
	}
	
	//instance metoda koja vraća referencu na točku koja je polovište između this i other
	public Point poloviste(Point other) {
		return new Point('P',(this.x+other.x)/2, (this.y+other.y)/2);
	}
	
	//1. verzija metode centerOf, prima TOČNO tri točke
	public static Point centerOf(Point a, Point b, Point c) {
		System.out.println("3 parametra");
		return new Point('P',(a.x+b.x + c.x)/3, (a.y+b.y + c.y)/3);
	}
	
	//2. verzija metode centerOf, prima polje točaka
	public static Point centerOf(Point[] points) {
		double x = 0;
		double y = 0;
		for (int i=0; i<points.length; i++) {
			x += points[i].x;
			y += points[i].y;
		}
		return new Point('S', x/points.length, y/points.length);
	}
	
	//3. verzija metode centerOf, prima 2 točke i onda varijabilni broj točaka, 0 do *
	//sve te točke će "zapakirati" u polje koje se "zove" points
	//poziva se tako da se samo nabroje točke, a unutar funkcije imamo reference a, b i points
	public static Point centerOf(Point a, Point b, Point ... points ) {
		System.out.println("var. br. parametara");
		double x = a.x + b.x;
		double y = a.y + b.y;
		for (int i=0; i<points.length; i++) {
			x += points[i].x;
			y += points[i].y;
		}
		return new Point('S', x/(points.length+2), y/(points.length+2));
	}
	
	//statička metoda, prima dva parametra i vraća udaljenost između te dvije točke
	public static double distanceBetween(Point p1, Point p2) {
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	
	//instance metoda, radi istu stvar kao i gornja statička...
	//umjesto da kopiramo kod u liniji 97, pozvali smo gornju metodu i predali joj this i other
	public double distanceTo(Point other) {
		return distanceBetween(this, other);
	}
	
}
