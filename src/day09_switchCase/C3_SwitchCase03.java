package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		
		
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        
        String gun = scan.next().toLowerCase(); 
        
        switch (gun) {
        case "pazartesi": 
        case "sali":  
        case "carsamba":  
        case "persembe":
        case "cuma":
            System.out.println("Hafta ici");
            break;
        case "cumartesi":
        case "pazar":
            System.out.println("Hafta sonu");
            break;
        default:
            System.out.println("Lutfen gecerli bir gun giriniz");   
        }
        
        scan.close();
	}

}
