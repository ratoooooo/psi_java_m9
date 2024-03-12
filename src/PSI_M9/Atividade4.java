package PSI_M9;

import java.util.Scanner;

import javax.swing.Spring;

public class Atividade4 {

	public static void main(String[] args) {
		int op;
		Pessoa 	pessoa =  new Pessoa();
		Scanner ler  = new Scanner(System.in);
		String nome;
		int idd;
		double altura;
		
		do {
			menu();
			System.out.println("Escolha uma opção");
			op = ler.nextInt();
			switch (op) 
			{
				case 1:
					System.out.println("Insira os dados");
					
					System.out.println("Nome: ");
					nome = ler.next();
					pessoa.setNome(nome);
					
					System.out.println("Idade");
					idd = ler.nextInt();
					pessoa.setIdd(idd);
					
					System.out.println("Altura: ");
					altura = ler.nextDouble();
					pessoa.setAltura(altura);
					break;
				case 2:
					if(pessoa.getNome().equals(""))
					{
						System.out.println("A pessoa ainda não foi registada");
					}
					else
					{
						System.out.println(pessoa.toString());
					}
					break;
				case 3:
					System.out.println("Insira o novo nome da pessoa");
					nome = ler.next();
					pessoa.setNome(nome);
				case 4:
					System.out.println("Insira o novo nome da pessoa");
					idd = ler.nextInt();
					pessoa.setIdd(idd);
				case 5:
					System.out.println("Insira a nova altura da pessoa");
					altura = ler.nextDouble();
					pessoa.setAltura(altura);
					break;
				case 0:
					System.out.println(("Obrigado por usar o programa"));
					break;
				default:
					System.out.println("Obrigado por usar o programa");
					break;
			}
		} while (op != 0);
		
		ler.close();
	}
	
	private static void menu()
	{
		System.out.println("-----Menu Pessoa-----");
		System.out.println("1-Registar");
		System.out.println("2-Consultar");
		System.out.println("3-Alterar Nome");
		System.out.println("4-Alterar Idade");
		System.out.println("5-Alterar Altura");
		System.out.println("0-Sair");
	}
}
