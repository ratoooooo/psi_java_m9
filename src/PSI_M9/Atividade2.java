package PSI_M9;

import java.time.LocalDateTime;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarme despertador = new Alarme(7, 6, 0);
		Alarme intrevalo = new Alarme(16, 15, 0);
		Alarme finalAulas = new Alarme(18, 0, 0);
		
		finalAulas.ligarAlarme();

		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Hora Atual");
		System.out.println(agora.getHour() + ":" + agora.getMinute() + ":" + agora.getSecond());
		
		System.out.println("Despertador");
		System.out.println(despertador.toString());

		System.out.println("Intrevalo");
		System.out.println(intrevalo.toString());

		System.out.println("Fim de Aulas");
		System.out.println(finalAulas.toString());
	}
}