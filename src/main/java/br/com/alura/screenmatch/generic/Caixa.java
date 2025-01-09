package br.com.alura.screenmatch.generic;

public class Caixa<T> {
    private T conteudo;

    public <t> t somaConteudoNaCaixa(t valor) {
        if (this.conteudo instanceof Integer c && valor instanceof Integer i) {
            Integer resultado = c + i;
            return (t) resultado;
        } else if (this.conteudo instanceof Double c && valor instanceof Double d) {
            Double resultado = c + d;
            return (t) resultado;
        } else if (this.conteudo instanceof String c && valor instanceof String s) {
            String resultado = c + "\n" + s;
            return (t) resultado;
        }

        return null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

}
