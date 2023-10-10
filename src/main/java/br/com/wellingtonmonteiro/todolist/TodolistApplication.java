package br.com.wellingtonmonteiro.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation é uma função que é reconhecida e executada pelo spring
// Define que é uma inicialização da aplicação spring
@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
