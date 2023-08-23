
package numeromayor;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TIMOTEO
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        char preg;
        do{
        Scanner entrada=new Scanner(System.in);
        System.out.print("*PROGRAMADO POR KENYI*\n");
        
        int num1,num2;
        System.out.print("\nDIFITE EL PRIMER NUMERO: ");
        num1=entrada.nextInt();
        System.out.print("DIGITE EL SEGUNDO NUMERO: ");
        num2=entrada.nextInt();
        
        if(num1>num2){
        System.out.print("\n==EL NUMERO MAYOR ES "+num1);
        System.out.print("\n==EL NUMERO MENOR ES "+num2);
        }
        
        else if(num2>num1){
        System.out.print("\n==EL NUMERO MAYOR ES "+num2);
        System.out.print("\n==EL NUMERO MENOR ES "+num1);
        }
        
        else{
        System.out.print("\n==AMBOS NUMEROS SON PARES==\n");
        }
        System.out.print("\n\n¿DESEA CONTUNUAR CON EL PROGRAMA?\n");
        System.out.print("DECLE s DE SI O n DE NO: ");
        preg=(char)System.in.read();
        }while((preg=='S')||(preg=='s'));
        System.out.print("\n====FIN DEL PROGRAMA====");
        
        
        
    }
    
}
