Proceso sin_titulo
	
	Definir alto, ancho,columna, fila, i Como Entero
	Definir ast, esp Como Caracter
	
	
	Repetir
		Escribir "Introduce la altura del reloj"
		leer alto
	Hasta Que alto%2=1 Y alto>=5
	esp<- ""
	ast<- ""
	
	//Altura rejoj
	Para fila<-2 hasta alto hacer
		//altura=ancho asteriscos
		
		Para i<-1 Hasta alto Hacer
			ast= Concatenar(ast,"*")
		Fin Para
		
		//parte alta rejoj+eje
		Mientras fila<=(alto/2)+2 Hacer
		//Escribir conjunto piramide
			Escribir esp ast esp
		//Quitar asteriscos de la cadena
			ast<-SubCadena(ast,0, Longitud(ast)-3)
		//añadir espacio
			esp =  Concatenar(esp,"-")
			fila=fila+1
		Fin Mientras
		//asterisco para impar
		ast<-"*"
		esp<-"-"
		
		//parte baja espacios
		Repetir
			esp<-Concatenar(esp,"-")
		Hasta Que longitud(esp)>trunc((alto/2)-1)
		
		//parte baja asteriscos
		Mientras fila>(alto/2) Y fila<alto+2 Hacer
		//quitar espacios necesarios
			esp<-SubCadena(esp,0, Longitud(esp)-2)
		//añadir asteriscos
			ast<-Concatenar(ast,"**")
		//Escribir conjunto piramide
			Escribir esp ast esp
			fila=fila+1
		Fin Mientras
		
	FinPara
	
	
	
	
	
	
FinProceso
