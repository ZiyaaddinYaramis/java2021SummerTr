package day07_ifElseStatements;

import java.util.Scanner;

public class OdevSoru05 {

	public static void main(String[] args) {


		/*
		 * Kullanicidan 4 basamakli bir sayi girmesini isteyin 
		 * 
		 * Girdigi sayi 5 ’e bölünüyorsa;
		 * 
		 * Son rakamini kontrol edin Son rakami 0 ise ekrana "5 ’e bölünen çift sayi" yazdirin 
		 * Son rakami 0 degil ise 5 ’e bölünen tek sayi” yazdirin
		 * Girdigi password 5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdirin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		
		if (sayi>=1000 && sayi <= 9999) {
			
			if (sayi%5==0 && sayi%10==0) {
				
				System.out.println("5 ’e bölünen çift sayi");
				
			} else if (sayi%5==0 && sayi%10==5) {
				
				System.out.println("5 ’e bölünen tek sayi");
				
			} else {
				
				System.out.println("Girdiginiz sayi 5'e bölunemez");
			}
			
		} else {
			
			if (sayi<=0) {
				System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz");
			} else {
				System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
			}
						
		}

	}

}
