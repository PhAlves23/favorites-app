package br.com.fiap.favoritesapp.exception;

public record RestValidationError (String field, String message){
}
