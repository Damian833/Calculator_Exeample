
package calculator_example;

import java.util.Scanner;


public class Calculator_Example {

   
    public static void main(String[] args) {
      Scanner keyboard= new Scanner (System.in);
      int a=0;
      int b= 0;
      int resultado=0;
       
        System.out.println("Introduce el primer numero: ");
        a=keyboard.nextInt();
        System.out.println("Introduce el segundo numero: ");
        b=keyboard.nextInt();
        resultado= a+b;
        System.out.println(resultado);
        
    }
    
}
