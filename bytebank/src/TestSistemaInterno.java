public class TestSistemaInterno {
    public static void main(String[] args) {
        Cliente g = new Cliente();
        g.setSenha(222);
        SistemaInterno si = new SistemaInterno();

        si.autentica(g);
    }
}
