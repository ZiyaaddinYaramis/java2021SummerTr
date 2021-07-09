package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElseIf01 {

	public static void main(String[] args) {


		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        // eger uzunluklardan birisi 0 veya daha kucukse 
        // "gecerli uzunluk giriniz" yazdirin, 
        // uzunluklarin ikisi de pozitif ise
        // dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Dikdörtgenin iki adet kenar uzunlugu giriniz \nBirinci kenari girdikten sonra Enter'a basiniz");

		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("Lutfen gecerli bir uzunluk giriniz");
		} else if (kenar1 == kenar2) {
			System.out.println("Dikdörtgen bir karedir");
		} else {
			System.out.println("Dikdörtgen bir kare degildir");
		}
		
		
		scan.close();
		
		
	}

}
