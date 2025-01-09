package io.spring.start.generic;

import java.util.List;

public class Avaliacao<T> {
    private T item;
    private Double nota;
    private String comentario;

    public Avaliacao() {}

    public Avaliacao(T item, Double nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public static <T> double calcularMedia(List<Avaliacao<T>> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            throw new IllegalArgumentException("A lista de avaliações está vazia.");
        }
        double soma = 0;
        for (Avaliacao<T> avaliacao : avaliacoes) {
            soma += avaliacao.getNota();
        }

        return soma / avaliacoes.size();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
