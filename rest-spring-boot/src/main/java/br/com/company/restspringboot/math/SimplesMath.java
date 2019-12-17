/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.restspringboot.math;

/**
 *
 * @author agostinho
 */
public class SimplesMath {
    
    public Double sum(Double firstNumber, Double secondNumber){
        return firstNumber + secondNumber;
    }
    
    public Double subtration(Double firstNumber, Double secondNumber){
        return firstNumber - secondNumber;
    }
    
    public Double division(Double firstNumber, Double secondNumber){
        return firstNumber / secondNumber;
    }
    
    public Double multiplication(Double firstNumber, Double secondNumber){
        return firstNumber * secondNumber;
    }
    
    public Double mean(Double firstNumber, Double secondNumber){
        return (firstNumber + secondNumber) / 2;
    }
    
    public Double square(Double number){
        return (Double) Math.sqrt(number);
    }
}
