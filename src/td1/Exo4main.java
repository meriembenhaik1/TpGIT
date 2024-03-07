package td1;
import java.util.Scanner;
public class Exo4main {

	public static void main(String[] args) {
		Exo4Compte obj4=new Exo4Compte(22321, "meriem benhaik",2595500);
		System.out.println("entrer la somme d'argent que vous voulez ajouter");
		Scanner obj=new Scanner(System.in);
		double i1=obj.nextDouble();
	    obj4.debiterCompte(2595500 ,i1);
	    System.out.println("entrer la somme d'argent que vous voulez debiter");
		double i2=obj.nextDouble();
		obj4.debiterCompte(2595500 ,i2);
	}

}
