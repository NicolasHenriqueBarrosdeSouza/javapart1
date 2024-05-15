package conta;

public class Corrente extends ContaBancaria {
    private boolean CartaoCredito;

    public boolean isCartaoCredito() {
        return CartaoCredito;
    }

    public void setCartaoCredito(boolean cartaoCredito) {
        this.CartaoCredito = cartaoCredito;
    }
    
    @Override
    public String toString(){
        return "Dados da Conta Corrente\n+"
                + "Nome do cliente: "+ getP().getNome()
                + "\nTelefone: "+ getP().getTelefone()
                + "\nAgência : "+getAgencia()
                + "\nNumero da conta: "+getNroConta()
                + "\nSaldo: "+getSaldo()
                + "\nCartão de Crédito: "+CartaoCredito;
               
    }
    
    
}
