Proceso sin_titulo
	Definir cad Como Caracter
	Definir i Como Entero
	
	Escribir "Introduce cadena a dar la vuelta"
	leer cad
	
	Para i<-longitud(cad)-1 Hasta 0 Con Paso -1 Hacer
		//Escribir i
		escribir Sin Saltar Subcadena(cad,i,i)
	Fin Para
	
	
FinProceso
