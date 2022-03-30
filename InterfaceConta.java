public interface InterfaceConta {

    //interface é uma classe abstrata com todos os métodos abstratos
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
