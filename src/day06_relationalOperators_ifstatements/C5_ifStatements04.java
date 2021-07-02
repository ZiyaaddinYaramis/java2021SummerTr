package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_ifStatements04 {

	public static void main(String[] args) {

	/*
	 * Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
	 */
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen iki adet tam sayi kenar uzunlugu giriniz");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		if (kenar1==kenar2) {
			
			System.out.println("Girdiginiz dikdörtgen bir kare");
		}
		
		
		if (kenar1!=kenar2) {
			
			System.out.println("Girdiginiz dikdörtgen bir kare degil");
		}
		

	}

}
