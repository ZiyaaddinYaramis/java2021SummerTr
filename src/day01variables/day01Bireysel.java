package day01variables;

public class day01Bireysel {

	public static void main(String[] args) {

		// Ayni data turunde birden fazla variable tek komutta deklare edilebilir
		int level, yas, maas;
		level = 5;
		yas = 8;
		maas = 5000;
		
		System.out.println(level + yas + maas); // hata giderilmesi icin yazildi

		// Ayni data turunde birden fazla variable tek komutta deklara edilip deger
		// atanabilir
		int level1 = 5, yas1 = 8, maas1 = 5000;
		
		System.out.println(level1 + yas1 + maas1); // hata giderilmesi icin yazildi

		// Primitive Data Types

		/*
		 * 1) boolean Data Type : true veya false barindirir. Hafizada 1 bit kullanir
		 * Sadece dogru veya yanlis seklinde cevap verilebilecek variable’larda
		 * kullanilir
		 */

		boolean isExpensive = true;
		boolean isCold = false;

		System.out.println(isExpensive && isCold); // hata giderilmesi icin yazildi
		
		/*
		 * 2) char Data Type : Tek karakter barindirir. Hafizada 16 bit kullanir Harf,
		 * sayi veya sembol bakilmaksizin sadece 1 karakter kullanacak variable’larda
		 * kullanilir Note: char degerlerini single quote arasina yazilir.
		 */

		char letter = 'a';
		char digit = '3';
		char cymbol = '#';
		
		System.out.println(letter+digit+cymbol); // hata giderilmesi icin yazildi

		/*
		 * 3) byte Data Type: -128 den 127’e (dahil) tamsayilar icin kullanilabilir.
		 * Hafizada 8 bit kullanir
		 */

		byte age = 73;
		
		System.out.println(age); // hata giderilmesi icin yazildi

		/*
		 * 4) short Data Type: -32.768 den 32.767’e (dahil) tamsayilar icin
		 * kullanilabilir. Hafizada 16 bit kullanir
		 */

		short ilceNufusu = 27324;
		
		System.out.println(ilceNufusu); // hata giderilmesi icin yazildi

		/*
		 * 5) int Data Type: -2.147.483.648 den 2.147.483.647’e (dahil) tamsayilar icin
		 * kullanilabilir. Hafizada 32 bit kullanir
		 */

		int turkiyeNufusu = 82324564;
		
		System.out.println(turkiyeNufusu); // hata giderilmesi icin yazildi

		/*
		 * 6) long Data Type: -9,223,372,036,854,755,808 den ,223,372,036,854,755,807’e
		 * (dahil) tamsayilar icin kullanilabilir. Hafizada 64 bit kullanir
		 */

		long dunyaYasi = 695521;
		
		System.out.println(dunyaYasi); // hata giderilmesi icin yazildi

		/*
		 * 7) float Data Type: Kucuk ondalik sayilar icin kullanilabilir. Hafizada 64
		 * bit kullanir
		 */

		float floatVar2 = 2.123456f;
		
		System.out.println(floatVar2); // hata giderilmesi icin yazildi

		// Not: float sayilarin sonunda “ f ” yazilmalidir, yazilmazsa java sayiyi
		// double kabul eder

		/*
		 * 8) double Data Type: Buyuk ondalik sayilar icin kullanilabilir. Hafizada 64
		 * bit kullanir
		 */
		
		double doubleVar2 = 2.12345679078000000000123;
		
		System.out.println(doubleVar2); // hata giderilmesi icin yazildi

	}

}
