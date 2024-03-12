package PSI_M9;

import java.util.Scanner;

import javax.swing.JSpinner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada luzEmergencia = new Lampada();
		Scanner scanner  = new Scanner(System.in);
		int op = 0;
		
		do {
			System.out.println(luzEmergencia.toString());
			menu();
			op = scanner.nextInt();
			switch (op) {
			case 1:
				luzEmergencia.acender();
				break;
			case 2:
				luzEmergencia.apagar();
				break;
			case 0:
				System.out.println("Obrigado por usar o programa");
				break;

			default:
				System.out.println("Opção Invalida");
				break;
			}
			
		}while(op != 0);
		
		scanner.close();
	
}
	private static void menu()
	{
		System.out.println("--------------------");
		System.out.println("1-Ligar");
		System.out.println("2-Desligar");
		System.out.println("0-Sair");
		System.out.println("--------------------");
		System.out.println("Digite a opção: ");
	}
}