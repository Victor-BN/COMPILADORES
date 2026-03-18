package ATIVIDADES.PARTE2;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao5 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";

        // esta regex verifica define um padrão de numeros com dois ou mais digitos na string
        String regex = "(\\d{2,})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados com dois ou mais digitos no texto:");

        //o metodo find() vai buscando ocorrencias da regex no texto
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
