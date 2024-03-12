package projetosFinais_M9;

public class CalculoIMC {

	//atributos
	private double altura;
	private double peso;
	private double imc;
	
	//construtor
	public CalculoIMC()
	{
		 peso = 0;
		 altura = 0;
		 imc = 0;
	}

	//metedo
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularIMC()
	{
		return  imc = peso / (altura * altura);
	}

	@Override
	public String toString() {
		return "O seu IMC é de: " + imc;
	}
	
	
}
