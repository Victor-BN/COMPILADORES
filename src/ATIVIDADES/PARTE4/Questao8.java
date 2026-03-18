package ATIVIDADES.PARTE4;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao8 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "Telefone: (67) 99876-1234";

        // (\\(\\d{2}\\)\\s\\d) Grupo 1: captura o DDD entre parênteses, um espaço e o primeiro dígito do número
        // \\d{4} identifica (mas não agrupa) os 4 dígitos centrais que serão ocultados
        // (-\\d{4}) Grupo 2: captura o traço e os últimos 4 dígitos para mantê-los visíveis
        String regex = "(\\(\\d{2}\\)\\s\\d)\\d{4}(-\\d{4})";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        // O replaceAll usa $1, $2, para manter partes do texto original e substituir apenas o que desejamos mascarar
        String celular_mascarado = matcher.replaceAll("$1****$2");

        System.out.println("Numero sem mascara: \n");
        System.out.println("Telefone: "+texto);

        System.out.println("Numero com mascara: \n");
        System.out.println("Telefone: "+celular_mascarado);
    }
}
