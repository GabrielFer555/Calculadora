/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Collectors;

/**
 *
 * @author Pichau
 */
public class Calculos {

    private String number1;
    private String number2;
    private String resultado = null;
    private String[] operacaoquebrada;
    private char operador;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String[] getOperacaoquebrada() {
        return operacaoquebrada;
    }

    public void setOperacaoquebrada(String[] operacaoquebrada) {
        this.operacaoquebrada = operacaoquebrada;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public String calcular(){
        try{
            String nmr1 = this.number1;
            String nmr2 = this.number2;
            char operator = this.operador;
            if(nmr1 == null){
                nmr1 = "0";
            }
            if(nmr2 == null){
                nmr2 = "0";
            }
            double nmr1convertido = Double.parseDouble(nmr1);
            double nmr2convertido = Double.parseDouble(nmr2);
            double resultadoindouble;
            switch(operator){
                case '+':{
                    resultadoindouble = nmr1convertido + nmr2convertido;
                    this.resultado = String.valueOf(resultadoindouble);
                    return this.resultado;
                }
                case '-':{
                    resultadoindouble = nmr1convertido - nmr2convertido;
                    this.resultado = String.valueOf(resultadoindouble);
                    return this.resultado;
                }
                case '/':{
                    resultadoindouble = nmr1convertido / nmr2convertido;
                    this.resultado = String.valueOf(resultadoindouble);
                    return this.resultado;
                }
                case 'X':{
                    resultadoindouble = nmr1convertido * nmr2convertido;
                    this.resultado = String.valueOf(resultadoindouble);
                    return this.resultado;
                }
                    
                
            }
        }catch(Exception E){
            this.resultado = "Syntax Error";
            
        }
        return this.resultado;
    }

    
    }

            
        
    
