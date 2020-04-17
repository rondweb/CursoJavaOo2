package entities;

public class produto {
	private String name;
	private double price;
	private int quantity;
	
	public produto() {
		
	}
	
	public produto(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public produto(String name, int quantity, double price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}	
	
	public double TotalValueInStock() {
		return this.quantity * this.price;
	}
	
	public void AddProducts(int quantity)
	{
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	
	public String toString() {
		return this.name 
				+ ", price " 
				+ String.format("%.2f", this.price)  
				+ " Total $" 
				+ String.format("%.2f", this.TotalValueInStock());
	}
}
