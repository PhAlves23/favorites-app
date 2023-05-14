package br.com.fiap.favoritesapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    //private static final long serialVersionUID = 1L;

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public class RestNotFoundException extends RuntimeException {

    public RestNotFoundException(String msg){
        super(msg);
    }
}
