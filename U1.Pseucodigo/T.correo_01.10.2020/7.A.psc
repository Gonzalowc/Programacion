Proceso sin_titulo
	Definir num, i Como Entero
	repetir
	Escribir "Introduce la altura de la A"
	Leer num
	Hasta Que num%2=1 Y num>3

	Para i<-1 Hasta num Hacer
		Si i=1 O i=trunc((num/2)+1) Entonces
			Escribir "*****"
		SiNo
			Escribir "*   *"
		Fin Si
	Fin Para
	
FinProceso
