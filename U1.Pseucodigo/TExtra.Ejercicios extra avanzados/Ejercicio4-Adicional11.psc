Proceso sin_titulo
	Definir sueldo, au1, au2, sueldoau Como Real
	au1<-0.15
	au2<-0.12
	sueldoau<-0
	
	Escribir "Introduzca su sueldo para percibir su aumento de sueldo"
	Leer sueldo
	sueldo<-abs(sueldo)
	Si sueldo<=500000 Entonces
		Escribir "Su sueldo aumenta en " sueldo*au1
		sueldoau <- sueldo*au1+sueldo
		Escribir "Su sueldo con el aumento es un total de: " sueldoau 
	SiNo
		Escribir "Su sueldo aumenta en " sueldo*au2
		sueldoau <- sueldo*au2+sueldo
		Escribir "Su sueldo con el aumento es un total de: " sueldoau
	Fin Si
	
	
FinProceso
