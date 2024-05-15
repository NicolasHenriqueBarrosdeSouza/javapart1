package conta;

public class Poupanca extends ContaBancaria {
    private float taxa;

    public float getTaxa() {
        return taxa;
    }

    public Poupanca() {
        this.taxa = 0.1f;
    }
    
    @Override
    public String toString(){
        return "Dados da Conta Corrente\n+"
                + "Nome do cliente: "+ getP().getNome()
                + "\nTelefone: "+ getP().getTelefone()
                + "\nAgência : "+getAgencia()
                + "\nNumero da conta: "+getNroConta()
                + "\nSaldo: "+getSaldo();
                + "\nCartão de Crédito: "+CartaoCredito
                + "\nTaxa: "+taxa;
    }
    
}
