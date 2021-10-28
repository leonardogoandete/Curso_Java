
public class app {

	public static void main(String[] args) {
		double saldo_total = 0 ;
		ContaCorrente p[] = new ContaCorrente[2];
		
		p[0] = new ContaCorrente(999);
		p[1] = new ContaCorrente(998);
		//p1.exibe();
		//p2.exibe();
		p[0].deposito(151.55);
		p[1].deposito(0.88);
		//p1.exibe();
		//p1.retirada(50.51);
		//p1.exibe();
		//p1.exibe();
		//p2.exibe();
		for(int i=0; i < p.length; i++) {
			p[i].exibe();
			saldo_total += p[i].getSaldo();
		}
			System.out.println("Saldo de todas as contas R$"+saldo_total);	
	}
	
}
