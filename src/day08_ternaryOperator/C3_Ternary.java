package day08_ternaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {


		int sayi=75;
		
		String sonuc = sayi%2==0 ? "Sayi cift" : "Sayi tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi>100 ?"Sayi100'den buyuk " : 10);
		
		// Direk yazdirdigimiz  zaman sonuclarin ikiside ayni cinsten olmak zorunda degil
		
		// String sonuc1 = sayi>100 ? "Sayi 100'den buyuk" : 10 ;
		// Farkli data turundeki sonuclar icin atamam yapamayiz
		
		
		int y = 1;
        int z = 1; 
        
        int a = y<10 ? y++ : z++;
        
        // a= 1 
        // y= 2
        
        System.out.println(y + "," + z + "," + a);  // 2,1,1

	}

}
