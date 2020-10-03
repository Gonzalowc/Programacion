Proceso ej3
	
	Definir pass_sys, pass Como Caracter
	Definir i Como Entero
	pass_sys<- "1234"
	Escribir "Introduce la contrasena(4 cifras numericas)"
	leer pass
	
	Si pass_sys = pass Entonces
		
		Escribir "La caja fuerte se ha abierto satisfatoriamente"
		
	SiNo
		
		Para i<-1 Hasta 3 Hacer
			Escribir "Has fallado la contrasena"
			Si pass_sys <> pass Entonces
				leer pass
			Fin Si
			
		Fin Para
		
		Si pass_sys = pass Entonces
			Escribir "La caja fuerte se ha abierto satisfatoriamente"
		SiNo
			Escribir "La contrasena no es correcta."
		Fin Si
		
	Fin Si
FinProceso
