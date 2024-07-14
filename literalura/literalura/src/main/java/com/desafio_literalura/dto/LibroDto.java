package com.desafio_literalura.dto;

public record LibroDto (
        Long Id,
        String titulo,
        String autor,
        String idioma,
        Double numeroDeDescargas )
{}
