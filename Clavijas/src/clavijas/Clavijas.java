/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clavijas;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author jonathan.molina
 */
public class Clavijas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*El objeto de la clase Vector contendra al final la matriz dinamica de objetos(int) para nuestro caso.
         * 
         */
        Vector v1 = new Vector();
        /*Matriz de enteros [N][M] 
         * donde N es un numero sufcientemente grande para que entren las posibles 
         *    jugadas dependiendo del estado actual del tablero
         * M es el numero de datos q necesitamos en este ejemplo 3 numClavija,posIni,posFin 
         *    creo que son 2 atributos mas por lo que hablamos la i.j de las PosIni y la posFin es decir M quedara en 5
         */
        int vi[][]=new int[12][3];
        //Randon cualquiera para rellenar la matriz
        Random rnd=new Random();
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 3; i++) {

                vi[j][i]=rnd.nextInt(9);
            }    
           //agrego la fila o la tupla al vector v1
            v1.addElement(vi[j]);                   
          /*
           * La anterior sentencia la usaria ud despues de verificar las posibles jugadas (por clavija) y tenerlas almacenadas en una matriz temporal que qui seria vi
             *al final de su funcion retornaria a v1 que es quien me interesa para el algoritmo genetico.
           */
        }
       
        
//Imprimiendo los datos almacenados en v1, observese que vi ya no se utiliza mas, solo nos ayudo para guardar datos antes de agregarlos a v1        
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 3; j++) {                      
                    System.out.print(((int[])(v1.elementAt(i)))[j] + "\t");                
                }
                System.out.println("");
            }  
//Mostrar el tamaño de v1; para nuestro interes seria el numero de jugadas.         
            System.out.println(v1.size());
//Mostrar el tamaño de las columnas es decir la cant de datos q necesitamos, es decir imprimira 3 para este ejemplo particular.
            System.out.println(((int[])(v1.elementAt(1))).length);

    }   
}
