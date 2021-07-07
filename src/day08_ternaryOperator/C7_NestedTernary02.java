package day08_ternaryOperator;

import java.util.Scanner;

public class C7_NestedTernary02 {

	public static void main(String[] args) {


		/*
		 * Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		 * girilen degerlere  gore dikdorgenin kare olup olmadigini yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin uzunlugunu ve genisligini giriniz \nHer bir uzunluk girisinden sonra Enter'a basiniz");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		
		// System.out.println(kenar1==kenar2 ? "Dikdörtgen bir karedir " : "Dikdörtgen bir kare degildir");
		
		System.out.println(kenar1<=0 || kenar2<=0 ? "Lutfen gecerli bir uzunluk giriniz": kenar1==kenar2 ? "Dikdörtgen bir karedir " : "Dikdörtgen bir kare degildir" );
		
	}

}
