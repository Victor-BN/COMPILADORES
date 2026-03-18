package ATIVIDADES.PARTE4;

import ATIVIDADES.BaseAtividade;

import java.util.regex.*;


public class Questao7 extends BaseAtividade {
    @Override
    public void executar() {
        String texto = "CPF: 123.456.789-45";

        // Divide o CPF em 4 grupos: três blocos de 3 dígitos e o bloco final de 2 dígitos
        // \\. e \\- servem para identificar os pontos e o traço literais do formato
        String regex = "(\\d{3})\\.(\\d{3})\\.(\\d{3})\\-(\\d{2})";

        //Pega a string e compila e a transforma em um automato
        Pattern pattern = Pattern.compile(regex);

        //E responsavel por iterar a string e associar a regex
        Matcher matcher = pattern.matcher(texto);

        // O replaceAll usa $4, para manter partes do texto original e substituir apenas o que desejamos mascarar
        String cpfMascarado = matcher.replaceAll("***.***.***-$4");

        System.out.println("CPF SEM MASCARA: \n"+texto);
        System.out.println("CPF MASCARADO: \n"+cpfMascarado);
    }
}
