package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class SeparandoMeF {

    public static void main(String[] args) {
        String entradaNomes = "F - Maria, M - Pedro, F - Marcia, M - Claudio";

        // Separar os nomes usando a vírgula como delimitador
        String[] nomes = entradaNomes.split(", ");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();
        for (String nome : nomes) {
            if (Masculino(nome)) {
                nomesMasculinos.add(nome);
            } else {
                nomesFemininos.add(nome);
            }
        }
        System.out.println("Nomes Masculinos: " + nomesMasculinos);
        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
    private static boolean Masculino(String nome) {
        return nome.startsWith("M -");
    }
}