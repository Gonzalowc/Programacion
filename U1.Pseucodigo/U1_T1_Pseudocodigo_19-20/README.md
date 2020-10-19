* **Ejercicio 1:** Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:

>-> El sueldo para las primeras 40 horas es 10€

>-> A partir de la hora 41 (incluida) el trabajado cobrará 15€ hora

Por ejemplo:
````
Introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 360
````
````
Introduzca el número de horas trabajadas durante la semana: 50
El sueldo semanal que le corresponde es de 550
````
* **EJERCICIO 2** (ej2.psc)

Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1.

Ejemplo:
````
Por favor, introduzca un número entero positivo: 123456
Introduzca la posición dentro del número: 5
Introduzca el nuevo dígito: 7
El número resultante es 123476
````
>NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint

* **EJERCICIO 3** (ej3.psc)

Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

Ejemplo:
````
Por favor, introduzca la altura del reloj de arena: 7 
*******
 *****
  ***
   *
  ***
 *****
*******
````
* **EJERCICIO 4** (ej4.psc)

Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.


Ejemplo:
````
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13

¿Qué números quiere resaltar? 
1 – los múltiplos de 5 
2 – los múltiplos de 7: 
 >1

159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
````
>NOTA: Utilizar las funciones de pseint para generar los número aleatorios

* **EJERCICIO 5** (ej5.psc)

Realizar un algoritmo que contenga dos funciones para trabajar con vectores (arrays).

- contiene. Recibirá dos parámetros, un array de enteros y un entero a buscar. Devolverá verdadero si el entero está en el vector y falso en caso contrario.

- ocurrencias. Recibirá dos parámetros, un array de enteros y un entero a buscar. Devolverá el número de ocurrencias de ese entero en el vector.

El cuerpo del algoritmo llamará al menos dos veces a cada una de las funciones.