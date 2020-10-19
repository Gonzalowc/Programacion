Proceso factorial
	Definir num, i, fact Como real
	Definir respuesta Como Caracter
	respuesta<-"S"
	Mientras respuesta="S" O respuesta="s" Hacer
		Escribir "Introduce un numero para calcular su factorial"
		leer num
		fact<-1
		Si num<=170 Entonces
			Para i<-1 hasta num Hacer
				fact=fact*i
			FinPara
			Escribir "El factorial de " num " es: " fact
		SiNo
			Escribir "El número es muy grande, consideralo Infinito"
		Fin Si		
		Escribir "Desea calcular otro factorial? (S/N)"
		leer respuesta
	FinMientras
	
	
	
FinProceso
