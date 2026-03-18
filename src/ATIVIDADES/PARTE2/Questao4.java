package ATIVIDADES.PARTE2;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao4 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";

        // esta regex verifica define um padrão de digitos numericos na string
        String regex = "(\\d+)";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados no texto:");

        //o metodo find() vai buscando ocorrencias da regex no texto
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }
}
