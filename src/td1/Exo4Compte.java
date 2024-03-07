package td1;

public class Exo4Compte {
	int NuméroCpte;
	String nomTitulaire;
	double solde;
	public Exo4Compte(int n, String nm, double s) {
		n=this.NuméroCpte;
		nm=this.nomTitulaire;
	    s=this.solde;
	}
	public static void crediterCompte(double credit,double solde) {
		if(credit<0) {
			System.out.println("le credit entrer doit etre un nombre positif");
		}else {
			solde=credit+solde;
		}
		System.out.println("le nouveau montant est"+solde);
	}
	
    public static void debiterCompte(double solde,double debit) {
    	if(solde>=debit) {
    		solde=solde-debit;
    	}else {
    		System.out.println("vous ne pouvez pas débiter votre solde est inssufisant");
    	}
    	System.out.println("votre solde actuel est solde="+solde+"$");
    }
    public static void affichagesolde(double solde) {
    	System.out.println("votre solde actuel est solde="+solde+"$");
    }
}
