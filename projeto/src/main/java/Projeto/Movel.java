package Projeto;


public class Movel extends LinhaTelefonica {

    private Boolean planoDadosHabilitados;

    public Movel(int qtdMinutosGastos, String numero, Boolean planoDadosHabilitados) {
        setNumero(numero);
        setQtdMinutosGastos(qtdMinutosGastos);
        this.planoDadosHabilitados = planoDadosHabilitados;
    }

    public Boolean getPlanoDadosHabilitados() {
        return planoDadosHabilitados;
    }

    public void setPlanoDadosHabilitados(Boolean planoDadosHabilitados) {
        this.planoDadosHabilitados = planoDadosHabilitados;
    }
        
    @Override
    public double calcular() {
        if(planoDadosHabilitados == true){
            return 40 + 0.20 * getQtdMinutosGastos();
        }
        else {
            return 0.20 * getQtdMinutosGastos();
        }
    }
    
    @Override
    public String toString(){
        String txt = "numero " + getNumero() + " qtdMinutosGastos " + getQtdMinutosGastos() + " valor " + calcular() + " cliente " + getCliente().getNome() + " planoHabilitado " + getPlanoDadosHabilitados() ;
        return txt;
    } 
    
}
