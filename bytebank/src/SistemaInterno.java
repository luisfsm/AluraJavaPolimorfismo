public class SistemaInterno {
    
    private int senha = 222;

    public void autentica(IAutenticavel iAutenticavel){
        boolean autenticou = iAutenticavel.autentica(this.senha);
        if(autenticou){
            System.out.println("Pode entrar no Sistema");
        }else{
            System.out.println("Não pode entrar no sistema");
        }
    }
}
