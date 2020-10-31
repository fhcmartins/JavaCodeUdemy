package entities;

public class Department {
	
	private String name;
	
	// Construtor padrão
	public Department() {
		
	}
	
	// Construtor com conteúdo
	public Department(String name) {
		this.name = name;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
