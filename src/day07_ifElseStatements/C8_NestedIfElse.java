package day07_ifElseStatements;
import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {

				// Kullanicidan cinsiyet ve yas aliniz
				// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
				// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
				// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen cinsiyetinizi giriniz. \nErkek icin E,  Kadin icin K.");
		
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas = scan.nextInt();
		
		
		
		  if (cinsiyet=='K') {
			
			if (yas>=60) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin \nDaha" +(60-yas) + "yil calismalisin");
			}
			
		} else if(cinsiyet =='E') {
			
			if (yas>=65) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin \nDaha" +(65-yas) + "yil calismalisin");
			}

		} else {
			
			System.out.println("Erkek icin E, Kadin icin K giriniz");
		}
		  
		
		
		  scan.close();

	}

}
