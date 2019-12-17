/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.restspringboot.model;

/**
 *
 * @author agostinho
 */
public class Greeting {
    private final long id;
    private final String context;

    public Greeting(long id, String context) {
        this.id = id;
        this.context = context;
    }

    public long getId() {
        return id;
    }

    public String getContext() {
        return context;
    }

    
    
   
}
