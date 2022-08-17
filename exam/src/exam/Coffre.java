package exam;

public class Coffre {
	private int numero;
	public static int NB_PRISONNIERS = 100;
	private static int[] tableau = new int[100];
	private static int compteur = 0;
	private static int r;

	public Coffre(int numero) {
		this.numero = numero;
		Coffre.tableau[this.numero] = this.numero;
		Coffre.compteur++;
		Coffre.r = (int) (Math.random() * 100);
	}

	public int getValeur() {
		return Coffre.tableau[this.numero];
	}

	public static void shuffle() {
		for(int i= 0 ;i<Coffre.tableau.length; i++) {
			int index = (int)(Math.random()*(Coffre.tableau.length-i));
			int sh = 	Coffre.tableau[index];
			Coffre.tableau[index]= Coffre.tableau[i];
			Coffre.tableau[i]= sh;
		}
	}

	public String toString() {	
		return "Coffre{numéro=" + this.numero + ", valeur=" + this.getValeur() + "}";
	}
}
