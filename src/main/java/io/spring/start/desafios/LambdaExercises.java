package io.spring.start.desafios;

@FunctionalInterface
interface Multiplicacao {
    int multiplicacao(int a, int b);
}

@FunctionalInterface
interface Primo {
    boolean verificarPrimo(int n);
}

@FunctionalInterface
interface Transformador {
    String transformar(String palavra);
}

public class LambdaExercises {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println(multiplicacao.multiplicacao(5, 3));

        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));  // Resultado: true

        Transformador transformador = String::toUpperCase;
        System.out.println(transformador.transformar("teste"));
    }
}
