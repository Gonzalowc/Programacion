Proceso sin_titulo
	Definir n1, total Como Entero
		Escribir "Introduce un número para saber si es PAR o IMPAR"
		leer n1
	Mientras n1=0 Hacer
		Escribir "Introduce un número para saber si es PAR o IMPAR"
		leer n1
		Escribir "El numero " n1 " no es par ni impar"
	Fin Mientras
	
		total<-n1%2
	
	Si total = 0 Entonces
		Escribir "El numero " n1 " es PAR"
	SiNo
		Escribir "El numero " n1 " es IMPAR"
	Fin Si
	
	
FinProceso
