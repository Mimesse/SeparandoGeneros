package Tarefa;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparandoGeneros {
    private static ArrayList<String> Masculino = new ArrayList<>();
    private static ArrayList<String> Feminino = new ArrayList<>();

    public static void main(String[] args) {
        Scanner cadastrando = new Scanner(System.in);
        String cadastro = "S";

        while("S".equals(cadastro)){
            System.out.println("Você deseja Cadastrar S/N?");
            cadastro = cadastrando.nextLine();

            if ("S".equals(cadastro)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite seu nome:");
                String nome = scanner.nextLine();
                System.out.println("Digite seu sexo M/F:");
                char sexo = scanner.next().charAt(0);
                cadastrarPessoa(nome, sexo);
            }
        }

    }

    private static void cadastrarPessoa(String nome, char sexo) {
        System.out.println("nome: " + nome + " sexo: "+ sexo);
        if(sexo == 'F'){
            Feminino.add(nome);}
        else{
            Masculino.add(nome);
        }
        System.out.println(Masculino);
        System.out.println(Feminino);
    }

}