package aula4_atv1;
public class Elevador {
	private int andarAtual;
	private int totalAndar = 6;
	private int capacidadeElevador = 4; //0-4 = total 5 pessoas;
	private int pessoasElevador;
	
	public void exibeStatus() {
		System.out.println("Exibe pessoasElevadors:"+getpessoasElevador());
	}
	
	public void Inicializa() {
		setAndarAtual(0);
		setpessoasElevador(0);
	}
			
	public void Entra() {
		if (this.getpessoasElevador() <= capacidadeElevador) {
			this.setpessoasElevador(this.getpessoasElevador() + 1);
			System.out.println("Entrou"+ pessoasElevador);
		} else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void Sai() {
		if (this.getpessoasElevador() > 0) {
			this.setpessoasElevador(this.getpessoasElevador() - 1);
			System.out.println("Saiu"+ (pessoasElevador+1));
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void Sobe() {
		if(getAndarAtual() <= getTotalAndar()) {
			setAndarAtual(getAndarAtual()+1);
			System.out.println("Andar:"+(getAndarAtual()-1));
		}else {
			System.out.println("Voce esta no ultimo andar");
		}	
		
	}
	public void Desce() {
		if(getAndarAtual() > 1) {
			setAndarAtual(getAndarAtual()-1);
			System.out.println("Andar:"+getAndarAtual());
		}else {
			System.out.println("Voce esta no Terreo"+(getAndarAtual()-1));
		}	
		
	}
	
	public int getpessoasElevador() {
		return pessoasElevador;
	}

	public void setpessoasElevador(int pessoa) {
		pessoasElevador = pessoa;
	}
	
	public void setAndarAtual(int x) {
		andarAtual = x;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int getTotalAndar() {
		return totalAndar;
	}
}




