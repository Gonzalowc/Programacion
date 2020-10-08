Proceso sin_titulo
	Definir num, i Como Entero
		
	Repetir
		Escribir "Introduce un numero mayor o igual a 5"
		leer num
		Si num%2=0 o num<5 Entonces
			Escribir "La altura introducida no es correcta"
		Fin Si
	Hasta Que num%2=1 Y num>=5
	
	Para i<-0 Hasta num-1  Hacer
		Si i%3=0 Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		Fin Si
	Fin Para
	
FinProceso
