package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//M�todo calcula total no estoque
	public double totalValueInStock(){
		return price * quantity;
	}
	
	//M�todo para adiconar produto no estoque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//M�todo para remover produto do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price) //formatando para mostrar duas casas decimais
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
