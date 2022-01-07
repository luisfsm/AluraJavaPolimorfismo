public class Fiscal implements IAutenticavel {
    
    private Autenticacao autenticador;

    public Fiscal(){
        autenticador = new Autenticacao();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha); ;
    }

    @Override
    public boolean autentica(int senha){
      return  this.autenticador.autentica(senha);
    }
    
    
}
