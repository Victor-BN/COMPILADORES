package ATIVIDADES.PARTE3;

import ATIVIDADES.BaseAtividade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao6 extends BaseAtividade {
    @Override
    public void executar() {

        String texto = "Evento: 25/10/2024";

        // verifica se a data informada esta de acordo com o padrao de datas
        //esta regex garante que o dia e o mes possua dois digitos e o ano quatro digitos
        String regex = "(\\d{2})\\/(\\d{2})\\/(\\d{4})";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        //Antes de extrair as datas da string e feita uma verificação se está padrao da regex
        if (matcher.matches()) {
            System.out.println("Datas extraidas da string");

            while (matcher.find()) {
                System.out.println("Dia: " + matcher.group(1));
                System.out.println("Mes: " + matcher.group(2));
                System.out.println("Ano: " + matcher.group(3));


            }
        } else {
            System.out.println("Data não esta no formato correto");
        }
    }
}
