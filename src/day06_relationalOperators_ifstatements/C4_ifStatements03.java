package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_ifStatements03 {

	public static void main(String[] args) {


		/*
		 * 	Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
 			
 			Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe” 
 					ilkHarf=S output = “Sali”
		 	
		 	*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen  bir gun'un ilk harfini giriniz");
		
		char gunIlkHarf = scan.next().toUpperCase().charAt(0);
		
		if (gunIlkHarf == 'P') {
			
			System.out.println("Pazar, Pazartesi , Persembe");
		}
		
		if (gunIlkHarf == 'S') {
			
			System.out.println("Sali");
			
		}
		
		if (gunIlkHarf == 'C') {
			
			System.out.println("Carsamba, Cuma, Cumartesi");
			
		}
		
		if (gunIlkHarf!='P' && gunIlkHarf!='S' && gunIlkHarf!='C') {
			
            System.out.println("Lutfen gecerli bir harf yaziniz");
		}
		
		scan.close();
	}

}
