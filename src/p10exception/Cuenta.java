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
public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }
    
    
    public void depositar(double monto)throws SaldoTopeException{
        System.out.println("Procesando monto: "+monto);
        if(monto >= 20000){
            throw new SaldoTopeException();  
        }else{
        saldo+=monto;
        }
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Procesando el retiro "+monto);
        if (saldo<monto){
            throw new SaldoInsuficienteException();
        }else{
        saldo-=monto;
        
        }
    }
    
    
    
    public double getSaldo(){
        System.out.println("Saldo "+saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
