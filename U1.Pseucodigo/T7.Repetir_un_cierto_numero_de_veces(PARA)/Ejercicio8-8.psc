Proceso sin_titulo
	definir ancho, alto como Entero
	definir asterisco Como Caracter
	
	Escribir "Introduce la cantidad de filas"
	leer alto
	ancho<-1
	asterisco<-""
		Mientras ancho<=alto Hacer
			asterisco<-Concatenar(asterisco,"*")
			ancho = ancho+1
			Escribir asterisco
		Fin Mientras
		
	
FinProceso
