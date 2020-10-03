Proceso sin_titulo
	Definir fila, columna, f,c, lado Como Entero
	Escribir "Escriba el lado del cuadrado"
	leer lado
	fila<-lado
	columna<-lado
	lado<-lado%2
	Si lado=0 Entonces
		Escribir "El numero " lado " no es par ni impar"
	SiNo
		Si lado%2 = 0 Entonces
			Escribir "El numero " lado " es PAR, introduce otro"
			leer lado
		Fin Si
	Fin Si
	
	Para c<-0 Hasta fila-1 Hacer
		Para f<-0 Hasta columna-1 Hacer
			Si f=fila-1 O c=columna-1 O f=0 O c=0 O f=c O f+c=columna-1 Entonces
				Escribir Sin Saltar " * "
			sino 
				Escribir Sin Saltar "   "
			Fin Si
		Fin Para
		escribir ""
	Fin Para
FinProceso
