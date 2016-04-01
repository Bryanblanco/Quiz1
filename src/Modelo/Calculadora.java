/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Operaciones;
import javax.swing.JOptionPane;
/**
 *
 * @author Bryam Blanco
 */
public class Calculadora {
    
    public void Sumar(double numero1, double numero2)      
    {
        double resultadoSuma= numero1 + numero2;
       JOptionPane.showMessageDialog(null,"El resultado es:"+resultadoSuma); 
    }
    
    public void Restar(double numero1, double numero2)
    {
        double resultadoResta= numero1 - numero2;
        JOptionPane.showMessageDialog(null,"El resultado de la resta es:"+resultadoResta);
    }
    
    public void Multiplicar(double numero1, double numero2)
    {
        double resultadoMulti =numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es"+resultadoMulti);
    }
    
    public void Dividir (double numero1, double numero2)
    {
        double resultadoDivision = numero1 / numero2;
        JOptionPane.showMessageDialog(null,"El resultado de la divisón es:"+resultadoDivision);
    }
    
    
   
}//Fin de la clase
