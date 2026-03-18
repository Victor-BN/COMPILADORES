package ATIVIDADES.PARTE1;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao3 extends BaseAtividade {
    @Override
    public void executar() {

        String texto ="18/03/2026";
        // verifica se a data informada esta de acordo com o padrao de datas
        //esta regex garante que o dia e o mes possua dois numeros e o ano 4 numeros
        String regex = "(\\d{2})\\/(\\d{2})\\/(\\d{4})$";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        //Verifica se a string está no padrao da regex
        if(matcher.matches()){
            System.out.println("A String está no formato de datas: "+texto);
        }else{
            System.out.println("A String não está no formato de datas: "+texto);
        }


    }
}
