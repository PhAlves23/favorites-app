package br.com.fiap.favoritesapp.model;

public record Token(
    String token,
    String type,
    String prefix
) {}
