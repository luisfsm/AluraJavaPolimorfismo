public class Gerente extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(){

    }

    public Gerente(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }

    public boolean autentica(int senha){
        if(this.senha==senha){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public double getBonificacao(){
        return this.getSalario();
    }
}
