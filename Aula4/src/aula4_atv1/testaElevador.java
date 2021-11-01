package aula4_atv1;
public class testaElevador {

	public static void main(String[] args) {
		Elevador leo = new Elevador();
		leo.Inicializa();
		leo.Entra();
		leo.Entra();
		for (int i = 0; i <= 3; i++) {
			leo.Sobe();
		}
		
		//System.out.println("desce =====");
		//for (int i = 0; i <= 7; i++) {
		//	leo.Desce();
		//}
	}

}
