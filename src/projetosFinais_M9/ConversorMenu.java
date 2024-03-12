package projetosFinais_M9;

import java.util.Scanner;

public class ConversorMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conversor converter = new Conversor();
		Scanner ler = new Scanner(System.in);
		int op;
		double valor, valorConvertido ;
		
		do {
			menu();
			op = ler.nextInt();
			switch (op) {
			case 1:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterEuroToDolar(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
			    break;
			case 2:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterDolarToEuro(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
				break;
			case 3:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterEurotoReal(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
			    break;
			case 4:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterRealToEuro(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
			    break;
			case 5:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterKgToG(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
			    break;
			case 6:
			    System.out.println("Qual valor deseja converter: ");
			    valor = ler.nextDouble();
			    converter.setValor(valor);
			    valorConvertido = converter.converterGtoKg(valor);
			    System.out.println("Valor convertido: " + valorConvertido);
			default:
				break;
			}
		} while (op != 0);
		
	}
	
	private static void menu()
	{
		System.out.println("---Menu---"); 
		System.out.println("1-Euro to Dolar");
		System.out.println("2-Dolar to Euro");
		System.out.println("3-Euro to Real");
		System.out.println("4-Real to Euro");
		System.out.println("5-Kilograma to grama");
		System.out.println("6-Grama to Kilograma");
		System.out.println("Escolha uma opção");
	}

}
