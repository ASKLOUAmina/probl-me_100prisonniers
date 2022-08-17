package exam;

public class PrisonnierIntelligent extends Prisonnier {
	
	public PrisonnierIntelligent(int numero ){
		super(numero);
		
	}
	
	public void  ouvreCoffres(Coffre[] cf) {
		int current_coffre = cf[this.getNumero()].getValeur();
		int coffre_suivant = 0;
		for(int i = 0 ;i< 50 ; i++) {
			
			if( this.getNumero() == current_coffre) {
				this.setSortie(true);
				break;
			}else {
				coffre_suivant = cf[current_coffre].getValeur();
				current_coffre = cf[coffre_suivant].getValeur();
			}
		}
	}

}
