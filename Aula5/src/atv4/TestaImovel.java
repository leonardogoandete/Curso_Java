package atv4;

public class TestaImovel {

	public static void main(String[] args) {
		int tipo = 2;
		
		
		//Novo imovelNovo = new Novo();
		//Velho imovelVelho = new Velho();
		
		if (tipo == 1) {
			Novo casa = new Novo();
			System.out.println(casa.toString());
		}else if(tipo == 2) {
			Velho casa = new Velho();
			System.out.println(casa.toString());
		}
		
		
		
		//System.out.println(imovelNovo.toString());
		//System.out.println(imovelVelho.toString());
	}
}
