/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentativav2;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author desen
 */
public class TentativaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double areaCircunferencia, perimetroCircunferencia;
       int r;
       System.out.print("Raio : "); //prompt
       r = input.nextInt();
       areaCircunferencia = PI * Math.pow(r,2);
       perimetroCircunferencia = 2 * PI * r;
       System.out.print("areaCircunferencia: " + areaCircunferencia + "\nperimetroCircunferencia: " + perimetroCircunferencia + "\n");
    }
    
}
