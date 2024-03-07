package td1;

public class Exo5PrincipaleArticle {

	public static void main(String[] args) {
		Exo5 obj =new Exo5();
		obj.initArticle("robe",20000,10);
        obj.afficherArticle();
        obj.prixTTC(20000,500);
        obj.reduireStock(10,1);
        obj.augmenterStock(1);
	}

}
