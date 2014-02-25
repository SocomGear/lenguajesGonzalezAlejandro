/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuentaTarea;

/**
 *
 * @author socom_000
 */
public class Cuenta {
    private float Saldo;

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo)throws SaldoNegativoException {
        Validacion.validarSaldo(Saldo);  
        System.out.println("Tu saldo es de $"+ Saldo);
        this.Saldo = Saldo;
    }
    
}
