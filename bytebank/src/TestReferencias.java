public class TestReferencias {
    public static void main(String[] args) {
        ControleBonificacao controle = new ControleBonificacao();


        Funcionario gerente = new Gerente("Luis Felipe","11111111",5000);
        controle.registrar(gerente);

        Funcionario funcionario = new Funcionario("Luis Felipe","11111111",1000);
        controle.registrar(funcionario);

        Funcionario editorDeVideo = new EditorDeVideo("Luis Felipe","11111111",2000);
        controle.registrar(editorDeVideo);

        Funcionario Designer = new Designer("Luis Felipe","11111111",3000);
        controle.registrar(Designer);



        System.out.println(controle.getSoma());
    }
}
