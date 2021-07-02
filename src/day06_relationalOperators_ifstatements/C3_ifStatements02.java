package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_ifStatements02 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi%2==1) {
			
			System.out.println("Girilen sayi tektir");
			
		}
		
		if (sayi%2==0) {
			
			System.out.println("Girilen sayi ciftir");
		}
		
		if (sayi<0) {
			
			System.out.println("Lutfen pozitif bir tam sayi giriniz");
		}
		
		scan.close();

	}

}
