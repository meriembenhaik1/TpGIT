package td1;
import java.util.Scanner;

public class Exo1b {
	public static void main(String[] args) {
	    System.out.println("entrer deux nombres  de votre choix :");
		Scanner obj1 =new Scanner(System.in);
		String i1=obj1.nextLine();
		String i2=obj1.nextLine();
		System.out.println("voici les nombres que vous avez entrer:a="+i1 +" "+"b=" +i2);
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		int s=a+b;
		System.out.println("voici le resultats de votre somme: s="+s);
	}
}



