package applicaton;

import java.util.Locale;
import java.util.Scanner;

import entities.produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		produto prod = new produto();
		System.out.println("enter product name: ");
		System.out.print("name: ");
		prod.name = sc.nextLine();
		
		System.out.print("price: ");
		prod.price = sc.nextDouble();
		
		System.out.print("quantity: ");
		prod.quantity = sc.nextInt();
		
		System.out.println(prod.name + ", " + prod.price + "," + prod.quantity);
		sc.close();
		

	}

}
