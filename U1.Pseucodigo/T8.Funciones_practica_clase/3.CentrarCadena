SubProceso resultado <- EscribirCentrado ( cad )
	definir tam, esp, contador Como Entero
	tam = Longitud(cad)
	esp = trunc((80-tam)/2)
	linea=""
	Para contador<-1 Hasta esp Hacer
		linea = Concatenar(linea,".")
	Fin Para
	linea= linea+cad+linea
	Escribir Longitud(linea)
	resultado<-linea
	
Fin SubProceso

Proceso sin_titulo
	definir cad Como Caracter
	Escribir "Introduce cadena"
	leer cad
	Escribir EscribirCentrado(cad)
FinProceso
