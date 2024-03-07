package td1;
import java.util.Scanner;
public class Exo6TableauPoints {
	
	private int n;
	public Exo6TableauPoints(int n) {
		super();
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double distance(Exo6point a,Exo6point b) {
		double distance;
		distance=Math.sqrt(Math.abs((a.getX()-b.getX())+(a.getY()-b.getY())));
		return distance;
	}
	
	
}
