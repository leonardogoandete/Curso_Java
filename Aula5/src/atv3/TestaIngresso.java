package atv3;

public class TestaIngresso {

	public static void main(String[] args) {
		Normal ing01 = new Normal();
		Vip ing02 = new Vip();
		
		System.out.println("Valor Normal: R$" + ing01.imprimeValor());
		System.out.println("Valor VIP R$" + ing02.imprimeValor());
	}
}
