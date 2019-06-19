/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examenggmm;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Examen3GGMM {
    public void imprimir(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    
    }
    public int[][] Transformada1GGMM(int dimen, int n){
        System.out.println("Ejercicio 6:");
        int[][] matriz=new int[dimen][dimen];
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(cont<=i){
                    matriz[i][j]=n;
                    n++;
                    cont++;
                }else{
                    matriz[i][j]=-1;
                }
            }cont=0;
            
        }
        return matriz;
    }
    public int[][] Transformada2GGMM(int dimen, int n){
        System.out.println("Ejercicio 26:");
        int[][] matriz=new int[dimen][dimen];
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            if(cont%2==0){
                for (int j = matriz.length-1; j >=0; j--) {
                    matriz[i][j]=n;
                    n++;
                }
            }else{
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j]=n;
                    n++;
                }
            }
            cont++;
        }
       
           
        return matriz;
    }
    public int[][] Transformada3GGMM(int dimensionX, int numInit){
        System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimensionX][dimensionX];
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = numInit;
                      numInit++;
                     
                     }else{
                matriz[i][j]=-1;
                }
            }
        }
          return matriz;
     }
    public int[][] Transformada4GGMM(int dimensionX, int numInit){
        System.out.println("Ejercicio n° 30");
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int Prin = 0; Prin < dimensionX/2; Prin++) {
            for (int LDx = Prin; LDx <dimensionX-Prin-1; LDx++) {
                matriz[LDx][dimensionX-Prin-1]=numInit;
                numInit++;
            }
            for (int LIx =dimensionX-Prin-1; LIx>Prin; LIx--) {
                matriz[dimensionX-Prin-1][LIx]=numInit;
                numInit++;
            }
            for (int LXx =dimensionX-Prin-1 ; LXx>Prin; LXx--) {
                matriz[LXx][Prin]=numInit;
                numInit++;
             }
            for (int LSx = Prin; LSx<dimensionX-Prin-1; LSx++) {
                matriz[Prin][LSx]=numInit;
                numInit++;
            }
             
            if(dimensionX%2!=0){
                matriz[dimensionX/2][dimensionX/2]=numInit;
            }
            
        }
    return matriz;
    }
    public int[][] Transformada5GGMM(int dimensionX, int numInit){
        System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimensionX][dimensionX];
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimensionX-(i+1)){
                      matriz[i][j] = numInit;
                      numInit++;
                     }else{
                matriz[i][j]=-1;
                }
            } ;
        }
          return matriz;
     } 
    public void TodoGGMM(){
        Examen3GGMM or=new Examen3GGMM();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese nuevamente la dimencion de la matriz: ");
        int dimen=leer.nextInt();
        System.out.println("Ingrese nuevamente el numero de inicio: ");
        int n=leer.nextInt();
        or.imprimir(or.Transformada1GGMM(dimen, n));
        or.imprimir(or.Transformada2GGMM(dimen, n));
        or.imprimir(or.Transformada3GGMM(dimen, n));
        or.imprimir(or.Transformada4GGMM(dimen, n));
        or.imprimir(or.Transformada5GGMM(dimen, n));
    }
    public static void main(String[] args) {
        Examen3GGMM or=new Examen3GGMM();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        System.out.println("Ingrese la dimencion de la matriz: ");
        int dimen=leer.nextInt();
        System.out.println("Ingrese el numero de inicio: ");
        int n=leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: or.imprimir(or.Transformada1GGMM(dimen, n)); break;
            case 2: or.imprimir(or.Transformada2GGMM(dimen, n)); break;
            case 3: or.imprimir(or.Transformada3GGMM(dimen, n)); break;
            case 4: or.imprimir(or.Transformada4GGMM(dimen, n)); break;
            case 5: or.imprimir(or.Transformada5GGMM(dimen, n)); break;
            case 6: or.TodoGGMM(); break;
            
         
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
            System.out.println("Ingrese la dimencion de la matriz: ");
            dimen=leer.nextInt();
            System.out.println("Ingrese el numero de inicio: ");
            n=leer.nextInt();
        }
    }
}
