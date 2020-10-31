package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Construtor
	//Essse construtor ira obrigar a instacinar lgo no inicio nome, preco e qtde.
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

		
	//Método calcula total no estoque
	public double totalValueInStock(){
		return price * quantity;
	}
	
	//Método para adiconar produto no estoque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//Método para remover produto do estoque
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
