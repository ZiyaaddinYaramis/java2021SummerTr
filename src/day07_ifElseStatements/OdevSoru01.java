package day07_ifElseStatements;

import java.util.Scanner;

public class OdevSoru01 {

	public static void main(String[] args) {


		
		/*
		 * Soru 4) 	Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
					birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
					“Eskenar degil”
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sirasi ile bir ucgenin 3 kenar uzunlugunu giriniz \nLutfen her kenar uzunlugundan sonra Enter'a basiniz");
		
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();
		
		
		if (kenar1 == kenar2 && kenar2== kenar3) {
			System.out.println("Girdiginiz ucgen eskenar ucgendir");
		} else {
			System.out.println("Girdiginiz ucgen eskenar ucgen degildir");
		}
		
		
		//Not: javada 3 tane ard arda karsilastirma operatöru kullanilamaz 
		//Örn; kenar1 == kenar2 == kenar3 ==> Olamaz
		

	}

}
