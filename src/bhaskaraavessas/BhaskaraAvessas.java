
package bhaskaraavessas;

import java.util.Scanner;

public class BhaskaraAvessas {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //ENTRADAS
        System.out.print("x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        System.out.print("x2: ");
        double x2 = Double.parseDouble(console.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(console.nextLine());
        
        //PROCESSAMENTO
        double soma = x1 + x2;
        double produto = x1 * x2;
        double a = c/produto;
        double b = -(a*soma);
        
        //SAIDA
        System.out.println(a+"X² + "+b+"X + "+c+" = 0");
    }
    
}
