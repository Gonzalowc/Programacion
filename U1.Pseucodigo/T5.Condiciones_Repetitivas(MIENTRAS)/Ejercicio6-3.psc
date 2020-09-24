Proceso sin_titulo
	Definir n1,n2, SUMA, DATO Como Entero
	n1<-AZAR(101)
	n2<-AZAR(101)
	SUMA = n1+n2
	Escribir n1 "+" n2 " es: " SUMA
	Escribir "Introduce un numero del 1 al 200 hasta adivinarlo"
	Leer DATO
	Mientras SUMA<>DATO Hacer
		Leer DATO
	Fin Mientras
	Escribir "Has acertado el numero" SUMA " es la suma de " n1 "+" n2
FinProceso
