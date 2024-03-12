package projetosFinais_M9;

public class Calculadora {
	private double num1;
	private double num2;
	private double resultado;

	public Calculadora() {
		num1 = 0;
		num2 = 0;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double somarNumeros(double num1, double num2) {
		return resultado = num1 + num2;
	}

	public double subtrairNumeros(double num1, double num2) {
		return resultado = num1 - num2;
	}

	public double multiplicarNumeros(double num1, double num2) {
		return resultado = num1 * num2;
	}

	public double dividirNumeros(double num1, double num2) {
		return num1 / num2;
	}

	public String toString(double num1, double num2) {
	    String result = "";

	    result += num1 + " + " + num2 + " = " + somarNumeros(num1, num2) + "\n";
	    result += num1 + " - " + num2 + " = " + subtrairNumeros(num1, num2) + "\n";
	    result += num1 + " x " + num2 + " = " + multiplicarNumeros(num1, num2) + "\n";

	    if (num2 != 0) {
	        result += num1 + " / " + num2 + " = " + dividirNumeros(num1, num2) + "\n";
	    } else {
	        result += "Cannot divide by zero.\n";
	    }

	    return result;
	}

}
