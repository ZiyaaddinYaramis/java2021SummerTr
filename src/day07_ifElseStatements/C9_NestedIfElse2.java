package day07_ifElseStatements;

import java.util.Scanner;

public class C9_NestedIfElse2 {

	public static void main(String[] args) {


		/*
		 *  Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
			Kullanicidan bir sifre girmesini isteyin

			Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin 
			
			Ilk harf A ise
				?Gecerli Sifre? degilse ?Gecersiz Sifre? yazdirin
				
			Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin 
			
			Ilk harf z ise
				?Gecerli Sifre? degilse ?Gecersiz Sifre? yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		
		
		char sifreIlkHarf = scan.next().charAt(0);
		
		
		if (sifreIlkHarf>='A' && sifreIlkHarf<='Z') {
			if (sifreIlkHarf=='A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		} else if (sifreIlkHarf>='a' && sifreIlkHarf<='z'){ 
			if (sifreIlkHarf=='z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		} else {
			System.out.println("Lutfen gecerli bir karekter giriniz \nSifrenin ilk karekteri harf olmalidir");
		}
		
		scan.close();
	}

}
