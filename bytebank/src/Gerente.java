public class Gerente extends Funcionario{
    private int senha;

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
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.getSalario();
    }
}
