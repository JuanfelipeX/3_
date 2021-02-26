package TecnicasProgramacion.Ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class EjericioNumeroMayorMenor {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
         
         int mayor;
         int medio;
         int menor;
        
        System.out.println("Ingrese un número");
        int variable1 = sc.nextInt();
        
        System.out.println("Ingrese otro número");
        int variable2 = sc.nextInt();
        
        
        System.out.println("Ingrese otro número");
        int variable3 = sc.nextInt();
        
        
        if(variable1 > variable2 && variable1 > variable3){
            mayor= variable1;
            if(variable2 > variable3){
                    
            medio = variable2;
            menor = variable3;
                }else{
                    
                    medio = variable2;
                    menor = variable3;
                }
            System.out.println("El número mayor es: " + mayor + " ,El número medio es: " + medio + " ,El número menor es: " + menor);            
        }
        
        if(variable2 > variable1 && variable2 > variable3){
            mayor= variable2;
            if(variable1 > variable3){
                    
            medio = variable1;
            menor = variable3;
                }else{
                
                medio = variable3;
                menor = variable1;
            }
            System.out.println("El número mayor es: " + mayor + " ,El número medio es: " + medio + " ,El número menor es: " + menor);        
            
        }
        
        if(variable3 > variable1 && variable3 > variable2){
            mayor= variable3;
            if(variable2 > variable1){
                    
            medio = variable2;
            menor = variable1;
                }else{
                    
                    medio = variable1;
                    menor = variable2;
                }
            System.out.println("El número mayor es: " + mayor + " ,El número medio es: " + medio + " ,El número menor es: " + menor);        
            
        }    
    }
}
    
