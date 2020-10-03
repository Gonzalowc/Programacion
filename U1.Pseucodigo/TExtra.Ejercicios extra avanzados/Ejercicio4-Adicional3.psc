Proceso sin_titulo
	Definir opciom Como Entero
	definir valorr, resultado Como Real
	
	Escribir "Introduzca el numero"
	Leer valorr
	
	Escribir "Que desea hacerle al numero? Escriba:"
	Escribir " 1 : calcular el valor absoluto"
	Escribir " 2 : calcular la raiz cuadrada"
	Escribir " 3 : calcular el cuadrado de ese numero"
	Leer opciom
	
	Segun opciom Hacer
		1:
			resultado<-abs(valorr)
			Escribir "El valor absoluto de " valorr " es: " resultado
		2:
			resultado<-rc(valorr)
			Escribir "La raiz cuadrada de " valorr " es: " resultado
		3:
			resultado<-valorr^2
			Escribir "El cuadrado de " valorr " es: " resultado
		De Otro Modo:
			Escribir "Introduzca una de las opciones."
	Fin Segun
	
FinProceso
