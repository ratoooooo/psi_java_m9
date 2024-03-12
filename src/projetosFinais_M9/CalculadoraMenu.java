package projetosFinais_M9;

import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
        Scanner ler = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();
        calc.setNum1(num1);
        calc.setNum2(num2);
        System.out.println(calc.toString(num1, num2));
	}

}
