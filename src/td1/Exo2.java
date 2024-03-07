package td1;
 
public class Exo2 {
	public static void main(String[] args) {
    int a=2;
    int b=3;
    int s=a+b;
    System.out.println("la somme est s="+s);
    int s1=1+2+3+8+9;
    System.out.println("la somme est s1="+s1);
    int [] t={1,2,3,4,100};
    int  l=t.length;
    int s2=0;
    for(int i=0; i<l; i++) {
    	s2=s2+t[i];
    }
    System.out.println("voici votre somme du tableau s2="+s2);	
	}
}
