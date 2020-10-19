Proceso sin_titulo
	//
	Definir multiplos Como Entero
	Definir num Como Real
	Escribir "Escribe un numero para empezar a buscar"
	leer num
	multiplos<-0
	Mientras multiplos <=8 Hacer
		si num%8=0  entonces
			Escribir "El numero " num "es multiplo de 8"
			multiplos = multiplos+1
		fin si
		num=num+1
	Fin Mientras
	
	
	
	
FinProceso
