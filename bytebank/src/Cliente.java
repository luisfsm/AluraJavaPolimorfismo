public class Cliente implements IAutenticavel {


    private Autenticacao autenticador;

    public Cliente(){
        autenticador = new Autenticacao();
    }


    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
