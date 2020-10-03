Proceso sin_titulo
	//pedir un numero y decir si es multiplo de 8
	//pedir al usuario un numero y que salgan los 8 primeros numeros de 8
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
