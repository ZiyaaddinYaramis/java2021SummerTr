package day07_ifElseStatements;

import java.util.Scanner;

public class C7_IfElseIf03 {

	public static void main(String[] args) {

		
		/*
		 * Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not�u harf sistemine cevirip yazdirin.
				50�den kucukse �D�, 
				50 60 arasi �C�, 
				60 80 arasi �B�, 
				80�nin uzerinde ise �A�
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Notunuzu giriniz");
		
		int not = scan.nextInt();
		
		if (not>=0 && not<50) {
			System.out.println("Notunuz : D");
		} else if(not>=50 && not<60) {
			System.out.println("Notunuz : C");
		} else if(not>=60 && not<80) {
			System.out.println("Notunuz : B");
		} else if(not>=80 && not<=100){
			System.out.println("Notunuz : A");
		} else {
			System.out.println("Lutfen gecerli bir not giriniz");
		}
		
		
		
		
		// Bir baska yol
		
		/*
		 *  double not=scan.nextDouble();
        
        if (not<0 || not>100) {
            System.out.println("Lutfen gecerli not giriniz");
        } else if (not<50) {
            System.out.println("Notunuz D");
        } else if (not<=60) { // 21.satirla birlikte dusundugumde 50 - 60 arasi demek
            System.out.println("notunuz C");
        } else if (not<=80) { // 21 ve 23. satirla birlikte 60-80 arasi demek
            System.out.println("Notunuz B");
        } else {
            System.out.println("notunuz A");
        }
		 */
		
	}

}
