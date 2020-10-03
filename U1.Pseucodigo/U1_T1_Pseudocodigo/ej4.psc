Proceso ejercicio_4
	
	definir datos, i, mul, num  Como Entero
	Dimension datos[20]
	mul<-0
	num<-0
	para i<-0 hasta 19 Hacer
		datos[i]<-azar(400)
	FinPara
	para i<-0 hasta 19 Hacer
		Escribir Sin Saltar " " datos[i] " "
	FinPara	
	Escribir ""
	Escribir "1- Los Multiplos de 5"
	Escribir "2- Los multiplos de 7"
	leer mul
	
	Mientras mul<>1 Y mul<>2 Hacer
		Escribir "1- Los Multiplos de 5"
		Escribir "2- Los multiplos de 7"
		leer mul
	Fin Mientras
	
	Segun mul Hacer
		1:
			num<-5
		2:
			num<-7
	Fin Segun
	
	para i<-0 hasta 19 Hacer
		Si datos[i]%num<>0 Entonces
			Escribir Sin Saltar " " datos[i] " "
		Fin Si
		Si datos[i]%num=0 Entonces
			Escribir Sin Saltar " [" datos[i] "] "
		Fin Si
		
	FinPara	
	Escribir ""
FinProceso
