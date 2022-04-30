
package ipc.parcial.ej1;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IPCPARCIALEJ1 {
    
    static int op=0; 
    static int num1, num2; 
    static int filas; 
    static int alto;
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        try {
            while (op<5) {
                System.out.println(" ");
                System.out.println("*********************");
                System.out.println("| 1. problema 1     |");
                System.out.println("| 2. problema 2     |");
                System.out.println("| 3. problema 3     |");
                System.out.println("| 4. SALIR          |");
                System.out.println("*********************");
                System.out.println("INGRESE NUMERO DE LA OPCION");
                System.out.println("___________________________");
                op = entrada.nextInt(); 
                
                switch (op){
                    
                    case 1:
                        System.out.println("___________________________");
                        System.out.println("PROBLEMA 1");
                        System.out.println(" ");
                        System.out.println("Ingrese primer numero");
                        num1 = entrada.nextInt(); 
                        System.out.println("Ingrese segundo numero");
                        num2 = entrada.nextInt(); 
                        
                        if (num1>num2) {
                            System.out.println("el numero mayor es: " + num1);
                        }else {
                            System.out.println("el numero mayor es: " + num2);
                        }
                    break; 
                    
                    case 2: 
                        System.out.println("___________________________");
                        System.out.println("PROBLEMA 2");
                        System.out.println(" ");
                        
                        
                        while (filas%2 == 0){
                            System.out.print("Introduce el numero de asteriscos de la base (impar): ");
                            filas = entrada.nextInt();
                            System.out.println("");
                        }
                        
                        for(int alto = 1; alto<=Math.ceil((float)filas/2); alto++){

                            for(int espacio = 1; espacio<=filas-alto; espacio++){
                                System.out.print(" ");
                            }

                            for(int asteriscos=1; asteriscos<=(alto * 2 )-1; asteriscos++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        
                  break; 
                    
                    case 3: 
                        System.out.println("___________________________");
                        System.out.println("PERDON, NO PUDE HACER EL PROBLEMA 3 ");
                    break; 
                    case 4: 
                        exit(0);
                    break;  
                   
                }
            }
                    
        }catch(InputMismatchException e){
            
        }
        
        
    
    }
}
