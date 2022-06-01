package Projeto;

public class Projeto {

    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        Cliente alexia = new Cliente();
        LinhaTelefonica f1 = new Fixa(35, "3333-3333");
        LinhaTelefonica m1 = new Movel(235, "99999-9999",true);
        LinhaTelefonica f2 = new Fixa(28, "4444-4444");
        LinhaTelefonica m2 = new Movel(285, "98888-8888",false);
        anderson.setNome("Anderson");
        anderson.setEndereco("Av. Rio Comprido");
        anderson.addNumero(f1);
        anderson.addNumero(m1);
        f1.setCliente(anderson);
        m1.setCliente(anderson);
        alexia.setNome("Alexia");
        alexia.setEndereco("Av. Meriti");
        alexia.addNumero(f2);
        alexia.addNumero(m2);
        f2.setCliente(alexia);
        m2.setCliente(alexia);
        System.out.println(anderson.toString());
        System.out.println(alexia.toString());
        System.out.println(f1.toString());
        System.out.println(m1.toString());
        System.out.println(f2.toString());
        System.out.println(m2.toString());
        
    }
}
