public class contaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
            if (this.getTipo() == "CC" || this.getTipo() == "cc") {
                this.setSaldo(50);
            } else if (this.getTipo() == "CP" || this.getTipo() == "cp") {
                this.setSaldo(150);
            }
        System.out.println("Conta aberta com sucesso.");
    }// metodo abrirConta

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta com debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }

    }// metodo fecharConta

    public void depositar(float v){
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    } // metodo depositar
    
    public void sacar(float v){
        if (this.getStatus() == true) {
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }

    }//metodo sacar

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (this.getStatus() == true) {
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por " + this.getDono());
            }else if(this.getSaldo() < v){
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }// metodo pagarMensal

    // metodos especiais
    // contrutor
    public contaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    } // fim construtor


    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }


    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }


    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }


    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }


    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean stt){
        this.status = stt;
    }

}// fim da classe 
