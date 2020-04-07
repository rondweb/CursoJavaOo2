package entities;

public class produto {
	public String name;
	public double price;
	public int quantity;
	
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
