# MarsRovers-Kata
### 🦼 Mars Rover Kata Simplificada
El objetivo de la kata Mars Rover es programar un controlador para un rover que se mueve por la superficie de Marte. 

El rover se mueve en una cuadrícula bidimensional de 10x10 y puede girar a la izquierda, a la derecha y avanzar en la dirección que mira. 

El controlador recibirá una cadena de entrada que describe una serie de instrucciones para mover el rover. La cadena de entrada se verá así: `LMLMLMLMM`

Las instrucciones indican cómo mover el rover. Cada instrucción es una de las siguientes letras: 
* L - girar a la izquierda ⬅️
* R - girar a la derecha ➡️
* M - avanzar un paso en la dirección actual ⤴️⤵️

El objetivo del controlador es procesar la cadena de entrada y mover el rover según las instrucciones dadas, empezando desde la posición inicial (0,0) y la orientación inicial hacia el Sur. 

El controlador deberá imprimir la posición del rover en la cuadrícula después de cada movimiento, donde la posición (0,0) corresponde a la esquina superior izquierda del tablero.

### Ouput:
(0, 4) N