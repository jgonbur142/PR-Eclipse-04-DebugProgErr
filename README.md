# Práctica: Depuración de código en Eclipse
Jorge González Burgos

## **Descripción de los errores encontrados**
El flujo del bucle está mal planteado, cuando escribimos una nota no válida para un alumno. Por ejemplo, el alumno 2 ha sacado 
un 15. Esta se registra igualmente a pesar de lanzar un mensaje de error por consola y la siguiente nota que pedirá será la
del alumno 3, teniéndose en cuenta además la nota errónea del alumno dos para la media.

## **Corrección de los errores**
Para corregir los problemas, he creado un do while dentro del if que comprueba que las notas sean inválidas, que lo que hace es
pedir una nota válida en bucle hasta que se introduce una correecta, y entonces sí que se registra y se suma para la media.

## **Breakpoint condicional**
En la captura del breakpoint condicional vemos que solo se entrará al breakpoint cuando la condición se de, en cuanquier otro
caso, no se entrará al breakpoint.
