package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	
	// Atributos básicos
	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	// Associacoes
	// Aqui temos um trabalhador em um Departamento
	private Department department;
	
	
	/*
	 * Nessa associcacao temos um trabalhador com varios contratos
	 * Entao nao vamos utilizar essa lista no construtor e ja
	 * iremos cria-la com uma nova lista.
	*/
	private List<HourContract> contracts = new ArrayList<>();
	
	// Construtor padrao
	public Worker() {
		
	}
	
	// Construtor
	public Worker(String name, WorkLevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkLevel getLevel() {
		return level;
	}
	
	public void setLevel(WorkLevel level) {
		this.level = level;
	}
	
	public Double setBaseSalary() {
		return baseSalary;
	}
	
	public void getBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts(){
		return contracts;
	}
	
	/*
	 * O trabalhador tem uma lista de contratos, a qual irá inicar vazia.
	 * Depois poderão ser adicionados ou removidos outros contratos desta lista.
	 * Mas de forma alguma essa lista não poderá ser trocada por outra lista.
	 * Por isso essa parte do códiog não será executada.
	 */
	/*
	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	*/
	
	// Metodo addContract - Faz a associacao do trabalhador ao contrato
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// Metodo removeContract- Desfaza associacao do trabalho ao contrato.
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_mounth = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_mounth) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}




















