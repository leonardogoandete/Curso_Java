package Aula2;

public class testaContaCorrente {

	public static void main(String[] args) {
		ContaCorrente p[] = new ContaCorrente[5];
		
		p[0] = new ContaCorrente(999);
		p[1] = new ContaCorrente(998);
		p[2] = new ContaCorrente(997);
		p[3] = new ContaCorrente(996);
		p[4] = new ContaCorrente(995);
		//p1.exibe();
		//p2.exibe();
		p[0].deposito(151.55d);
		p[1].deposito(0.88d);
		p[2].deposito(250.01d);
		p[3].deposito(288.44d);
		p[4].retirada(150.00d);
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
