/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pichau
 */
public class Calculos {

    private String[] number1;
    private String[] number2;
    private String[] operacaoquebrada;
    private String operator;

    public String[] getoperacao(String operation) {
        this.operacaoquebrada = operation.split("");

        return this.operacaoquebrada;
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
