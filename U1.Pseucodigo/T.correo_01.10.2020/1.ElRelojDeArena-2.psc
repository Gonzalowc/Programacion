Proceso sin_titulo
	Definir tam, f, c Como Entero
	
	repetir 
		Escribir "Introduce el tamaño. mayor que 3 e impar"
		leer tam
	Hasta Que tam>3 Y tam%2=1
	
	para f<-0 hasta tam-1 Hacer
		para c<-0 hasta tam-1 Hacer
			si f=0 O f=tam-1 O f+c=tam-1 O (f+c>tam-1 y c<f) O (f+c<tam-1 y c>f) Entonces
				Escribir sin saltar " * "
			SiNo
				Si f=c Entonces
					Escribir Sin Saltar " * "
				SiNo
					Escribir Sin Saltar " - "
				Fin Si
				
			FinSi
			
		FinPara
		escribir ""
	FinPara
FinProceso
