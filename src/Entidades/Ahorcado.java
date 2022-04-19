package Entidades;

import java.util.Scanner;

public class Ahorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Atributos: 
    private char word[];
    private int cantL;//cantidad de letras encontradas.
    private int cantJ;//cantidad de jugadas maximas. 
    private String atributoPrueba; 
    private int atributo1; 
    private int atributo2; 
    

//Constructores: 
    public Ahorcado() {
    }

    public Ahorcado(char[] word, int cantL, int cantJ) {
        this.word = word;
        this.cantL = cantL;
        this.cantJ = cantJ;
    }

//Getters and Setters: 
    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public int getCantL() {
        return cantL;
    }

    public void setCantL(int cantL) {
        this.cantL = cantL;
    }

    public int getCantJ() {
        return cantJ;
    }

    public void setCantJ(int cantJ) {
        this.cantJ = cantJ;
    }

//Metodos: 
    //Metodo crearJuego(): 
    public void crearJuego() {
        System.out.println("Ingrese una palabra para comenzar el juego: (use todos los caracteres en minusculas).");
        String wordU = leer.next();
        System.out.println("Ingrese el numero de intentos de resolucion: ");
        cantJ = leer.nextInt();

        word = new char[wordU.length()];
        for (int i = 0; i < wordU.length(); i++) {
            word[i] = wordU.charAt(i);
        }

        cantL = 0;

    }

    //Metodo longitud(): 
    public void longitud() {
        System.out.println("Longitud de la palabra: [ " + word.length + " ]");
    }

    //Metodo buscar(letra): 
    public void buscar() {
        
       

    }

}
