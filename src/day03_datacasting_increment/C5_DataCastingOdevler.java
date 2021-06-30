package day03_datacasting_increment;

import java.util.Scanner;

public class C5_DataCastingOdevler {

	public static void main(String[] args) {
		/*
		 *  Soru 1 )
			byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
			birer degisken olusturup adim adim widening yapin ve yazdirin
			
			
			Soru 2 )
			int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
			
			
			
			Soru 3 )
			Float data turunde bir variable olusturun ve yazdirin
			
			
			Soru 4 )
			double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
			yazdirin
			
			
			Soru 5 )
			int 2 sayiyi birbirine boldurun ve sonucu yazdirin
			
			
			Soru 6 )
			int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
			
			
			Soru 7 )
			Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		*/
		
		
		// byte < short < int < long < float(ondalikli) < double(ondalikli)
		
		// double(ondalikli) > float(ondalikli) > long > int > short > byte
		
		
		/*
		   Soru 1 )
		byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
		birer degisken olusturup adim adim widening yapin ve yazdirin
		 */
		
		
		byte byteWidening = 126;
		short shortWidening = byteWidening;
		float floatWidening = shortWidening;
		double doubleWidening = floatWidening;
		
		System.out.println("byte degisken ile : " + byteWidening);
		System.out.println("short degisken ile : " + shortWidening);
		System.out.println("float degisken ile : " + floatWidening);
		System.out.println("double degisken ile : " + doubleWidening);
		
		
		/*
		 * Soru 2 )
			int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		 */
		 int intNarrowing = 126;
		 short shortNarrowing = (short) intNarrowing;		 
		 byte byteNarrowing = (byte) shortNarrowing;
		 
		 
		 
		 /*
		  * Soru 3 )
			Float data turunde bir variable olusturun ve yazdirin
		  */
		 
		 float soru3 = 126.6f;
		 System.out.println(soru3);
		 
		 
		 /*
		  * Soru 4 )
			double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
			yazdirin
		  */
		 
		 
		 double doubleSoru4 = 255.26;	 
		 int intSoru4 = (int) doubleSoru4;	 
		 byte byteSoru4 = (byte) intSoru4;
		 
		 System.out.println("double degisken ile soru4 :" + doubleSoru4);
		 System.out.println("int degisken ile soru4 :" + intSoru4);
		 System.out.println("byte degisken ile soru4 :" + byteSoru4);
		 
		 
		 /*
		  * Soru 5 )
			int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		  */
		 
		 int soru5a = 126;
		 int soru5b = 3;
		 
		 System.out.println("iki int degiskenin bölumu : " + soru5a / soru5b ); // not: islem önceliginden öturu parentez 
		                                                                       // kullanmaya gerek yoktur
		 
		 
		 /*
		  * Soru 6 )
			int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		  */
				 
		 int soru6Int = 123;
		 double soru6Double = 123.0;
		 
		 System.out.println("int degiskenin double degiskene bölumu : " +  soru6Int / soru6Double);
		 
		 // java iki farkli data type ile islem yaparken  buyuk olan data type i  sonuc degiskeni olarak döndurur 
		 // sonuc 1.0
		 
		 
		 /*
		  * Soru 7 )
			Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		  */
		 
		 byte soru7Byte = 12;
		 short soru7Short = 120;
		 int soru7Int = 1200;
		 double soru7Double = 12000.0;
		 
		 
		 
		 System.out.println("Farkli data tipleriyle dört islem (carpma ve bölme): " 
		 + ((soru7Double / soru7Int) * (soru7Short/soru7Byte)));
		 
		// java iki farkli data type ile islem yaparken  buyuk olan data type i  sonuc degiskeni olarak döndurur 
		// sonuc 100.0
		
		 System.out.println("Farkli data tipleriyle dört islem (toplama ve cikarma): " 
		 + ((soru7Double - soru7Int) + (soru7Short-soru7Byte)));
		 
		// java iki farkli data type ile islem yaparken  buyuk olan data type i  sonuc degiskeni olarak döndurur 
		// sonuc 10908.0
		 
		 
		 

	}

}
