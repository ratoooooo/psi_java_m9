package PSI_M9;

public class Lampada {
	//atributods
	private boolean acesa; 
	
	//bob construtor
	public Lampada()
	{
		acesa = false;
	}
	
	//geters and seters
	public boolean isAcesa() {
		return acesa;
	}

	public void setAcesa(boolean acesa) {
		this.acesa = acesa;
	}

	//metedos auxiliares
	public void acender()
	{
		this.acesa = true;
	}
	
	public void apagar()
	{
		this.acesa = false;
	}

	public String toString() {
		if(isAcesa())
		{
			return "A lampada esta acesa";
		}
		else
		{
			return "A lampada esta apagada";
		}

	}
	
	
}
