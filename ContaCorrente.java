public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
    
}
