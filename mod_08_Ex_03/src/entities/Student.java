package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	//metodo nota
	//media ponderada = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / p1 + p2 + p3
	public double finalGrade() {
		double nota = nota1 + nota2 + nota3;
		return nota;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f", finalGrade());
	}
}
