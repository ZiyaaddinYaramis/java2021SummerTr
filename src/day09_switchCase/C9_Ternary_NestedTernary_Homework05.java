package day09_switchCase;

import java.util.Scanner;

public class C9_Ternary_NestedTernary_Homework05 {

	public static void main(String[] args) {


		/*
		 * Soru 4 ) Kullanicidan bir sayi alin 
		 * Sayi pozitifse “Sayi pozitif” yazdirin, 
		 * negatifse sayinin karesini yazdirin
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println(sayi>=0? "Sayi Pozitiftir": sayi*sayi);
		
		scan.close();
	}

}
