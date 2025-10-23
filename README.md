# Práctica: Depuración de código en Eclipse
Jorge González Burgos

## **Descripción de los errores encontrados**
- El flujo del bucle está mal planteado, cuando escribimos una nota no válida para un alumno. Por ejemplo, el alumno 2 ha sacado 
un 15. Esta se registra igualmente a pesar de lanzar un mensaje de error por consola y la siguiente nota que pedirá será la
del alumno 3, teniéndose en cuenta además la nota errónea del alumno dos para la media.

- Cuando introducimos un número de alumnos contador vale 0, eso hace que cuando estamos ejecutando siempre empiece a contar los alumnos en 0, obligándonos a introducir siempre un alumno extra que no queremos.

- Cuando introducimos el número de alumno y decimos que hay 0 alumnos, se calcula de forma errónea una nota media que da de resultado NaN.

## **Corrección de los errores**
- Para corregir los problemas, he creado un do while dentro del if que comprueba que las notas sean inválidas, que lo que hace es
pedir una nota válida en bucle hasta que se introduce una correecta, y entonces sí que se registra y se suma para la media.

- Para solucionar el error del contador, podemos simplemente inicializarlo con valor 1 en lugar de 0.

- Para corregir que no se pueda introducir 0 como número de alumnos, añado un do while que se repita mientras el valor sea menor o igual a 0, validando que el número de alumnos sea válido.

- Para terminar, un pequeño detalle es hacer que se impriman las notas solo con dos decimales como máximo, para ello, al final del printf donde mostramos la media ponemos %.2f para señalar que solo queremos que el resultado se muestre con dos decimales.

## **Breakpoint condicional**
En la captura del breakpoint condicional vemos que solo se entrará al breakpoint cuando la condición se de, en cuanquier otro
caso, no se entrará al breakpoint.
