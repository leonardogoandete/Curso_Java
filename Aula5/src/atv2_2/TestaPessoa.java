package atv2_2;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa ppessoa = new Pessoa();
		Pobre ppobre = new Pobre();
		Rica prico = new Rica();
		Miseravel pmise = new Miseravel();
		
		ppessoa.setNome("Pessoa");
		ppessoa.setIdade(27);
		System.out.println(ppessoa.toString());
		
		ppobre.setNome("Pessoa Pobre");
		ppobre.setIdade(38);
		System.out.print(ppobre.toString());
		ppobre.trabalha();
		
		prico.setNome("Pessoa Rica");
		prico.setIdade(28);
		prico.setDinheiro(2500d);
		System.out.print(prico.toString());
		prico.fazCompras();	
		
		pmise.setNome("Pessoa Miseravel");
		pmise.setIdade(48);
		System.out.print(pmise.toString());
		pmise.mendinga();
		
	}

}
