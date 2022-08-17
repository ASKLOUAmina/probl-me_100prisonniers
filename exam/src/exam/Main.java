package exam;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		partie 1
//		premier affichage
		System.out.println("************************   premier test   *****************************");
		Coffre[] lesCoffres = new Coffre[100];
		for (int i = 0; i < Coffre.NB_PRISONNIERS; i++) {
			lesCoffres[i] = new Coffre(i);
			System.out.println(lesCoffres[i]);
		}
// 		parite 1 
//		deuxieme affichage
		System.out.println("************************   deuxieme test   *****************************");

		Coffre.shuffle();
		for (int i = 0; i < 100; i++) {
			System.out.println(lesCoffres[i]);
		}
//		partie 2 
//		affichage 1
// 		troisième test
		System.out.println("************************   troisieme test   *****************************");

		Prisonnier[] lesPrisonniers = new Prisonnier[100];
		for (int i = 0; i < 100; i++) {
			lesPrisonniers[i] = new Prisonnier(i);
		}
		for (int i = 0; i < 100; i++) {
			lesPrisonniers[i].ouvreCoffres(lesCoffres);
			System.out.println(lesPrisonniers[i]);
		}

		System.out.println("************************   Quatrieme test   *****************************");

		Prisonnier[] lesPrisonniersIntelligents = new PrisonnierIntelligent[100];
		for (int i = 0; i < 100; i++)
			lesPrisonniersIntelligents[i] = new PrisonnierIntelligent(i);
		for (int i = 0; i < 100; i++) {
			lesPrisonniersIntelligents[i].ouvreCoffres(lesCoffres);
			System.out.println(lesPrisonniersIntelligents[i]);
		}

	}

}
