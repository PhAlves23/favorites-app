package br.com.fiap.favoritesapp.exception;

public class RestNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public RestNotFoundException(String msg){
        super(msg);
    }
}
