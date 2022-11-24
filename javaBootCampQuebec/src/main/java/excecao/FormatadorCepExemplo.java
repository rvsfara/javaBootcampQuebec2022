package excecao;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("97105390");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException ex) {
            Logger.getLogger(FormatadorCepExemplo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("CEP Inválido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "97.105-390";
    }

}