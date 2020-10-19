Proceso ejercicio_2
	Definir num, new, pos  Como Entero
	Definir cad,x,i Como Caracter
	
	Escribir "Introduce un numero entero positivo"
	leer num
	
	Escribir "Intorduce la posicion dentro del numero"
	leer pos
	
	Escribir "Introduce el nuevo digito"
	leer new
	
	Escribir "El numero introducido es " num 
	
	cad <- ConvertirATexto(num)
	x<-SubCadena(cad,0,pos-2)
	i<-Subcadena(cad,pos,pos*1000)
	
	Escribir "El  numero  cambiado  es " x new i
	
	
	
FinProceso
