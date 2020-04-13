package applicaton;

import java.util.Locale;
import java.util.Scanner;

import entities.produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter product name: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("price: ");
		double price = sc.nextDouble();
		
		System.out.print("quantity: ");
		int quantity = sc.nextInt();
		
		produto prod = new produto(name, quantity, price);
		
		System.out.println(prod);
		
		System.out.print("Add some items to the stock");
		prod.AddProducts(sc.nextInt());
		
		System.out.println(prod);

		System.out.print("Remove some items from the stock");
		prod.RemoveProducts(sc.nextInt());

		System.out.println(prod);
		
		sc.close();
	}

}
