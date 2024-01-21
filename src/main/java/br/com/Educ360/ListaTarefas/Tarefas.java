package br.com.Educ360.ListaTarefas;

import java.util.Comparator;

public class Tarefas{
    private static int nextId = 0;

    private int id;
    private String nomeTarefa;
    private String descricaoTarefa;

    public Tarefas() {
        this.id = nextId++;
    }

    public Tarefas(int id, String nomeTarefa, String descricaoTarefa) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        this.descricaoTarefa = descricaoTarefa;
    }

    public int getId() {
        return id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "id=" + id +
                ", nomeTarefa='" + nomeTarefa + '\'' +
                ", descricaoTarefa='" + descricaoTarefa + '\'' +
                '}';
    }

    public static final Comparator<Tarefas> COMPARATOR_BY_NOME = Comparator.comparing(Tarefas::getNomeTarefa);
    public static final Comparator<Tarefas> COMPARATOR_BY_ID = Comparator.comparing(Tarefas::getId);

}
