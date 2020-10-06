 SubProceso result<-esPar(num)
	Escribir Sin Saltar "¿El numero " num " es par? "
	Si num%2=0 Entonces
		result<-Verdadero
	SiNo
		result<-Falso
	Fin Si
Fin SubProceso

Proceso _12_3
	Definir num Como Entero
	repetir
	Escribir "Introduce numero para saber si es par o impar"
	Leer num
	Escribir esPar(num)
	Hasta Que num=0
FinProceso
