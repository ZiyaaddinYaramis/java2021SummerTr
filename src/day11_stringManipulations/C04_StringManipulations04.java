package day11_stringManipulations;

public class C04_StringManipulations04 {

	public static void main(String[] args) {


		String kkNo = "1234 5412 3654 4785";
		
		System.out.println(kkNo.replace(" ", ""));
		
		System.out.println(kkNo);
		
		// replaceAll()
		
		System.out.println(kkNo.replaceAll("\\s", ""));  // s sadece space
		System.out.println(kkNo.replaceAll("\\s", "*")); // s sadece space
		System.out.println(kkNo.replaceAll("\\S", "*")); // S space olmayan hersey
		System.out.println(kkNo.replaceAll("\\w", "-")); // harf veya rakamlarin hepsi
		System.out.println(kkNo.replaceAll("\\W", "#")); // harf ve rakamlarin disinda hersey
		System.out.println(kkNo.replaceAll("\\d", "0")); // digit(rakamlar)in hepsi
		System.out.println(kkNo.replaceAll("\\D", "a")); // digit(rakamlar)in disinda hersey
		
		
		System.out.println("=====================================================");
		
		String kkNo1 = "Java 123 @#";
		
		System.out.println(kkNo1.replace(" ", ""));
		
		System.out.println(kkNo1);
		
		// replaceAll()
		
		System.out.println(kkNo1.replaceAll("\\s", ""));  // s sadece space
		System.out.println(kkNo1.replaceAll("\\s", "*")); // s sadece space
		System.out.println(kkNo1.replaceAll("\\S", "*")); // S space olmayan hersey
		System.out.println(kkNo1.replaceAll("\\w", "-")); // harf veya rakamlarin hepsi
		System.out.println(kkNo1.replaceAll("\\W", "#")); // harf ve rakamlarin disinda hersey
		System.out.println(kkNo1.replaceAll("\\d", "0")); // digit(rakamlar)in hepsi
		System.out.println(kkNo1.replaceAll("\\D", "a")); // digit(rakamlar)in disinda hersey
		
		
		
		
		
	}

}
