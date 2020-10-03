Proceso sin_titulo
	
	Definir n,i,j Como Entero
	Definir ast Como Caracter
	
	Repetir
	Escribir "Introduce la altura y anchura de la flecha"
	Leer n
	Hasta Que n%2=1 Y n>=5
	
	ast<-"*"
	j<-0
	Para i<-1 Hasta n Hacer
		
		Mientras j<trunc((n/2))+1 Hacer
			Escribir ast
			ast<-Concatenar(ast,"**")
			j=j+1
		Fin Mientras
		
		ast<-SubCadena(ast,0,Longitud(ast)-3)
		
		Mientras j>=trunc(n/2)+1 Y j<=n Hacer
			ast<-SubCadena(ast,0,Longitud(ast)-3)
			Escribir ast
			j=j+1
		Fin Mientras
	Fin Para
	
	
	
	
	
	
FinProceso

