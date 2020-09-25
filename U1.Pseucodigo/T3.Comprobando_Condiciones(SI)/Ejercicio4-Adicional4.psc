Proceso sin_titulo
	Definir horas, sueldo, resultado Como Entero
	
	Escribir "Indique el numero de HORAS trabajadas durante la SEMANA"
	Leer horas
	
	Si horas>=0 Y horas<=40 Entonces
		sueldo = 10
		resultado<- sueldo*horas
		Escribir "El sueldo SEMANAL que le corresponde es de " resultado " Euros"
	Fin Si
	Si horas>=41 Y horas<=168 Entonces
		sueldo = 15
		resultado<- sueldo*horas
		Escribir "El sueldo SEMANAL que le corresponde es de " resultado " Euros"
	FinSi
	si horas>168
		Escribir "La semana no tiene más de 128h"
	FinSi
	
	
FinProceso
