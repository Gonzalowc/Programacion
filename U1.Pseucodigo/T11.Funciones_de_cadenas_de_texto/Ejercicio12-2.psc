Proceso sin_titulo
	Definir cad, cad2 Como Caracter
	Definir i Como Entero
	
	Escribir "Introduce tu nombre"
	Leer cad
	i=0
	cad2<-""
	Repetir
		
			Si (longitud(cad)-i)%2=0 Entonces
				cad2 <- cad2 + Minusculas(SubCadena(cad,i,i))
			SiNo
				cad2 <- cad2 + Mayusculas(SubCadena(cad,i,i))
			FinSi
			i=i+1
			
		Hasta Que i>Longitud(cad)-1
		Escribir cad2
FinProceso
