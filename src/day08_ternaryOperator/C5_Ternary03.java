package day08_ternaryOperator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		
		
		
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		
		double sayi  = scan.nextDouble();
		
		// sayi>=0 ? sayi : -1*sayi; ==> Bu sekilde olmaz cunku ternary ' i yazdirmayacaksak  mutlaka bir variable icine assing etmeliyiz
		
		System.out.println(  sayi>=0 ? sayi : -1*sayi );
		
		// System.out.println(sayi>=0 ?  "Ternary Girdiginiz sayinin mutlak degeri : " + sayi : "Ternary Girdiginiz sayinizn mutlak degeri : " + -sayi);
		
		
		
		// if ile yapmak isteseydik
		
		
		if (sayi>0) {
			System.out.println("Girdiginiz sayinin mutlak degeri : " + sayi);
		} else {
			System.out.println("Girdiginiz sayinin mutlak degeri : " + -sayi);
		}
		

	}

}
