
package numerodecrescente;

import java.util.Scanner;

public class NumeroDecrescente {  
    public static void main(String[] args) {
        int num;
        int i;
        String entrada; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número ");
        entrada = teclado.next();
        num = Integer.parseInt(entrada);
        
        for (i = num; i >= 0; i--)
           
            System.out.println(i);
              
    }
    
}
