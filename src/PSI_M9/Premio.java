package PSI_M9;

import java.util.Random;

public class Premio {
	//atributos
	String[] premio = new String[4];
	
	//construtores
	public Premio()
	{
		premio[0] = "Carro";
		premio[1] = "Casa";
		premio[2] = "Moto";
		premio[3] = "Namorada";
	}
	
	public Premio(String premio1, String premio2, String premio3, String premio4)
	{
		premio[0] = premio1;
		premio[1] = premio2;
		premio[2] = premio3;
		premio[3] = premio4;
	}
	
	//metedos
	public String gerarPremio()
	{
		Random valor = new Random();
		int posicao = valor.nextInt(4);
				
		return premio[posicao];
	}
}
