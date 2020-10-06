SubProceso resultado <- EspaciadoCadena ( cad )
	cad2<-""
	Para i<-0 Hasta Longitud(cad) hacer
		cad2<- cad2 + subcadena(cad,i,i) + " "
	Fin Para
	
	resultado<-cad2
	
	
Fin SubProceso

Proceso sin_titulo
	definir cad Como Caracter
	Escribir "introduce cadena"
	leer cad
	Escribir EspaciadoCadena(cad)
FinProceso
