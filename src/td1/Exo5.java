package td1;

public class Exo5 {
	  private String désignation;
	  private double prix;
	  private int quantité;
	 
	public Exo5() {
	this.désignation=désignation;
	this.prix=prix;
	this.quantité=quantité;
	}
	
	public String getDésignation() {
		return désignation;
	}
	public void setDésignation(String désignation) {
		this.désignation = désignation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	public void initArticle(String d,double p,int q) {
		this.désignation=d;
		this.prix=p;
		this.quantité=q;
	}
	public  void afficherArticle() {
		System.out.println("***VOICI LES CARECTERISTIQUES DE VOS ARTICLES***");
		System.out.println("*Désignation*="+désignation+".");
		System.out.println("*Prix*="+prix+"DZD.");
		System.out.println("*Quantité*="+quantité+"Unités.");
	}
	public static void prixTTC(double prix,int TVA) {
		double prixTTC=0;
		prixTTC=prix+TVA;
		System.out.println("*Le prix a payer est *="+prixTTC+".");
	}
	
	public void  reduireStock(int quantité,int s) {
		int quantitéaprèsreduction;
		quantitéaprèsreduction=quantité-s;
		this.quantité=quantitéaprèsreduction;
		System.out.println("*Quantité En STOCK est*="+quantitéaprèsreduction+"Unités.");
	}
	
	public  void augmenterStock(int a) {
		int quantitéapresajout=this.quantité;
		quantitéapresajout=quantitéapresajout+a;
		System.out.println("*Quantité En STOCK est*="+quantitéapresajout+"Unités.");
	}

}
