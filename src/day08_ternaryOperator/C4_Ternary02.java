package day08_ternaryOperator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {


		//Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz");
		
		
		double sayi1  = scan.nextDouble();
		double sayi2  = scan.nextDouble();
		
		
		// Direk yazdirin dedigi icin bir deger atamakla ugrasmayacagiz 
		
		
		System.out.println(sayi1>sayi2 ? "Ikinci girdiginiz sayi " +sayi2:"Birinci girdiginiz sayi "+sayi1);
		System.out.println(sayi2>sayi1 ? "Birinci girdiginiz sayi " +sayi1:"Ikinci girdiginiz sayi "+sayi2);
		 
		// kullanicinin girdigi iki sayininda esit olmasi durumunda  syso icindeki  sart false olacagi icin  ternary'nin false body'si calisacaktir
		
		if (sayi1>sayi2) {
			System.out.println("Ikinci girdiginiz sayi "+sayi2);
		} else if(sayi2>sayi1) {
			System.out.println("Birinci girdiginiz sayi " +sayi1);
		} else {
			System.out.println("Girdiginiz sayilar birbirine esit " + sayi1 + " = "+ sayi2);
		}
		
		scan.close();
		
	}

}
