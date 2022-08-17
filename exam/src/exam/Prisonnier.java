package exam;

public class Prisonnier {
	private int numero;
	private boolean sortie;
	private static int r;
	
	public Prisonnier(int numero) {
		this.numero = numero;
		this.sortie = false;
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void ouvreCoffres(Coffre[] cf) {
		for(int i = 0 ;i< 50 ; i++) {
			int index =  i + (int)(Math.random()*(Coffre.NB_PRISONNIERS -i));
			if(cf[index].getValeur() == this.numero) {
				this.sortie = true;
			}
		}
	}
	
	public void setSortie(boolean sortie) {
		 this.sortie = sortie;
	}
	
	public String toString() {
		return "Prisonnier{numéro=" + this.numero + ", sortie=" + this.sortie + "}";
	}
}
