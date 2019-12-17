/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.restspringboot.endpoint;

import br.com.company.restspringboot.converters.NumberConverter;
import br.com.company.restspringboot.exception.UnsupportedMethodOperationException;
import br.com.company.restspringboot.math.SimplesMath;
import br.com.company.restspringboot.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author agostinho
 */
@RestController
public class MathEndpoint {
   
    private SimplesMath math = new SimplesMath();
    
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double getSum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMethodOperationException("Please set a numeric value!");
        }
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    
    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double getSubtration(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMethodOperationException("Please set a numeric value!");
        }
        return math.subtration(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    
    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double getDivision(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMethodOperationException("Please set a numeric value!");
        }
        return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    
    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double getMultiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMethodOperationException("Please set a numeric value");
        }
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double getMean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMethodOperationException("Please set a numeric value");
        }
        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    
    @RequestMapping(value = "/square/{number}", method = RequestMethod.GET)
    public Double getSquare(@PathVariable("number") String number)throws Exception{
        if(!NumberConverter.isNumeric(number)){
            throw new UnsupportedMethodOperationException("Please set a numeric value");
        }
        return math.square(NumberConverter.convertToDouble(number));
    }
}
