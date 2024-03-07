package td1;
import java.util.Scanner;
public class Exo1c {

	public static void main(String[] args) {
		System.out.println("entrer le nombre d'entier que n que vous vouler leur calculer la somme");
		Scanner obj=new Scanner(System.in);
		int i1=obj.nextInt();
		int s=0;
		for (int i=1; i<=i1; i++) {
			System.out.println("entrer le "+i+"eme entier");
			Scanner obj1=new Scanner(System.in);
			int i2=obj1.nextInt();
			s=s+i2;
		}
		System.out.println("voici votre somme s="+s);

	}

}
