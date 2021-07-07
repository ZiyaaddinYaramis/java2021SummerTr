package day08_ternaryOperator;

import java.util.Scanner;

public class C9_BireyselCalisma_ArtikYil_IfElse {

	public static void main(String[] args) {


		/*
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        
       Kural 1: 4 ile bolunemeyen yillar artik yil degildir
       Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
       Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan 
                sadece 400’un kati olan yillar artik yildir 
        */
       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Lutfen artik yil kontrolu icin bir yil giriniz");
       
       int yil= scan.nextInt();
       
       
       // If Else ile cözumu;
       
       
       
       if (yil%4!=0) { // 4 e bölunemez
		System.out.println("Artik Yil Degildir");
	} else if (yil%100!=0) { // 4 e bölunur  100 e bölunemez
		System.out.println("Artik yil");
	} else if (yil%400==0) { // 4 e bölunur  100 e bölunur  400 e bölunur
		System.out.println("Artik yil");
	} else {
		System.out.println("Artik yil Degildir");
	}
		
       scan.close();
	}

}
