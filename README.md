# Nivell 1 Tasca 5 _ UTILS

## Compilar y ejecutar programa desde terminal

Seguimos siguientes pasos:

**Paso 1:**

Movemos hasta la carpeta raíz con siguiente comando

cd tu/ruta/hasta/la/carpeta/raiz

Ejemplo:


``cd /Users/test/IdeaProjects/S1_Tasca5_Utils``

**PASO 2**

Compilamos el proyecto con siguiente comando:

javac -d out carpeta/que/contiene/archivos/java/conTodosLosArchivosJava

Ejemplo:

``javac -d out src/main/java/org/example/nivell1/exercici1/*.java``

el comando javac compila el programa. 
el comando -d crea una carpeta con nombre out donde se guardarán los archivos java compilados para su ejecucion

**PASO 3**

Ejecutar el programa con el siguienete comando:

java -cp carpetaConLosArchivosCompilados/Main

Ejemplo:

``java -cp out org.example.nivell1.exercici1.Main``

el comando java ejecuta
el comando -cp nombreDeCarpeta indica la ruta desde donde se debe ejecutar el programa.

 