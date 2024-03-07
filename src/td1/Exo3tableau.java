package td1;
import java.util.Arrays;
import java.util.Scanner;

public class Exo3tableau {
	int n;
	int[] tab = new int[n];
	 public Exo3tableau(int n) {
	        this.tab = new int[n]; 
	    }
public void remplissage(int n,int tab[]) {
	for(int i=0; i<tab.length; i++) {
		System.out.println("entrer la"+(i+1)+"eme valeur du tableau");
		Scanner obj=new Scanner(System.in);
		int i1=(int)obj.nextInt();
		tab[i]=i1;
	}
}

public void affichage(int n,int tab[]) {
	System.out.println("voici votre tableau");
	for(int i=0; i<tab.length; i++) {
		System.out.println(tab[i]);
	}
}
public void verificationcroissant(int n,int tab[]) {
	boolean a=true;
	int i;
	i=0;
	while( i<n-1 && a==true) {
		if(tab[i]>tab[i+1]) {
			a=false;
		}
		i++;
	}
	if (a==true) {
		System.out.println("oui le tableau est tié en ordre croissant");
}else {
	System.out.println("non le tableau n'est pas trié en ordre croissant");
}
	
}

public void trienordrecroissant(int n, int tab[]) {
	int i=0;
	while(i<n) {
		for(int j=i+1; j<n;j++ ) {
			if(tab[j]<tab[i]) {
				int a=tab[i];
				tab[i]=tab[j];
				tab[j]=a;
			}
		}
		i=i+1;
	}
}
public void recherchemax(int n,int tab[]) {
	int max=0;
	int i=1;
	for(i=1; i<n;i++) {
		if(tab[max]<tab[i]) {
			max=i;
		}
	}
	System.out.println("le maximum est max="+tab[max]);
}
public void recherchemin(int n,int tab[]) {
	int min=0;
	int i=1;
	for(i=1; i<n;i++) {
		if(tab[min]>tab[i]) {
			min=i;
		}
	}
	System.out.println("le minimum est min="+tab[min]);
}
@Override
public String toString() {
	return "Exo3tableau [n=" + n + ", tab=" + Arrays.toString(tab) + "]";
}


}
