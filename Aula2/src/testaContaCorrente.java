public class testaContaCorrente {

	public static void main(String[] args) {
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
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("=====================");
			p[i].exibe();
		}
	}
	
}
