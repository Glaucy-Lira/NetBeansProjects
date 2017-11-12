
package maiornumero;

import java.util.Scanner;


public class MaiorNumero {

   
    public static void main(String[] args) {
        
        int n1;
        int n2;
        String entrada; 
        
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Digite o primeiro número: ");
        entrada = teclado.next();
        n1 = Integer.parseInt(entrada);
         
        System.out.println("Digite o segindo número: ");
        entrada = teclado.next();
        n2 = Integer.parseInt(entrada);
       
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);

        }

    }
}


