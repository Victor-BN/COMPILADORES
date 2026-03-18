package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao1 extends BaseAtividade {
    @Override
    public void executar() {
        String texto ="1245";

        //Tem que possuir pelo menos um numero inteiro positivo
        String regex = "(^\\d+)$";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        if(matcher.matches()){
            System.out.println("A String contém números inteiros positivos");
        }else{
            System.out.println("A String  não contém números inteiros positivos");
        }
    }
}
