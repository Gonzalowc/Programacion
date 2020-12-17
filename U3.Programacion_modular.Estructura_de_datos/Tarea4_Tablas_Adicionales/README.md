# U3 - Entregable 2021 TARDE

* **Ejercicio BUSCAMINAS**

Juego del buscaminas

Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.

A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:

O bien un carácter X que significa que hay una bomba.
O bien un carácter - que significa que esa casilla no nada.
A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.

En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por pantalla la cantidad de bombas que hay en las casillas de alrededor.

Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el usuario encuentre una bomba).

> NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.

EJEMPLO:
````
Tablero Relleno:

- - X X
- - - -
X - X -
X - - X


Introduzca una posición: 1,1

La posición 1,1 tiene 3 bombas en los alrededores

Introduzca una posición: 1,0

La posición 1,0 tiene 1 bomba en los alrededores

Introduzca una posición: 3,1

La posición 3,0 tiene una bomba, está muerto 
````

* **discoduroderoer_Ej6**
  
  Crea un array bidimensinal con numeros aleatorios entre 0 y 100 incluidos, que no se repitan.


* **discoduroderoer_Ej10**
    Crea dos arrays multidimensionales de 2×3 y rellenalos como quieras (números aleatorios, por teclado o definido al crear el array).

    Haz un método que sume los arrays multidimensionales, es decir, la posición 0, 0 del array1 con la posición del array2 y así sucesivamente, este metodo no debe devolver nada, haciendo que deba pasarse el array multidimensional de suma como parámetro. Muestra el contenido de cada array multidimensional.

* **Ej1_extra**
    Pedir una cadena por teclado y quitarle las vocales

* **Ej2_extra**
    Rotar un array n posiciones

* **Pag152_Ej5_1**
    Pedir sueldos hasta que se introduzca un sueldo igual a -1. Sacar la cantidad de sueldos introducidos, la media de los sueldos, el sueldo máximo y mínimo.

* **Pag152_Ej5_2**
    Los diseñadores de una aplicación necesitan obtener ordenados los datos de una tabla, pero por restricciones de la aplicación, la tabla debe permanecer inmutable. Una posible solución es hacer una copia de la tabla y ordenarla, manteniendo intacta la tabla original, pero esta alternativa se ha desechado. En su lugar, se ha pensado en crear una segunda tabla donde se almacenan ordenados los índices de la tabla original. Se pide diseñar un algoritmo en el que, dada la tabla, cree otra donde se ordenen medinte los índices de la tabla original.

    Ejemplo
    ````
    tablaOriginal: [3, 5, 1, 4]
    tablaConIndices: [2, 0, 3, 1]
    ````
    Donde tablaConIndices especifica el lugar que ocupan de forma ordenada los datos de tablaOriginal. Por ejemplo, el primer elemento de la tablaOriginal, que vale 3, en caso de ordenar los datos, ocupará la posición 2 (que le corresponde en tablaConIndice).En este caso, el i-ésimo elemento de tablaOriginal ocupará la posición que contiene el i-ésimo elemento de la tablaConIndices.

* **Pag152_Ej5_3**
    Una tabla bidimensional *t* puede representar un mapa con distintos lugares (numerados de 0 a *n*) e indicar si existe paso del lugar i al lugar j, mediante el elemento *t [ i ][ j ]* con un valor *true*. Diseñar una aplicación que pregunte el número de lugares del mapa, cree una matriz tipo mapa, y cargue los pasos que existe entre lugares.

    Ejemplo: 
    ![alt](/)
