/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10exception;

/**
 *
 * @author X512J
 */
public class SaldoInsuficienteException extends Exception{ //creando protocolo de contingencia

    public SaldoInsuficienteException() {
        super ("Saldo insufciciente");
    }
    
}
