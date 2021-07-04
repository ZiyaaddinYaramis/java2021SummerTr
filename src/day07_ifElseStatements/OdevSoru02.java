package day07_ifElseStatements;

import java.util.Scanner;

public class OdevSoru02 {

	public static void main(String[] args) {


		/*
		 * Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
					isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
					gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Lutfen gun ismini giriniz"); 
        
        String gunIsmi = scan.next(); 
        
        if (gunIsmi.equalsIgnoreCase("pazartesi") || gunIsmi.equalsIgnoreCase("pazar") ) {
			System.out.println("Paz");
		} else if(gunIsmi.equalsIgnoreCase("sali")){
			System.out.println("Sal");
		} else if (gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		} else if (gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		} else if (gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("Gecerli gun ismi giriniz");
		} 
			     
        scan.close();
        
        // equalsIgnoreCase() : methodu iki String'in buyuk, kucuk harf hassasiyeti olmadan 
        // esit olup olmadigini kontrol eder

	}

}
