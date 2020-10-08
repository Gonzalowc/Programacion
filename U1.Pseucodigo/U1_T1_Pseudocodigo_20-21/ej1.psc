Proceso sin_titulo
	Definir cant, i, j, k Como Entero
	Definir precio Como Real
	Definir info Como Caracter
	
	
	Escribir "Introduce la cantidad de productos"
	leer cant
	precio<-0
	Para i<-1 Hasta 100 Hacer
		Si i<=cant Entonces
			precio<-precio+5.23
		Fin Si
		k<-i
	Fin Para
	
	Para i<-k+1 Hasta 1000 Hacer
		Si i<=cant Entonces
			precio<-precio+4.16
		Fin Si
		j<-i
	Fin Para
	
	Para i<-j+1 Hasta cant Hacer
		Si i<=cant Entonces
			precio<-precio+(5.23*0.5)
		Fin Si
		k<-i
	Fin Para
	
	Si cant<=0 Entonces
		Escribir "La cantidad debe de ser positiva y distinta de 0"
	SiNo
		Escribir "Para la cantidad de " cant "u de producto. Tiene un coste de " precio " euros"
	Fin Si
	
FinProceso
