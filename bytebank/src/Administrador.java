public class Administrador extends Funcionario implements IAutenticavel {

    private Autenticacao autenticador;

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        autenticador = new Autenticacao();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario()+50;
    }

    @Override
    public void setSenha(int senha) {
       this.autenticador.setSenha(senha);
        
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }
}
