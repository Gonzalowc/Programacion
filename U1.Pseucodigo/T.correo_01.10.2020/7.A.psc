Proceso sin_titulo
	Definir num, i Como Entero
	Escribir "Introduce la altura de la A"
	Leer num
	
	Para i<-1 Hasta num Hacer
		Si i=1 O i=trunc((num/2)+1) Entonces
			Escribir "*****"
		SiNo
			Escribir "*   *"
		Fin Si
	Fin Para
	
FinProceso
