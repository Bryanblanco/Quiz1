/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryam Blanco
 */
public class Operaciones
{

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(double multiplica) {
        this.multiplica = multiplica;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }
    double suma, resta, multiplica, division;
    
    public Operaciones(double suma, double resta, double multiplica, double division) {
        this.suma = suma;
        this.resta = resta;
        this.multiplica = multiplica;
        this.division = division;
    }
      
}//Fin de la clase
