Proceso sin_titulo
	Definir n1,n2,n3 Como Entero
	
	Escribir "Dame tres numeros y te digo cual es el mayor"
	Escribir "Introduce el primer numero"
	leer n1
	Escribir "Introduce el segundo numero"
	Leer n2
	Escribir "INtroduce el tercer numero"
	leer n3
	
	
si n1=n2 Y n2=n3 Entonces
	Escribir "El numero es el mismo en los 3 casos"
	SiNo
	Si n1>n2 Y n1>n3 Entonces
		Escribir "El numero mas grande es: " n1
	SiNo
		Si n2>n3 Entonces
			Escribir "El numero mas grande es: " n2
		SiNo
			Escribir "El numero mas grande es: " n3
		Fin Si
	Fin Si
FinSi
FinProceso
