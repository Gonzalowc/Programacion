Proceso decimalAbinario
	Definir n,x,digito,binario Como real
	Escribir "Introduce un numero"
	leer n
	Si n<0 Entonces
		Escribir "El numero debe de ser positivo"
		n<-abs(n)
	Fin Si
	
	temporal=n
	x=1
	binario=0
	Mientras n>0 Hacer
		si n mod 2 == 1 Entonces
			binario = binario+x
		FinSi
		n=trunc(n/2)
		x=x*10
	FinMientras
	Escribir "El numero " temporal " convertido a binario es: " binario
FinProceso
