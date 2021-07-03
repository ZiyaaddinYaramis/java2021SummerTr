package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdörtgenin kenarlarini giriniz \nilk kenari yazinca enter'a basiniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdörtgen kare");
		} else {
			System.out.println("Girdiginiz dikdörtgen kare degil");
		}
		
		
		
		scan.close();

	}

}
