package oo.empresa;

public class Funcionario {
    public String cpf;
    public String nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void funcao(){
        System.out.println("Função genérica ou não definida padrão");
    }
}
