Algoritmo Ejercicio6
	Definir promedio1, promedio2, suma1, suma2 Como Real
	Mientras i <= 100 Hacer
		x <- azar(100)+1
		Escribir x, " "
		Si x < 25 Entonces
			suma1 = suma1+x
			c<- c+1
		FinSi		
		Si x >= 25 Entonces
			suma2 = suma2+x
			a<- a+1
		Fin Si
		i <- i+1
	Fin Mientras
	promedio1 = suma1/c
	promedio2 = suma2/a
	Escribir "Personas con menos de 25 años = " c
	Escribir "Personas con más de 25 años = " a	
	Escribir "El promedio de personas con menos de 25 años es = " promedio1
	Escribir "El promedio de personas con mas de 25 años es = " promedio2
FinAlgoritmo
