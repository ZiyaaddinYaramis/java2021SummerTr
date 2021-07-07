package day08_ternaryOperator;

import java.util.Scanner;

public class C8_BireyselCalisma_ArtikYil_IfElse_Nested {

	public static void main(String[] args) {
		
		
		 /*
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
       
       Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
       Kural 2: 4�un kati olmasina ragmen 100 ile    bolunebilen yillardan 
                sadece 400�un kati olan yillar artik yildir
        */
       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Lutfen artik yil kontrolu icin bir yil giriniz");
       
       int yil= scan.nextInt();
       
       
       // If Else Nested ile c�zumu;
       
       
       if (yil%4!=0) { // 4'e b�lunemeyen
    	   
		System.out.println("Artik yil degildir");
		
	} else { // 4'e b�lunebilen
		
		if (yil%100==0 && yil%400==0) { // 4'e b�lunen 100'e b�lunen  400'e b�lunen
			
			System.out.println("Artik yil");
			
		} else if(yil%100==0 && yil%400!=0){  // 4'e b�lunen 100'e b�lunen  400'e b�lunemeyen
			
			System.out.println("Artik yil degildir");
			
		} else {
			
			 System.out.println("Girdiginiz yil artik yil"); 
		}
	}
		
		
		
		
	}

}
