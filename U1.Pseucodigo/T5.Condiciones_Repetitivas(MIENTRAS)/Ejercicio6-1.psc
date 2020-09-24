Proceso sin_titulo
	Definir USU, PASS, PASS_SYS Como Caracter
	PASS_SYS<-"1234"
	Escribir "Buenos dias, introduzca su usuario"
	leer USU
	Escribir USU " Introduzca su password"
	Leer PASS
	
	Mientras PASS!=PASS_SYS Hacer
		Leer PASS
	Fin Mientras
	Escribir "Bienvenido " USU
FinProceso
