package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	//Construtor padrao
	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Sobrecarga. Outro construtor com os valoes que eu desejo. Neste caso name e
	// price.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// M�todo calcula total no estoque
	public double totalValueInStock() {
		return price * quantity;
	}

	// M�todo para adiconar produto no estoque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// M�todo para remover produto do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) // formatando para mostrar duas casas decimais
				+ ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
