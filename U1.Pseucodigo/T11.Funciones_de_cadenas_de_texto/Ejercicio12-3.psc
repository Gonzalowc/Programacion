Proceso sin_titulo
	Definir cad, cad1, cad2, total Como Caracter
	definir i, palabras Como Entero
	
	Escribir "Introduce una frase para saber la cantidad de palabras"
	leer cad
	i<-0
	palabras<-1
	cad1<-""
	cad2<-""
	total<-""
	Repetir
		cad2<-SubCadena(cad,i,i)
		total = Concatenar(cad1,cad2)
		Si total = "  " Entonces
			palabras=palabras
		SiNo
			Si cad2= " " Entonces
				palabras = palabras+1
			SiNo
				palabras = palabras
			Fin Si
		cad1 = cad2
		cad2 = total
			
		Fin Si
		i=i+1
	Hasta Que i>=Longitud(cad)
	Escribir "hay " palabras " palabras"
FinProceso
