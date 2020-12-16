# APRENDE JAVA CON EJERCICIOS
## ARRAYS

* **EJ5PRAC**
    Crea un programa que mueva el mínimo hacia delante y el máximo hacia el final, primero de forma individual, y luego de forma conjunta

    > public static void rotarMenor(int[] numeros)

    > public static void rotarMayor(int[] numeros)

    >public static void rotarMayorMenor(int[] numeros)

* **Pag120_Ejercicio74_Ej4**
    Define tres arrays de 20 números enteros cada una, con nombres *numero*, *cuadrado* y *cubo*. Carga el array numero con valores aleatorios entre 0 y 100. En el array *cuadrado* se deben almacenar los cuadrados de los valores que hay en el array *numero*. En el array *cubo* se deben almacenar los cubos de los valores que hay en *numero*. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
* **Pag121_Ejercicio74_Ej6**
    Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
* **Pag121_Ejercicio74_Ej7**
    Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. Los números que se han cambiado deben aparecer  entrecomillados.

* **Pag121_Ejercicio74_Ej8**
    Realiza un programa que pida la temperatura media que ha hecho en cada mes
    de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.

* **Pag121_Ejercicio74_Ej9**
    Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda.

* **Pag121_Ejercicio74_Ej10**
    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.

* **Pag122_Ejercicio74_Ej11**
    Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante.

    Ejemplo

    ![Imagen Ejercicio 11 libro](/IMG/eJ11.png)

* **Pag122_Ejercicio74_Ej12**
Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos *“inicial”* y *“final”*. Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el número de la posición inicial en la posición final, rotando el resto de números para que no se pierda ninguno. Al final se debe mostrar el array resultante.

Ejemplo: 
````
inicial = 3 
final = 7
````
![Imagen Ejercicio 12 libro](.\IMG\eJ12.png)

* **Pag126_Ejercicio74_Ej18**
Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.

Ejemplo 1

![Imagen Ejercicio 18-1 libro](.\IMG\eJ18-1.png)

Ejemplo 2

![Imagen Ejercicio 18-1 libro](.\IMG\eJ18-2.png)

Ejemplo 3

![Imagen Ejercicio 18-1 libro](.\IMG\eJ18-3.png)

* **Pag127_Ejercicio74_Ej19**
    Realiza un programa que sea capaz de insertar un número en una posición
    concreta de un array. En primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá.

    Ejemplo 1

    ![Imagen Ejercicio 19-1 libro](.\IMG\eJ19-1.png)

    Ejemplo 2

    ![Imagen Ejercicio 19-2 libro](.\IMG\eJ19-2.png)

    Ejemplo 3

    ![Imagen Ejercicio 19-3 libro](.\IMG\eJ19-3.png)

* **Pag128_Ejercicio74_Ej20**
    Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.

    Ejemplo 1

    ![Imagen Ejercicio 20-1 libro](.\IMG\eJ20-1.png)

    Ejemplo 2

    ![Imagen Ejercicio 20-2 libro](.\IMG\eJ20-2.png)
    
* **Pag130_Ejercicio74_Ej21**
  Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el siguiente múltiplo de 5 que exista a partir de él.

  Ejemplo

    ![Imagen Ejercicio 21 libro](.\IMG\eJ21.png)


* **Pag131_Ejercicio74AB_Ej1**
  Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.

  ![Imagen Ejercicio 1 Bidimensional libro](.\IMG\EjAB1.png)

* **Pag131_Ejercicio74AB_Ej4**
  * Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
  * Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.
  
* **Pag133_Ejercicio74AB_Ej9**
  Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas con los números convenientemente alineados.

* **Pag133_Ejercicio74AB_Ej10**
  Realiza el juego de las tres en raya

* **Pag133_Ejercicio74AB_Ej13**
    Realiza un programa que calcule la estatura media, mínima y máxima en
    centímetros de personas de diferentes países. El array que contiene los
    nombres de los paises es el siguiente: ***pais = {“España”, “Rusia”, “Japón", “Australia”}***. Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir directamente).
  
  Ejemplo

  ![Imagen Ejercicio 1 Bidimensional libro](.\IMG\EjAB13.png)

   
