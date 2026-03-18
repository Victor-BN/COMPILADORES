package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "12.56";

        // [0-9]+ busca um ou mais números antes do ponto
         // \\. representa o ponto literal (precisa de barras pois o ponto sozinho significa "qualquer
        String regex = "([0-9]+)\\.([0-9]+)";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        System.out.println("A string analisada é: "+texto);

        //O método matches() verifica se TODO o texto para seguir o padrão da regex
        if(matcher.matches()){
            System.out.println("A String contém numeros decimais.");
        }else{
            System.out.println("A String não contem numeros decimais ou formato inválido");
        }


    }
}
