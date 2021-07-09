package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {


		
	/*
	 * Soru 1) Kullanicidan email adresini girmesini isteyin, 
	 * mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”, 
	 * icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
	 */

		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen email giriniz");
		
		String mail =scan.next();
		
		
		if (mail.contains("@gmail.com")) {
			System.out.println("Mail adresiniz kaydedildi");
		} else {
			System.out.println("Lutfen gmail mail adresi giriniz");
		}
		
		
		if (mail.indexOf("@gmail.com") == -1) {
			System.out.println("Lutfen gmail mail adresi giriniz");
		} else {
			System.out.println("Mail adresiniz kaydedildi");
		}
		
		
		scan.close();
	}
	

}
