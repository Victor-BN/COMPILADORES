package ATIVIDADES.PARTE2;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao5 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";

        // \\d procura dígitos
        // {2,} é um quantificador que exige no mínimo 2 e sem limite máximo de dígitos
        String regex = "(\\d{2,})";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados com dois ou mais digitos no texto:");

        //o metodo find() vai buscando ocorrencias da regex no texto
        while (matcher.find()) {

            // O group() extrai o conteúdo específico capturado pelos parênteses (grupos) na regex
            System.out.println(matcher.group(1));
        }
    }
}
