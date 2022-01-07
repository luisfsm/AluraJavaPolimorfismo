public class CalcularImposto {
    private double impostoAcumulado;


    public void registrarImposto(ITributavel tributos){
        impostoAcumulado += tributos.getValorImposto();

    }

    public double getImpostoAcumulado() {
        return impostoAcumulado;
    }
    
}
