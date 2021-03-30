package Semillero.EstructurasDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LearningArrays {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int MAX = 100;
    static int[] datos = new int[MAX];

    static double[] numeros = new double[MAX];
    static int[][] dp = new int[MAX][MAX];

    static ArrayList<Double> datosList = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        for (int i = 0; i < MAX; i++) {
            datos[i] = i;
        }
        System.out.println(Arrays.toString(datos)); // Muestra los datos del array 

        ////////////////////////////

        int n = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());  // llena el array pasandoloe datos
        }
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr); //mergesort()  --> O(n log n)          ordena los datos menor mayor
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder()); // ordena los datos mayor menor pero toca cambiar el array a Integer ya que no deja con dato primitivo    
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, -1);   // .fill es simplemente un ciclo que llena el array con un mismo dato
        System.out.println(Arrays.toString(arr));

        /////////////////

        datosList.add(Double.parseDouble(br.readLine())); // llena el arrayList pasandoloe datos
        System.out.println(datosList);

        for (int i = 0; i < datosList.size(); i++) {

            System.out.print(datosList.get(i) + ", "); // imprime el arrrayList pero sin [ ]

        }

        System.out.println();
        System.out.println("------------");
        System.out.println(datosList.indexOf(2.0)); //busca la posicion donde se encuentre el dato de la array Y SI NO LO ENCUENTRA retorna -1
        //podemos usar collections.sort para ordenar el arrayList y hay muchas funciones
       
        

    }
    
}
