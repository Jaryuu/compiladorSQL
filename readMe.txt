Julio Ayala, 12362
Ricardo Zepeda, 12311


Consideraciones para la ejecucion del programa:
- Se debe tener JRE 1.8 instalado.
- Considerar que entre más grande sea la cantidad de queries en un archivo, más tiempo se demorará en ejecutar.


Ejecucion:
- Ejecutar el archivo compiladorSQL.jar
- Se puede escribir las queries separadas por punto y coma o cargar a partir de un archivo de texto.
- Si se activa la opcion de verbose, se debe haber ejecutado el jar desde la linea de comando, ya que aqui aparecerán los mensajes.
- Al momento de hacer una consulta, el resultado se puede observar en la pestaña llamada query result.


Archivos externos:
- El programa genera las bases de datos en una carpeta llamada BasesDeDatos que tiene un metadata global de las bases de datos y una carpeta por cada base de datos. En cada carpeta hay un metadata de la base de datos así como los archivos de sus tablas. El archivo de las tablas contiene todas sus tuplas. Todos los archivos generados están en formato XML. ADVERTENCIA: No borrar ni modificar los archivos contenidos en BasesDeDatos ya que esto puede afectar negativamente el comportamiento del programa.

Especificaciones técnicas:
- Lenguajes de programación utilizados: Java, XML
- Librerías externas: ANTLR 4.4 (1)


Referencias:
(1) 
Parr T. (2014) ANTLR 4.4 [Computer Software]. En: http://www.antlr.org/