package io.spring.start;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.spring.start.contador.Tarefa;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Escolha um número para ser feita a contagem: ");
//        Integer numero = scanner.nextInt();

        Tarefa contador = new Tarefa("Estudar Spring Boot", true, "Kohatsu");
        ObjectMapper objectMapper = new ObjectMapper();
        File arquivo = new File("C:/Users/Gustavo Kohatsu/Desktop/screenmatch/tarefa.json");

        if (arquivo.exists()) {
            System.out.println("Encontrado: " + arquivo.getAbsolutePath());
        } else {
            System.out.println("Não encontrado: " + arquivo.getAbsolutePath());
        }

        try {
            Tarefa tarefa = objectMapper.readValue(arquivo, Tarefa.class);

            System.out.println("Tarefa desserializada: " + tarefa);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
