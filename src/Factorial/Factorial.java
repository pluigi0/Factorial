
package Factorial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
       long numero, i=1, factorial=1, resultado;
       Scanner entrada = new Scanner (System.in);
       
        System.out.println("Dame un numero pa calcular su factorial: ");
        numero = entrada.nextInt();
        
        while(numero >= i){            
            System.out.print("(" +i+")");
            
            factorial *=i;
            i++;
        }
        System.out.println("\nSo el factorial de "+numero+ " es: "+factorial);

        
    }
}