public class EditorDeVideo extends Funcionario {


    public EditorDeVideo(){

    }
    public EditorDeVideo(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }
    @Override
    public double getBonificacao(){
        return super.getBonificacao()+100;
    }
    
}
