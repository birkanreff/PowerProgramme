package powerProramme;

import java.util.Scanner;

public class powerProgrammeTest {

	public static void main(String[] args) {
		
		int b,p;
		int carpim = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Üssü alınacak sayıyı giriniz: ");
		b = input.nextInt();
		
		System.out.println("Üs değerini giriniz: ");
		p = input.nextInt();
		
		for (int i = 1; i <= p; i++) {
			
			carpim *= b;
			
			
		}
		
		System.out.println(b +" sayısının " + p + ". kuvveti: " + carpim);
		

	}

}
