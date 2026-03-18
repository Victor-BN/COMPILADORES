package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao1 extends BaseAtividade {
    @Override
    public void executar() {
        String texto ="1245";

        // ^ indica o início da linha
        // \\d+ procura por um ou mais dígitos numéricos
        // $ indica o fim da linha, garantindo que o texto todo seja apenas números
        String regex = "(^\\d+)$";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        //O método matches() verifica se TODO o texto para seguir o padrão da regex

        if(matcher.matches()){
            System.out.println("A String contém números inteiros positivos");
        }else{
            System.out.println("A String  não contém números inteiros positivos");
        }
    }
}
