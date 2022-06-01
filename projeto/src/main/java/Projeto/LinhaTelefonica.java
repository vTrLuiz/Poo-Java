package Projeto;


public abstract class LinhaTelefonica{
    private String numero;
    private int qtdMinutosGastos;
    private Cliente cliente ;
    
    public abstract double calcular();
    
    public LinhaTelefonica(int qtdMinutosGastos, String numero){
        this.numero = numero;
        this.qtdMinutosGastos = qtdMinutosGastos;
}
    public LinhaTelefonica(){
    }

    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public int getQtdMinutosGastos(){
        return qtdMinutosGastos;
    }
    
    public void setQtdMinutosGastos(int qtdMinutosGastos){
        this.qtdMinutosGastos = qtdMinutosGastos;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
}

