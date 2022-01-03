public class TestGerente {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luis","11111",1000);
        g1.setSenha(123);


        System.out.println(g1.autentica(123));

        System.out.println(g1.getBonificacao());;
        
    }
}
