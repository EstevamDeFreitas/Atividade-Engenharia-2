package pacote_Main;
import formas_geometricas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a forma geometrica? \n1:Circunferencia\n2:Retangulo\n3:Sair");
        int forma = sc.nextInt();
        switch(forma){
            case 1:
                System.out.println("Digite o raio da circunferencia: ");
                float Raio = sc.nextFloat();
                Circunferencia objCirc = new Circunferencia(Raio);
                break;
            case 2:
                float altura;
                float base;
                System.out.println("Digite a altura do retangulo: ");
                altura = sc.nextFloat();
                System.out.println("Digite a base do retangulo: ");
                base = sc.nextFloat();
                Retangulo objRet = new Retangulo(base,altura);
                break;
            case 3: break;
            default : break;
       }
    }
}
