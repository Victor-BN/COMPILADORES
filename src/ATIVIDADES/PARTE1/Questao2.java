package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "1.256";

        //Objetivo desta regex e analisar se a string e um número decimal
        String regex = "([0-9]+)\\.([0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("A string analisada é: "+texto);

        if(matcher.matches()){
            System.out.println("A String contém numeros decimais.");
        }else{
            System.out.println("A String não contem numeros decimais ou formato inválido");
        }


    }
}
