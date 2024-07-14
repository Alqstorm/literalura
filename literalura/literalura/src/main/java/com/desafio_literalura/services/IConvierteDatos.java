package com.desafio_literalura.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
