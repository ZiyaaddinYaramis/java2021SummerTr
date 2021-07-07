package day08_ternaryOperator;

import java.util.Scanner;

public class C8_BireyselCalisma_ArtikYil_IfElse_Nested {

	public static void main(String[] args) {
		
		
		 /*
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
       
       Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
       Kural 2: 4’un kati olmasina ragmen 100 ile    bolunebilen yillardan 
                sadece 400’un kati olan yillar artik yildir
        */
       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Lutfen artik yil kontrolu icin bir yil giriniz");
       
       int yil= scan.nextInt();
       
       
       // If Else Nested ile cözumu;
       
       
       if (yil%4!=0) { // 4'e bölunemeyen
    	   
		System.out.println("Artik yil degildir");
		
	} else { // 4'e bölunebilen
		
		if (yil%100==0 && yil%400==0) { // 4'e bölunen 100'e bölunen  400'e bölunen
			
			System.out.println("Artik yil");
			
		} else if(yil%100==0 && yil%400!=0){  // 4'e bölunen 100'e bölunen  400'e bölunemeyen
			
			System.out.println("Artik yil degildir");
			
		} else {
			
			 System.out.println("Girdiginiz yil artik yil"); 
		}
	}
		
		
		
		
	}

}
