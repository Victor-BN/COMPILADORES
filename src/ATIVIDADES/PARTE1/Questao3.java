package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao3 extends BaseAtividade {
    @Override
    public void executar() {

        String texto ="18/03/2026";
        // (\\d{2}) captura exatamente dois dígitos (dia)
        // \\/ representa a barra literal separadora
        // (\\d{2}) captura dois dígitos (mês) e (\\d{4}) captura quatro dígitos (ano)
        String regex = "(\\d{2})\\/(\\d{2})\\/(\\d{4})$";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        //O método matches() verifica se TODO o texto para seguir o padrão da regex
        if(matcher.matches()){
            System.out.println("A String está no formato de datas: "+texto);
        }else{
            System.out.println("A String não está no formato de datas: "+texto);
        }


    }
}
