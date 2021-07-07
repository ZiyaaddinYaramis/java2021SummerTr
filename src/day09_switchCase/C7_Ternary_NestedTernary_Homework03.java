package day09_switchCase;

import java.util.Scanner;

public class C7_Ternary_NestedTernary_Homework03 {

	public static void main(String[] args) {


		/*
		 * Soru 5 ) Kullanicidan bir sayi alin ve sayi 
		 * 3 basamakli ise “uc basamakli sayi”,
		 * yoksa “Uc basamakli degil” yazdirin
		 */
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		
		
		System.out.println(sayi>=100 && sayi<=999 ? "uc basamakli pozitif sayi" : 
			       sayi<=-100 && sayi>= -999? "uc basamakli negatif sayi" : "uc basamakli degil");
		
		
		
		
		
		// Ekranda Ne Goruruz
		
		// Soru 1 ) 

		int y = 8 ;
		
		int sonuc1 = (y > 5) ? (y<10 ? 2*y : 3*y ) : (y>10 ? 2+y : 3+y);
		
		System.out.println((y > 5) ? (y<10 ? 2*y : 3*y ) : (y>10 ? 2+y : 3+y));
		System.out.println(sonuc1);
		
		// Soru 2 ) 
	
		int y1 = 12;
		
		int sonuc2 =( y1 > 5 ) ? (y1<10 ? 2*y1 : 3*y1 ) :( y1>10 ? 2+y1 : 3+y1);
		System.out.println(sonuc2);
				
		// Soru 3 ) 

		int y2 = 5;
		
		int sonuc3 = (y2 > 5 ) ? (y2<10 ? 2*y2 : 3*y2 ) : (y2>10 ? 2+y2 : 3+y2);
		System.out.println((y2 > 5 ) ? (y2<10 ? 2*y2 : 3*y2 ) : (y2>10 ? 2+y2 : 3+y2));
		System.out.println(sonuc3);
		
		scan.close();

	}

}
