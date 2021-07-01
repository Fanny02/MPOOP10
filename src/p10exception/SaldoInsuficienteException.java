/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10exception;

/**
 *
 * @author Esetefany Zavala
 * @version 1.2 28.06.2021
 */
public class SaldoInsuficienteException extends Exception{ //creando protocolo de contingencia

    public SaldoInsuficienteException() {
        super ("Saldo insufciciente");
    }
    
}
