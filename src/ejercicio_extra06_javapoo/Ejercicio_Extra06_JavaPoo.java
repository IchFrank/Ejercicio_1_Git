/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra06_javapoo;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author 54935
 */
public class Ejercicio_Extra06_JavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una clase llamada "Ahorcado".✓
        //Debera contener como atributos:✓
        //Atributo1: un vector con la palabra a buscar.✓
        //Atributo2: la cantidad de letras encontradas.✓
        //Atributo3: la cantidad de jugadas maximas.✓
        //Definir los siguientes metodos con los parametros que sean necesarios: 
        //1- Constructores, por defecto y por parametros.✓
        //2- Metodo "crearJuego()".✓
        //3- Metodo "longitud()".✓
        //4- Metodo "buscar(letra)". 
        //5- Metodo "encontradas(letra)".
        //6- Metodo "intentos()".
        //7- Metodo "juego()"
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          //objeto: 
          Ahorcado j1 = new Ahorcado(); 
          //Metodos:
          j1.crearJuego();
          j1.longitud();
          j1.buscar();
        
    }
    
}
