package Projeto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;

    private ArrayList<LinhaTelefonica> numeros = new ArrayList<LinhaTelefonica>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<LinhaTelefonica> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<LinhaTelefonica> numeros) {
        this.numeros = numeros;
    }
    
    public void addNumero(LinhaTelefonica numero){
        this.numeros.add(numero);
    }
    
    
    @Override
    public String toString(){
        String txt = "nome " + nome + " endereco " + endereco;
        Iterator<LinhaTelefonica> iterator = numeros.iterator();
        while (iterator.hasNext()){
            LinhaTelefonica L = iterator.next();
            txt = txt + " telefone " + L.getNumero();
        }
        return txt;
    }
}

