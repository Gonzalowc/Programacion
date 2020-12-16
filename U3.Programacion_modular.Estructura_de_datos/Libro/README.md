# Ejercicios del  libro y más.

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
    ![Ejemplo del mapa](.\IMG\EjemploMapaArray.png)

* **Pag153_Ej5_4**
    Implementa el juego de wari o macala para dos jugadores. El jugador que tenga el turno solo debe indicar cuál de sus hoyos utilizará para jugar. La aplicación debe hacer automaticamente el resto de las operaciones, indicando el numero de iedras capturadas. Aunque el juego es sencillo, sus reglas son demasiado extensas para describirlas aquí. Recomendamos al lector buscar información sobre el juego.

    Reglas: 
    * EL jugador puede mover solo las de su lado del tablero.
    * No puede seleccionar una casilla que no tenga fichas.
    * Si pasa por su casilla de captura se queda con 1 ficha, en la del otro no se guarda.
    * Si las ultima ficha hace suma de 2 o 3 donde cae, y las anteriores consecutivas también, se suman a la casilla de captura.
  
*  **Ejercicio 3**
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

* **Ejercicio 4**
Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).

* **Ejercicio 6**
Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para simplificarlo vamos a suponer que febrero tiene 28 días.

* **Ejercicio 8**
Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:

Todos lo alumnos mayores de edad.
Los alumnos mayores (los que tienen más edad)