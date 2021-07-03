package day07_ifElseStatements;

import java.util.Scanner;

public class C1_ifStatements {

	public static void main(String[] args) {


		/*
		 * Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
  			Ornek:  gun=Pazar  output = “Hafta sonu”
 					gun=Sali   output = “Hafta ici”
		 	
		 	*** String icin equals method’unu kullanin
		 */
		
		
		
		// bayrak kullanimi
		
		int flag = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gun = scan.next().toUpperCase();
		
		
		if (gun.equals("PAZAR") || gun.equals("CUMARTESI")) {
			
			System.out.println("Girdiginiz gun hafta sonu");
			
			flag++;
		}
		
		if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") 
				|| gun.equals("PERSEMBE") || gun.equals("CUMA")) {
			
			System.out.println("Girdiginiz gun hafta ici");
			
			flag++;
		}
		
		
		if (flag == 0) {
			
			System.out.println("Lutfen gecerli bir Gun ismi giriniz");
			
		}
		scan.close();
		
		
	}

}
