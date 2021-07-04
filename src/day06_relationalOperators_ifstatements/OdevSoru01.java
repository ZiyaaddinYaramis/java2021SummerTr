package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class OdevSoru01 {

	public static void main(String[] args) {


		/*
		 * Soru 5) Kullanicidan bir gun alin eger gun 
		 * “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin. 
		 * “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. 
		 * “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gun = scan.nextLine().toUpperCase();
		
		if (gun.equals("CUMA")) {
			System.out.println("Muslumanlar icin kutsal gun");
		} else if(gun.equals("CUMARTESI")){
			System.out.println("Yahudiler icin kutsal gun");
		} else if(gun.equals("PAZAR")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		} else if(gun.equals("PAZARTESI") || gun.equals("SALI")|| gun.equals("CARSAMBA")|| gun.equals("PERSEMBE")) {
			System.out.println("Hic bir semavi din icin kulsal gun degil");
		} else {
			System.out.println("Lutfen  gecerli bir gun isimi giriniz");
		}
	
	}

}
