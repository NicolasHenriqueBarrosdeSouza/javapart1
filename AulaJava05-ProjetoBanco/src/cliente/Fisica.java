package cliente;

public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return "Pessoa Fisica\n+"
                + "Nome: "+ getNome()
                + "Endereço: "+ getEndereco()
                + "Email: "+ getEmail()
                + "Telefone: "+ getTelefone()
                + "CPF: "+cpf;
    }
     
}
