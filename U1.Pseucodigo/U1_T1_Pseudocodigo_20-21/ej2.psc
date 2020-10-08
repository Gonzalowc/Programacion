Proceso sin_titulo
	Definir num, cad, cad2 Como real
	
	Repetir
		Escribir "Introduce un numero largo para darle la vuelta"
		leer num
	Hasta Que num>=0
	cad2<-0
	Escribir "numero inicial: " num
	Mientras num<>0 Hacer
		cad<-num/10
		num<-trunc(cad)
		cad<-cad-trunc(cad)
		Escribir "cad: " cad "//"
		cad2<-cad2*10+(cad*10)
		cad2<-redon(cad2)
	Fin Mientras
	Escribir "Numero al reves: " cad2
FinProceso
