/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estefnay Zavala 
 * @version 1.2 28.06.2021
 */
public class Cajero {
    public static void main(String[] args) {  //psvm + tab
 
    try {
        Cuenta cuenta = new Cuenta();
        cuenta.getSaldo();
        cuenta.depositar(20000);
        cuenta.getSaldo();
        cuenta.retirar(500);
        cuenta.getSaldo();
        //cuenta.retirar(1000);
        cuenta.getSaldo();
        } catch (SaldoInsuficienteException ex) {
            System.out.println("No cuentas con el saldo suficiente");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaldoTopeException ex) {
            System.out.println("Deposito superior al permitido");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }  
    //crear una excepcion que no permita ingresar mas de 20 mil pesos
    //Crear una excepcion que solo puedan realizar tres retiros
        //crear un contador para el numero de retiros
    //crear diagrama de clase cuenta 
    }
}

