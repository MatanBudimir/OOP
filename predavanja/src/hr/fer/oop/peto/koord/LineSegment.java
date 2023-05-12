package hr.fer.oop.peto.koord;

public class LineSegment {
	public Point p1, p2;
	
	//Konstruktor koji prima dvije točke i... e sad je pitanje što radi...
	//može samo prespojiti reference... kao u linijama 10 i 11
	//ili može za svoje potrebe stvoriti nove točke, kao u linijama 12 i 13
	public LineSegment(Point p1, Point p2) {
		//this.p1 = p1;
		//this.p2 = p2;
		this.p1 = new Point(p1);
		this.p2 = new Point(p2);
	}
	
	//kako će ovo gore utjecati na ponašanje linesegment-a?
	//npr. ako stvorim dužinu s točkama a i b i onda kažem a.setx(100)?
	
	public double length() {
		return p1.distanceTo(p2);
	}

}
