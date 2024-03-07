package td1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Exo6ProgPrincipalPoint {

		public static void main(String[] args) {
			System.out.println("entrez la taille de votre tableau");
			Scanner obj1=new Scanner(System.in);
			int n=obj1.nextInt();
			
			Exo6point[] tab = new Exo6point[n];
				for (int i = 0; i < n; i++) {
			        tab[i] = new Exo6point();
			        Exo6point obj= new Exo6point();
			        System.out.println("entrez la X "+(i+1)+"eme composante .");
					Scanner obj2=new Scanner(System.in);
			    	obj.setX(obj2.nextInt());
			    	System.out.println("entrez la Y "+(i+1)+"eme composante .");
					Scanner obj3=new Scanner(System.in);
			    	obj.setY(obj3.nextInt());
			        tab[i] =obj;
			    }
			    for (int i = 0; i < n; i++) {
			      tab[i].afficherPoint();
			    }
			    Exo6TableauPoints obj4=new Exo6TableauPoints(n);
			    double mindis=obj4.distance(tab[1],tab[0]);
			for(int i=0;i<n-1;i++) {
				for(int j=i+1; j<n; j++) {
					if(mindis>obj4.distance(tab[i],tab[j])) {
						mindis=obj4.distance(tab[i],tab[j]);
					}
				}
			}
			System.out.println("**VOICI LA MIN DISTANCE**="+mindis);
		}

	}
