package oo.empresa;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();//ela mesma

        Funcionario gerente = new Gerente();//upcast
        Funcionario vendedor = new Vendedor();//upcast
        Funcionario faxineiro = new Faxineiro();//upcast
        //Vendedor vendedor2 = (Vendedor) new Funcionario();//downcast erro por não conseguir tranformar dados diferentes
        faxineiro.setNome("João");//herança do atributo pai

    }
}
