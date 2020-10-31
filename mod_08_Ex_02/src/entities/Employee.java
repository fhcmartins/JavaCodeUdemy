package entities;

public class Employee {
	public String name;
	public double grossSalary; //Salario bruto
	public double tax;
	
	public double netSalary() { //Salario liquido
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary * percentage)/100.0;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}