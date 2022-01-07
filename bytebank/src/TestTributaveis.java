public class TestTributaveis {
    public static void main(String[] args) {
        CalcularImposto calcularImposto = new CalcularImposto();
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        ContaCorrente cc = new ContaCorrente(111, 111);

        cc.deposita(100);

        calcularImposto.registrarImposto(cc);
        calcularImposto.registrarImposto(seguroDeVida);

        System.out.println(calcularImposto.getImpostoAcumulado());

    }
    
}
