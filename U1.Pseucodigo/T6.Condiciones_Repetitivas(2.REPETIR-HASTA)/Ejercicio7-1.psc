Proceso sin_titulo
	definir PASS, PASSWD Como Caracter
	Definir COD, COD_SYS Como Entero
	COD_SYS<-1
	PASSWD<-"1234"
	Escribir "Bienvenido, Identifiquese con usuario y contrase�a"
	Escribir "Escribe el usuario"
	leer COD
	Escribir "Escribe la contrase�a"
	leer PASS
	Repetir
		Escribir "Escribe el usuario"
		leer COD
		Escribir "Escribe la contrase�a"
		leer PASS
	Hasta Que PASS = PASSWD Y COD=COD_SYS
	Escribir "Bienvenido"
FinProceso
