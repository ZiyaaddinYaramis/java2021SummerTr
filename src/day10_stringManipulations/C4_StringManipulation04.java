package day10_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir cumle giriniz: ");

		String cumle = scan.nextLine().toLowerCase();

		int ilkJava = cumle.indexOf("java"); // -1 yada ilk java'nin index'ini
		int sonJava = cumle.lastIndexOf("java"); // -1 yada son java'nin index'ini

		if (ilkJava == -1) {

			System.out.println("cumle java icermiyor");

		} else if (ilkJava == sonJava) { // (ilkJava == sonJava) bu variable'r int oldugu icin equals() kullanilamaz  cunku int primitive data type'tir
			System.out.println("cumle 1 java kelimesi iceriyor");
		} else {
			System.out.println("cumle 1'den fazla java iceriyor");
		}

		
		scan.close();

	}

}
