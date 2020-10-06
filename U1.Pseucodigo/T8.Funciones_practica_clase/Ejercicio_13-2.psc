SubProceso v <- EsMultiplo ( num1, num2 )
	Si num%num2=0 Entonces
		v<-verdadero
	SiNo
		v<-falso
	Fin Si
Fin SubProceso

Proceso sin_titulo
	Definir n1, n2 Como Entero
	Escribir "Introduce 2 numeros. Introduce el primero"
	Leer n1
	Escribir "introduce el segundo"
	Leer  n2
	
	si EsMultiplo(n1,n2) Entonces
		Escribir n1 " es multiplo de " n2
	SiNo
		Escribir n1 " no es multiplo de " n2
	FinSi
	
FinProceso
