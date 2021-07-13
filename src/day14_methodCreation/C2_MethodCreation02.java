package day14_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {


	/*
	 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
	 * Kullanici 2,3 veya 4 degerini girerse, 
	 * kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
	 * Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
	 * “Cok sayi girdiniz, ben toplayamam” yazdirin.
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kacsayi toplamak istediginizi giriniz");

		int kacSayi=scan.nextInt();
		
		if (kacSayi<2) {
			
			System.out.println("Toplamak icin en az 2 sayi girmelisiniz");
			
		} else if (kacSayi==2) {

			ikiSayininToplami();
			
		} else if(kacSayi==3 ) {
						
			ucSayininToplami();

		} else if(kacSayi==4) {
						
			dortSayininToplami();
			
		} else {
			
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
		scan.close();
	}

	private static void dortSayininToplami() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Girmek istediginiz dört sayiyi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		int sayi4= scan.nextInt();
		System.out.println("dort sayi girmeyi tercih ettiniz "
                + "\nGirilen dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		scan.close();
	}

	private static void ucSayininToplami() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Girmek istediginiz uc sayiyi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		int sayi3= scan.nextInt();
		System.out.println("uc sayi girmeyi tercih ettiniz "
                + "\nGirilen uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayininToplami() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Girmek istediginiz iki sayiyi giriniz");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		System.out.println("iki sayi girmeyi tercih ettiniz "
                + "\nGirilen iki sayinin toplami : " +sayi1+sayi2);
		scan.close();
	}

}
