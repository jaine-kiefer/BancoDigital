public class Main {
    public static void main(String[] args) {
        InterfaceConta cc = new ContaCorrente();
        InterfaceConta poupança = new ContaPoupança();

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    
    }

}
