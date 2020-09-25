Proceso sin_titulo
	Definir pesetas Como Entero
	Definir euro Como Real
	euro <- 166.386
	Escribir 'Cambio de PESETAS a Euros'
	Leer pesetas
	euro <- pesetas/euro
	Si pesetas<0 Entonces
		Escribir 'La cantidad no puede ser negativa'
	SiNo
		Escribir pesetas,' Pesetas son ' euro ' euros'
	FinSi
FinProceso
