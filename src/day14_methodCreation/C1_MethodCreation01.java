package day14_methodCreation;

import java.util.Scanner;

public class C1_MethodCreation01 {

	

	public static void main(String[] args) {


		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, 
		 * sifirdan buyuk mu kucuk mu oldugunu, 
		 * ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 * 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");

		int sayi=scan.nextInt();
		
		
		
		tekMiCiftMi(sayi);
		pozitifMiNegatifMi(sayi);
		yuzdenBuyukMuKucukMu(sayi);

	}

	public static void yuzdenBuyukMuKucukMu(int sayi) {

		if (sayi<100) {
            System.out.println("girdiginiz sayinin birler basagi : " + (sayi%10));
        } else { // sayi 100'den buyuk  455254
            
            int rakamlarToplami=0;
            int rakam=0;
            
            rakam=sayi%10;  //4
            rakamlarToplami+=rakam; //4
            sayi/=10; // 45525
            
            rakam=sayi%10; // 5
            rakamlarToplami+=rakam; // 9
            sayi/=10; // 4552
            
            rakam=sayi%10; // 2
            rakamlarToplami+=rakam; // 11
            
            System.out.println("sayinin birler,onlar ve yuzler basamagindaki rakamlar toplami : " + rakamlarToplami);
		
        }	
		
	}

	public static void pozitifMiNegatifMi(int sayi) {
	
		if (sayi>0) {
			System.out.println("Girdiginiz sayi Pozitiftir");
		} else if(sayi<0){
			System.out.println("Girdiginiz sayi Negatiftir");
		} else {
			System.out.println("Girdiginiz sayi Pozitif yada Negatif degildir sayi=0");
		}
		
	}

	public static void tekMiCiftMi(int sayi) {
		if (sayi%2==0) {
			System.out.println("Girdiginiz sayi Ciftir");
		} else {
			System.out.println("Girdiginiz sayi Tektir");
		}
		
	}

	
	
	
}
