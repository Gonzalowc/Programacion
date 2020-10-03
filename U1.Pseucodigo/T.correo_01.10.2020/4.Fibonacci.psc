Proceso ej4_correo
	
	Definir n, n1, n2, total, i Como Entero
	Repetir
		Escribir "Introduce la cantidad de numeros de fibonacci que desea"
		leer n
	Hasta Que n>=3
	
	
	
	n1<-0
	n2<-1
	total<-0
	i<-2
	Escribir Sin Saltar n1 " " n2 " "
	Repetir
		total = n1+n2
		Escribir Sin Saltar total " "
		n1 = n2
		n2 = total
		i=i+1
	Hasta Que i>=n
	
	Escribir ""
FinProceso
