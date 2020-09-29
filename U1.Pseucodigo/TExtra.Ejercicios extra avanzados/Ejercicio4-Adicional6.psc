Proceso sin_titulo
	definir mes, descuento Como Entero
	Definir precio, total Como Real
	
	Escribir "Introduce el numero que corresponde a cada mes"
	leer mes
	descuento<-15
	Escribir "Introduzca el importe inicial de la compra"
	leer precio
	
	Si mes = 10 Entonces
		total<-(precio*descuento)/100
		Escribir "Por ser el mes Octubre obtendrá un descuento de " total " euros"
		total<-precio-((precio*descuento)/100)
		Escribir "Su factura final se queda en " total " euros"
	SiNo
		Escribir "Durante este mes no hay descuentos"
		total<-precio
		Escribir "Su factura final es de un total de " total " euros"
		
	Fin Si
	
FinProceso
