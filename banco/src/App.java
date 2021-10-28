public class App {
    public static void main(String[] args) throws Exception {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(5914);
        p1.setDono("Laika");
        p1.abrirConta("cp");
        p1.depositar(100);

        contaBanco p2 = new contaBanco();
        p2.setNumConta(4567);
        p2.setDono("Isadora");
        p2.abrirConta("cc");

        p2.depositar(500);
        p2.sacar(1000);
        p2.pagarMensal();
        p1.fecharConta();
        p1.sacar(250);
        p1.fecharConta();
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
