public class Ejercicio1 {
    /*Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?
    Algo ValoresDeLasVariables
    variable a, b: entero
    Inicio
    a <- 3
    escribir("a = " & a)
    b<-a+5
    escribir("a = " & a & " y b = " & b)
    a<-7
    escribir("a = " & a & " y b = " & b)*/
    
    public static void main(String[] args) {
    int a, b;
    a = 3;
    System.out.println("a = " + a); // En esta línea de código a vale 3
    b = a + 5;
    System.out.println("a = " + a + " y b = " + b); //En esta línea de código a vale 3 y b vale 8
    a = 7;
    System.out.println("a = " + a + " y b = " + b); //En esta línea de código a vale 7 y b vale 8
    } 
    }
/*Solución: 
a = 3
a = 3 y b = 8
a = 7 y b = 8*/
