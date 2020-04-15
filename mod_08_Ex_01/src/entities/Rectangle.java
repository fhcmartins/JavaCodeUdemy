package entities;

public class Rectangle {
	public double base;
	public double altura;
	
	//calculando a area
	public double area() {
		double a = base * altura;
		return a;
	}
	
	//calculando o perímetro
	public double perimeter() {
		double p = 2 * (base + altura);
		return p;
	}
	
	//calculando a diagonal
	public double diagonal() {
		//d^2 = base^2 + altura^2 ou d = raizQuadrada(b^2 + h^2)
		double d = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		return d;
	}
	
}
