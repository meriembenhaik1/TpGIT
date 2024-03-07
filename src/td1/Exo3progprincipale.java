package td1;

public class Exo3progprincipale {

	public static void main(String[] args) {
		// remplissage d'un tableau:
		Exo3tableau obj1= new Exo3tableau(4);
		obj1.remplissage(4,obj1.tab);
		//affichage d'un tableau
		obj1.affichage(4,obj1.tab);
		//verification ordre croissant
		obj1.verificationcroissant(4, obj1.tab);
		obj1.recherchemax(4, obj1.tab);
		obj1.recherchemin(4, obj1.tab);
		obj1.trienordrecroissant(4,obj1.tab);
		obj1.affichage(4,obj1.tab);
		System.out.println(obj1.toString());
	}

}
