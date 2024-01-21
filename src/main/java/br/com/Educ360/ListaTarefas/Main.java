package br.com.Educ360.ListaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcoes = 0;

        List<Tarefas> listaTarefas = new ArrayList<>();


        while (opcoes != 4) {

            System.out.println("Bem vindo! Selecione uma das opções: \n" +
                    "1 - Adicionar Tarefa \n" +
                    "2 - Remover Tarefa \n" +
                    "3 - Listar Tarefas \n" +
                    "4 - Finalizar Programa");
            opcoes = scanner.nextInt();
            if (opcoes == 3) {
                System.out.println("5 - Listar Tarefas em Ordem Alfabética \n" +
                        "6 - Listar Tarefas em Ordem Cronológica");
                opcoes = scanner.nextInt();
            }

            switch (opcoes) {
                case 1:
                    Tarefas tarefas = new Tarefas();
                    scanner.nextLine();

                    System.out.println("Digite o Nome da Tarefa: ");
                    String nomeT = scanner.nextLine();
                    if (!nomeT.equals(tarefas.getNomeTarefa())) {
                        tarefas.setNomeTarefa(nomeT);
                    }

                    System.out.println("Digite a Descrição da Tarefa: ");
                    String descT = scanner.nextLine();
                    if (!descT.equals(tarefas.getDescricaoTarefa())) {
                        tarefas.setDescricaoTarefa(descT);
                    }


                    listaTarefas.add(tarefas);

                    for (Tarefas t : listaTarefas) {
                        System.out.println(t);
                    }
                    break;

                case 2:
                    System.out.println("Digite o id da tarefa para remover: ");
                    int idRemove = scanner.nextInt();
                    int sizeList = listaTarefas.size();

                    listaTarefas.removeIf(tarefa -> tarefa.getId() == idRemove);

                    if (listaTarefas.size() < sizeList){
                        System.out.println("Tarefa Removida com sucesso");
                    } else {
                        System.out.println("Tarefa com ID " + idRemove + " não encontrada.");
                    }
                    break;
                case 5:
                    //Criar método Listar Tarefas em Ordem Alfabética

            }
        }

    }
}