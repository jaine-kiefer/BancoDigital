public abstract class Conta implements InterfaceConta { //classe abstrata garante que apenas os filhos(CC e CP) possam dar new nela, não pode criar uma conta sem escolher uma das duas opções que o banco oferece.

    
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;

        


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    
}
