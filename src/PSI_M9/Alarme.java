package PSI_M9;

public class Alarme {

	// metedo
	private int hora;
	private int minuto;
	private int segundo;
	private boolean ligado;

	// consrutor
	public Alarme() {
		hora = 0;
		minuto = 0;
		segundo = 0;
		ligado = false;
	}

	public Alarme(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		ligado = false;
	}

	// geters and seteres
	public void setHora(int hora) {
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
		}

	}

	public int getHora() {
		return hora;
	}

	public void setMinuto(int minuto) {
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setSegundo(int segundo) {
		if (segundo < 60 && segundo >= 0) {
			this.segundo = segundo;
		}
	}

	public int getSegundo() {
		return segundo;
	}
	
	public boolean isLIgado(){
		return ligado;
	}
	
	public boolean isDesligado(){
		return ligado;
	}
	
	public String toString() {

		String strHora = (hora < 10) ? "0" + hora : Integer.toString(hora);
		String strMinuto = (minuto < 10) ? "0" + minuto : Integer.toString(minuto);
		String strSegundo = (segundo < 10) ? "0" + segundo : Integer.toString(segundo);
		String onOff = (isLIgado()) ? "ON" : "OFF";

		return strHora + ":" + strMinuto + ":" + strSegundo + "("+onOff+")";
	}

	public void ligarAlarme()
	{
		ligado = true;
	}
	
	public void desligarAlarme()
	{
		ligado = false;
	}

}