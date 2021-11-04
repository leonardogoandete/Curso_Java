package atv4;
import java.util.Scanner;
public class TestaImovel {

	public static void main(String[] args) {
		int tipo;
		System.out.println("Digite a opcao: \n1- Imovel novo \n2- Imovel antigo");
		try (Scanner x = new Scanner(System.in)) {
			tipo = x.nextInt();
		}
		if(tipo != 1 && tipo != 2) {
		System.out.println("Opcao invalido!");
		}else{
			if (tipo == 1) {
				Novo casa = new Novo();
				System.out.println(casa.toString());
			}else if(tipo == 2) {
				Velho casa = new Velho();
				System.out.println(casa.toString());
			}
		}
	}
}
