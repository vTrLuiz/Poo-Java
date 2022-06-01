package Projeto;

public class Fixa extends LinhaTelefonica{
    public int franquia = 30;

    public Fixa (int qtdMinutosGastos, String numero){
        setNumero(numero);
        setQtdMinutosGastos(qtdMinutosGastos);
}
    
    @Override
    public double calcular(){
        if(getQtdMinutosGastos() > franquia){
            return 45 + calcular(getQtdMinutosGastos() - franquia);
        }
        else{
            return 45;
        }
    }
        
    public double calcular(int minutosExcedentes){
        return 0.05 * minutosExcedentes;
    }
    
    @Override
    public String toString(){
        String txt = "numero " + getNumero() + " qtdMinutosGastos " + getQtdMinutosGastos() + " valor " + calcular() + " cliente " + getCliente().getNome();
        return txt;
    } 
}


