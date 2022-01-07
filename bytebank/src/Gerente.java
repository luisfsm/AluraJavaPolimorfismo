

public class Gerente extends Funcionario implements IAutenticavel{

    private Autenticacao autenticador;



    public Gerente(String nome, String cpf, double salario){
        super(nome,cpf,salario);
        autenticador = new Autenticacao();
    }

    @Override
    public boolean autentica(int senha){
       return this.autenticador.autentica(senha);
  
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public double getBonificacao(){
        return super.getSalario();
    }
}
