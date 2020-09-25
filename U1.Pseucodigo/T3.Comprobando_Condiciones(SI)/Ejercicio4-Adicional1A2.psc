Proceso sin_titulo
	Definir minutos, truncado, horas Como Real
	
	Escribir "Intruduzca una cantidad de minutos para sacar su equivalencia en horas"
	leer truncado
	//Calcular horas
	truncado = truncado/60
	//coger las horas
	horas = trunc(truncado)
	//coger decimales y buscar equivalencia con minutos
	minutos = (truncado - horas)*60
	Escribir truncado*60 " minutos son: " horas " horas y " minutos " minutos"
	
FinProceso
