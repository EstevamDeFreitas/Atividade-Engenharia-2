/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas_geometricas;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 *
 * @author desen
 */
public class Circunferencia {
    private float Raio;
    private double AreaCirc;
    private double PerimetroCirc;
    
    public Circunferencia (float Raio){
        this.Raio = Raio;
        calcular_circunferencia ();
    }
    
    void calcular_circunferencia (){
         AreaCirc = PI * pow(Raio, 2);
         PerimetroCirc = 2 * PI * Raio;
         ShowResult();
    }

    public float getRaio() {
        return Raio;
    }

    public void setRaio(float Raio) {
        this.Raio = Raio;
        calcular_circunferencia ();
    }
    public void ShowResult (){
        System.out.println("Area do Circulo: " + AreaCirc + "\nPerimetro do Circulo: " + PerimetroCirc);
    }
    
}


