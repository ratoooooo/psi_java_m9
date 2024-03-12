package PSI_M9;

public class Pessoa {
	//atributos
	private String nome;
	private int idd;
	private double altura;
	
	//construtir
	public Pessoa()
	{
		nome = "";
		idd = 0;
		altura = 0;
	}
	
	//seteres e geteres
	public Pessoa(String nome, int idd, double altura)
	{
		this.nome = nome;
		this.idd =idd;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nidd: " + idd + "\naltura: " + altura;
	}

	//metedos
	
	
}
