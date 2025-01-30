package io.spring.start.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
//
//        Optional<Integer> max = numeros.stream().max(Integer::compare);
//
//        max.ifPresent(System.out::println);
//////////////////////////////////////////////////////////////////////////////////
//        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code", "dqwdqw", "dws");
//
//        Map<Integer, List<String>> agrupador = palavras.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(agrupador);
//////////////////////////////////////////////////////////////////////////////////
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String concatenados = nomes.stream().
                collect(Collectors.joining(", "));
        System.out.println(concatenados);

    }
}
