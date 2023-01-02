/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pichau
 */
public class Calculos {

    List<String> number1 = new ArrayList<>();
    List<String> number2 = new ArrayList<>();
    private String[] operacaoquebrada;
    private String operator;

    public String[] getoperacao(String operation) {
        this.operacaoquebrada = operation.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
        System.out.println(Arrays.toString(operacaoquebrada));
        return this.operacaoquebrada;

    }

    public int getnumbers() {
        for (int i = 0; i < operacaoquebrada.length; i++) {
            number1.add(operacaoquebrada[i]);
           
            
            
        
        
            
        
        }
        return 0;

    }

    public String getoperator() {
        for (int i = 0; i < this.operacaoquebrada.length; i++) {
            this.operator = this.operacaoquebrada[i];
            if (isOperator()) {
                break;
            }
        }
        if (!isOperator()) {
            return ("Error");
        }
        return this.operator;

    }

    private boolean isOperator() {
        return ("X".equals(this.operator) || "+".equals(this.operator) || "-".equals(this.operator) || "/".equals(this.operator));
    }

}
