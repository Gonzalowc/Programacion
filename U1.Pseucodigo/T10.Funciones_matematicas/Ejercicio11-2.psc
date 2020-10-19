Proceso sin_titulo
	Definir num Como real
	
	Repetir
		Escribir "Introduce un numero para saber su raiz"
		leer num
		Si num<0 Entonces
			Escribir "Lo siento. Vuelve a introducir un numero positivo"
		SiNo
			Si num<>0 Entonces
				Escribir "La raiz de " num " es: " rc(num)				
			Fin Si
			
		Fin Si
	Hasta Que num=0
	
FinProceso