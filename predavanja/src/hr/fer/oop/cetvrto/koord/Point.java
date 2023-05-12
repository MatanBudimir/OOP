package hr.fer.oop.cetvrto.koord;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
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
		return "(" + x + "," + y + ")";
	}
	
	public boolean isEqualTo(Object other) {
		//uočite da ova provjera nije uvijek dobra. Zašto?
		if (other == null)
			return false;
		else if (!(other instanceof Point))
			return false;

		Point p = (Point) other;

		return (this.x == p.x) && (y == p.y);
	}
	
	
}
