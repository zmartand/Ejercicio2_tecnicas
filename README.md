# Ejercicio2_tecnicas
<h1 align="center"> EL PSEUDOCÓDIGO </h1>

## Nota:

Mi repositorio es: https://github.com/zmartand/Ejercicio2_tecnicas.git

## 1. Valores de las variables
¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?

Algo ValoresDeLasVariables  
variable a, b: entero  
Inicio  
   a <- 3  
   escribir("a = " & a)  //En esta línea de código a=3
   b<-a+5  
   escribir("a = " & a & " y b = " & b)  //En esta línea de código a=3 y b=8
   a<-7  
   escribir("a = " & a & " y b = " & b)  //En esta línea de código a=7 y b=8
Fin 

SOLUCIÓN: 

a = 3
a = 3 y b = 8
a = 7 y b = 8


## 2. ¿Qué se muestra?
¿Qué veremos al ejecutar el siguiente algoritmo?

Algo QueVeremos 
#¿Qué veremos al ejecutar el siguiente algoritmo?  
Variable valor1, valor2: entero  
Variable cadena1: texto  
Constante CST: real <- 49,78  
Inicio  
   valor1 <- 92 % 8  
   valor2 <- 2 * valor1  
   cadena1 <- "Test"  
   escribir(cadena1 & " , valor2 = " & valor2)  
   escribir(valor1 & " # " & CST)  
Fin 

SOLUCIÓN: 

Se muestra lo siguiente:

Test , valor2 = 8
4 # 49.78

## 3. ¿Qué hace?
¿Qué hace este algoritmo?

Algo QueHace  
#¿Qué hace este algoritmo?  
Variable valor1, valor2: real  
Inicio  
   valor1 <- enter("Introduza un valor: ")  
   valor2 <- enter("Introduza otro valor: ")  
   #tratamiento 
   valor1 <- valor2  
   valor2 <- valor1  
   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)  
Fin 

SOLUCIÓN:

Al valor 1 se le asigna el valor 2, por lo que el valor 2 es igual al valor 1 que a su vez es el valor 2. En conclusión
ambos valores toman el valor 2



## 4. Velocidad media
Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.

A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

Introduzca la distancia recorrida (km).
370
Introduzca el tiempo del recorrido (min).
240
Se ha desplazado a una velocidad de 92,5 km/h.
