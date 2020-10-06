SubProceso resultado2 <- NumerosDivisores ( num2 )
	Definir contador Como Entero
	n= ""
	Para i<-1 Hasta num2 Hacer
		si num2%i=0 Entonces
			n<-Concatenar(n,ConvertirATexto(i))
			n<-Concatenar(n," ")
		FinSi
	Fin Para
	resultado2<-n
Fin SubProceso

SubProceso resultado <- CantidadDeDivisores ( num )
	Definir contador Como Entero
	contador=0
	n= ""
	Para i<-1 Hasta num Hacer
		si num%i=0 Entonces
			contador = contador+1
		SiNo
			contador=contador
		FinSi
		
	Fin Para
	resultado<-contador
Fin SubProceso

Proceso sin_titulo
	definir num Como Entero
	Escribir "Introduce el numero para saber numero de divisores"
	leer num
	
	Escribir "Cantidad de divisores: " CantidadDeDivisores(num)
	Escribir "Los divisores: " NumerosDivisores(num)
FinProceso
