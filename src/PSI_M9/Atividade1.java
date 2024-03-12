package PSI_M9;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Premio sorteio1 = new Premio();
		Premio sorteio2 = new Premio("10M", "5M", "20M", "1M");
		Premio totoloto = new Premio("500m", "100m", "50m", "1M");
		
		System.out.println("Sorteio 1");
		System.out.println(sorteio1.gerarPremio());
		
		System.out.println("Sorteio 2");
		System.out.println(sorteio2.gerarPremio());
		
		System.out.println("Sorteio 3");
		System.out.println(totoloto.gerarPremio());
	}

}
