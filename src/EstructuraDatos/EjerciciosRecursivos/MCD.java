package EstructuraDatos.EjerciciosRecursivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCD {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        System.out.println(mcdRecursivo(p, q));
    }

    public static int mcdRecursivo(int p, int q) {
        
        if(p<q){
            return mcdRecursivo(q, p);
                
        } else if(q==0){
            return p;
            
        }  
        return mcdRecursivo(q, p%q);
    }   
}
