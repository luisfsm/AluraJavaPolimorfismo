public class ControleBonificacao {
    private double soma=0;


    public void registrar(Funcionario f){
     double boni = f.getBonificacao();
     this.soma += boni;
}


public double getSoma() {
    return soma;
}
}
