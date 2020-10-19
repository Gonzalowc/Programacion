SubProceso resultado2<-ocurrencias ( array, num )
	Definir result2 Como Caracter
	Definir cont Como Entero
	i<-0
	result2<-""
	
	Mientras i<=99 Hacer
		Si array[i] = num Entonces
			
			result2<-Concatenar(result2,"[")
			result2<- Concatenar(result2,ConvertirATexto(i+1))
			result2<-Concatenar(result2,"] ")
		Fin Si
		i=i+1
	Fin Mientras
	resultado2<-result2
Fin SubProceso


SubProceso resultado1 <- contiene ( array, num )
	definir result Como Logico
	result<-Falso
	Para i<-0 Hasta 99 Hacer
		Si array[i] = num Entonces
			result<-Verdadero
		Fin Si
	Fin Para
	Si result <> Verdadero Entonces
		result<-Falso
	Fin Si
	resultado1<-result
	
Fin SubProceso


Proceso sin_titulo
	Definir num Como Entero
	Dimension arr[100]
	
	
		
	i=0
	Repetir
		arr[i]<-azar(200)
		Escribir Sin Saltar " [" arr[i] "] "
		i=i+1
	Hasta Que i>=100
	Escribir ""
	Escribir "Introduce el numero a buscar en el array aleatorio"
	leer num
	Escribir  "¿El Array contiene el numero " num "?: " contiene(arr,num)
	
	Si contiene(arr,num)=Verdadero Entonces
		Escribir "El número se encuentra en la posicion " ocurrencias(arr,num) "dentro del array"
	SiNo
		Escribir ""
	Fin Si
	
FinProceso
