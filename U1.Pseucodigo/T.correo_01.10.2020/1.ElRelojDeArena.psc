Proceso sin_titulo
	
	Definir alto, ancho,columna, fila, i Como Entero
	Definir ast, esp Como Caracter
	
	
	Repetir
		Escribir "Introduce la altura del reloj"
		leer alto
	Hasta Que alto%2=1 Y alto>=5
	esp<- ""
	ast<- ""
	i<- 0
	//Altura rejoj
	Para fila<-2 hasta alto hacer
		
		Para i<-1 Hasta alto Hacer
			ast= ast + "*"
		Fin Para
		//parte alta rejoj+eje
		Mientras fila<=(alto/2)+2 Hacer
			
			Escribir esp ast
			ast<-SubCadena(ast,0, Longitud(ast)-3)
			
			
			esp=esp+" "
			fila=fila+1
		Fin Mientras
		ast<-"*"
		esp<-" "
		Repetir
			esp<-Concatenar(esp," ")
		Hasta Que longitud(esp)>trunc((alto/2)-1)
		//parte baja reloj
		Mientras fila>(alto/2) Y fila<alto+2 Hacer
			esp<-SubCadena(esp,0, Longitud(esp)-2)
			ast<-Concatenar(ast,"**")
			Escribir esp ast
			fila=fila+1
		Fin Mientras
	FinPara
	
	
	
	
	
	
FinProceso
