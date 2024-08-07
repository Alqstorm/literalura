package com.desafio_literalura;

import com.desafio_literalura.principal.Principal;
import com.desafio_literalura.repository.AutorRepository;
import com.desafio_literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    @Autowired
    private LibroRepository repository;
    @Autowired
    private AutorRepository repositoryAutor;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repository, repositoryAutor);
        principal.iniciarApp();

    }
}