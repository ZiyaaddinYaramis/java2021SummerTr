package day06_relationalOperators_ifstatements;

public class C2_ifStatements01 {

	public static void main(String[] args) {


		int a=2;
		int b=3;
		
		if (a>b) {
			
			System.out.println("a b'den buyuk");
		}
		if (a==b) {
			
			System.out.println("sayilar esit");
		}
		if (a>b || a+b<10) {
			
			System.out.println("yasasin java"); // sartin sonucu true ise if body calisir
												// false ise if body calismaz,
												// body calissa da calismasada body'den sonraki satira gider
		}
		if (a+b<0 || a*b>20) {
			
			System.out.println("bitti bu is");
		}
		
	}

}