Proceso sin_titulo
	definir PASS, PASSWD Como Caracter
	Definir COD, COD_SYS Como Entero
	COD_SYS<-1
	PASSWD<-"1234"
	Escribir "Bienvenido, Identifiquese con usuario y contraseņa"
	Escribir "Escribe el usuario"
	leer COD
	Escribir "Escribe la contraseņa"
	leer PASS
	Repetir
		Escribir "Escribe el usuario"
		leer COD
		Escribir "Escribe la contraseņa"
		leer PASS
	Hasta Que PASS = PASSWD Y COD=COD_SYS
	Escribir "Bienvenido"
FinProceso
