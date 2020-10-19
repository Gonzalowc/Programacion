Proceso sin_titulo
	Definir libra, dolar, yen, euro, num Como Real
	Definir op Como Entero
	
	Escribir "seleccione el cambio:"
	Escribir "1- Libra a euros"
	Escribir "2- Dolar a euros"
	Escribir "3- Yenes a euros"
	Leer op
	libra<-1.22
	dolar<-0.75
	yen<-0.009
	Escribir "Introduce la cantidad de la moneda seleccionada"
	leer euro
	Segun op Hacer
		1:
			Escribir "Usted tiene " euro " Libras. Que son " libra*euro " euros"
		2:
			Escribir "Usted tiene " euro " Dolares. Que son " dolar*euro " euros"
		3:
			Escribir "Usted tiene " euro " Yenes. Que son " yen*euro " euros"
		De Otro Modo:
			Escribir "Usted no ha introducido ninguna opcion"
	Fin Segun
	
	
	
	
	
FinProceso
