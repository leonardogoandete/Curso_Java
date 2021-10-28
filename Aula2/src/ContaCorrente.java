public class ContaCorrente {
	private double saldo = 0.0;
	public int nroConta;
	
	
	public ContaCorrente(int nroConta) {
		this.nroConta = nroConta;
		System.out.println("Conta "+ nroConta +" criada com sucesso!");
	}
	
	public void exibe(){
		System.out.println("Conta: "+ this.getNroConta());
		System.out.println("Saldo: R$"+ this.getSaldo());
	}

	//metodos
	public void deposito(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Deposito no valor R$"+valor+" realizado!");
	}
	
	public void retirada(double valor) {
		if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            	System.out.println("Saque realizado R$" + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
	}
	// metodos especiais
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNroConta() {
		return nroConta;
	}
	public void setNumConta(int nroCta) {
		this.nroConta = nroCta;
	}
	
}
