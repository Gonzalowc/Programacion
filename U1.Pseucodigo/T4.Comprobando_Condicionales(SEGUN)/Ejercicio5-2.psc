Proceso sin_titulo
	Definir n1 Como Entero
	Escribir "Introduce un numero del 1 al 7 y te digo que dia de la semana es"
	Escribir "Introduce el numero"
	leer n1
	Si n1=1 Entonces
		Escribir "El dia numero " n1 " es Lunes"
	SiNo
		Si n1=2 Entonces
			Escribir "El dia numero " n1 " es Martes"
		SiNo
			Si n1=3 Entonces
				Escribir "El dia numero " n1 " es Miercoles"
			SiNo
				Si n1=4 Entonces
					Escribir "El dia numero " n1 " es Jueves"
				SiNo
					Si n1=5 Entonces
						Escribir "El dia numero " n1 " es Viernes"
					SiNo
						Si n1=6 Entonces
							Escribir "El dia numero " n1 " es Sabado"
						SiNo
							Si n1=7 Entonces
								Escribir "El dia numero " n1 " es Domingo"
							SiNo
								Escribir "Te he pedido un numero entre el 1 y el 7. Vuelve a ejecutarme"
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinProceso
