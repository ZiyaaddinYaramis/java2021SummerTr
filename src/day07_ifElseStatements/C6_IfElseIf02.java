package day07_ifElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {


		 /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin 
        		
        		Ornek:     gun=Pazar     output = “Hafta sonu”
        				   gun=Sali      output = “Hafta ici”
        				   
        *** String icin equals method’unu kullanin
        */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir gun adi giriniz ");
		
		String gun = scan.next().toLowerCase();
		
		
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			
			System.out.println("Hafta sonu");
			
		} else if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") 
				|| gun.equals("persembe") || gun.equals("cuma")){
			
			System.out.println("Hafta ici");
			
		} else {
			System.out.println("Lutfen gecerli bir gun adi giriniz");
		}

		scan.close();
	}

}
