package td1;

public class Exo6point {
private double x;
private double y;
public Exo6point() {
	this.x = x;
	this.y = y;
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
public  void Point () {
	this.x=0;
	this.y=0;
}
public void afficherPoint () {
	System.out.println("("+getX()+","+getY()+")" );
}
public void deplacerPoint(double dx, double dy) {
	x=dx+x;
	y=dy+y;
}
}
