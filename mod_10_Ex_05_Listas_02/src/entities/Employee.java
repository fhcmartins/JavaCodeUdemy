package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	//Construtor Padrao
	public Employee() {
		
	}
	
	//Constructor
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//Getters
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	//Setters
	public void setId (Integer id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setSalary (Double salary) {
		this.salary = salary;
	}
	
	//Calculo do salario
	public void increaseSalary(double percentage) {
		salary += (salary * percentage) / 100;
	}
	
	//toString
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ salary;
	}	
	
}
