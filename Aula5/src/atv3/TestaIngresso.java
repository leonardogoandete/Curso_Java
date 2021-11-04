package atv3;
import java.util.Scanner;
public class TestaIngresso {

	public static void main(String[] args) {
		int tipo,opc;

		System.out.println("Selecione \n1 - Ingresso Normal \n2 - Ingresso VIP\n");
		try (Scanner x = new Scanner(System.in)) {
			opc = x.nextInt();
			if(opc != 1 && opc != 2) {
				System.out.println("Selecao invalido!");
			}else {
				if (opc == 1) { // normal
					Normal ing = new Normal();
					System.out.println("Ingresso normal Valor R$ "+ing.imprimeValor());
				} else if(opc == 2) { // vip
					System.out.println("Opcao VIP \n1 - Superior \n2 - Inferior\n");
					tipo = x.nextInt();
					if(tipo != 1 && tipo != 2) {
						System.out.println("Opcao invalida");
					}else {
						if (tipo == 1) { // camarote superior
							CamaroteSuperior ing = new CamaroteSuperior();
							System.out.println("Ingresso VIP \nCamarote Superior\nValor R$ "+ing.imprimeValor());
						} else if(tipo == 2) { // camarote inferior
							CamaroteInferior ing = new CamaroteInferior();
							System.out.println("Ingresso VIP \nCamarote Inferior\nValor R$ "+ing.imprimeValor());
						}
					}	
				}
			}
		}
	}
}
