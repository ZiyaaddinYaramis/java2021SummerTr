package day09_switchCase;

import java.util.Scanner;

public class C8_Ternary_NestedTernary_Homework04 {

	public static void main(String[] args) {


		/*
		 * Soru 2 ) Kullanicidan bir harf isteyin 
		 * kucuk harf ise consola �Kucuk Harf� 
		 * buyuk harfse consola �Buyuk Harf� 
		 * yoksa �girdiginiz karakter harf degil� yazdirin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		System.out.println(harf>='A' && harf <='Z'  ? "Buyuk harf" : harf>='a' && harf <='z' ?  "Kucuk harf": "Girdiginiz karakter harf degil" );

		
		scan.close();
	}

}
