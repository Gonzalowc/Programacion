Proceso sin_titulo
	
	Definir num, az, i Como Entero
	az<-azar(101)
	Escribir az
	i<-0
	Repetir
		Escribir "Introduce un número entre el 1 y el 100"
		Leer num
		i=i+1
	Hasta Que num=az O i>=7
	
	Si num=az Entonces
		Escribir "Has acertado el numero!. Tuviste " i " fallos"
	SiNo
		Escribir "No has acertado. Tuviste " i " fallos"
	Fin Si
		
FinProceso
	