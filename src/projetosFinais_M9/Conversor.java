package projetosFinais_M9;

public class Conversor {

	//atributo
	private double valor;
	
	//construtor
	public Conversor()
	{
		valor = 0;
	}

	//metedos
	public double converterEuroToDolar(double valor)
	{
		return valor * 1.1;
	}
	
	public double converterDolarToEuro(double valor)
	{
		return valor / 1.2;
	}
	
	public double converterEurotoReal(double valor)
	{
		return valor * 5.34;
	}
	
	public double converterRealToEuro(double valor)
	{
		return valor / 5.34;
	}
	
	public double converterKgToG(double valor)
	{
		return valor * 1000;
	}
	
	public double converterGtoKg(double valor)
	{
		return valor / 1000;
	}
	
	double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}


