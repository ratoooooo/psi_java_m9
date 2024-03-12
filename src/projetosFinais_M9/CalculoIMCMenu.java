package projetosFinais_M9;

import java.util.Scanner;

public class CalculoIMCMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculoIMC imc = new CalculoIMC();
		Scanner ler = new Scanner(System.in);
		double altura, peso;
		
		System.out.println("Insira o peso");
		peso = ler.nextDouble();
		imc.setPeso(peso);
		
		System.out.println("Insira a altura");
		altura = ler.nextDouble();
		imc.setAltura(altura);
		
		imc.calcularIMC();
		System.out.println(imc.toString());
		ler.close();
		
	}

}
