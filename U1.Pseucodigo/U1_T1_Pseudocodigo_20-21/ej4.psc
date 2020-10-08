Proceso ejercicio4
	Definir num, cont, suma, i Como entero
	definir max, min Como Real
	suma<-0
	cont<-0
	max<-0
	min<-0
	Repetir
		Escribir "Introduce numeros. Parará cuando sean Primos"
		leer num
		cont2<-0
		Para i<-1 Hasta num  Hacer
			
			Si num%i=0 Entonces
				cont2<-cont2+1
				
			Fin Si
			
		Fin Para
		
		Si num>1 Entonces
			Si cont=0 Entonces
				min<-num
			Fin Si
			
			Si cont2>2 Entonces
				Si max<num Entonces
					max<-num
				Fin Si
				Si min>num Entonces
					min<-num
				Fin Si
				cont<-cont+1
				suma<-suma+num
				
			SiNo
				si cont>0 Entonces
					Escribir "Media: " suma/cont 
					Escribir "Suma : " suma 
					Escribir "Min  : " min 
					Escribir "Max  : " max
				SiNo
					Escribir "Ha introducido inicialmente un numero primo"
				Fin Si
			Fin Si
		SiNo
			Escribir "El numero tiene que ser mayor que 1"
			Escribir ""
		Fin Si

	Hasta Que cont2=2
	
FinProceso
