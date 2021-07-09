package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime = scan.next().toLowerCase();
		
		// cumlede kelimenin  kullanilip kullanilmadigini yazdirin
		// indexOf() kullanalim
		
		if (cumle.indexOf(kelime)!= -1) {
			System.out.println("Girdiginiz cumlede kelime bulunmaktadir");
		} else {
			System.out.println("Girdiginiz cumlede kelime bulunmaktadir");
		}
		
		// contains() kullanalim
		
		if (cumle.contains(kelime)) {
			System.out.println("Girdiginiz cumlede kelime bulunmaktadir");
		} else {
			System.out.println("Girdiginiz cumlede kelime bulunmaktadir");
		}

		
		scan.close();
	}

}
