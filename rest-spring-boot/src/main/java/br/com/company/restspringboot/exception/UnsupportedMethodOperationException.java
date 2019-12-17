/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.restspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author agostinho
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMethodOperationException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public UnsupportedMethodOperationException(String exception) {
        super(exception);
    }
    
    
}
