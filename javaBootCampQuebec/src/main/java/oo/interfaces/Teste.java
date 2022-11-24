package oo.interfaces;

public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double vlr1 = 50.00;
        double vlr2 = 50.00;
        calc.soma(vlr1, vlr2);
        calc.subtracao(vlr1,vlr2);
        calc.multiplicacao(vlr1,vlr2);
        calc.divisao(vlr1,vlr2);
    }
}
