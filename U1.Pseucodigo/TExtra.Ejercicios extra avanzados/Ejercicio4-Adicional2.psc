Proceso sin_titulo
	definir cara, moneda como Entero
	definir nombreU, nombreS Como Caracter
	
	Escribir "Juega contra mi, ¿Sadrá cara o cruz? VALORES(0=CARA, 1= CRUZ)"
	leer cara
	moneda<-azar(2)
		Escribir "valor de la moneda: " moneda
	Segun cara Hacer
		0:
			nombreU= "Cara"
		1:
			nombreU= "Cruz"
		De Otro Modo:
			nombreU="Introduzca otro valor. VALORES(0=CARA, 1= CRUZ)"
	Fin Segun
	
	Segun moneda Hacer
		0:
			nombreS="Cara"
		1:
			nombreS="Cruz"
	Fin Segun
	
	Si nombreU = nombreS Entonces
		Escribir "Has acertado! la moneda ha salido " nombreS
	SiNo
		Escribir "Oh, lo siento! la moneda ha salido " nombreS
	Fin Si
	
FinProceso
