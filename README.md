# Nivell 1 Tasca 5 - UTILS

## Compilar y ejecutar el programa desde la terminal

Para compilar y ejecutar el programa, sigue estos pasos:

### PASO 1: Ir a la carpeta raíz del proyecto

Accede a la carpeta raíz del proyecto utilizando el siguiente comando:

```
cd /ruta/hasta/la/carpeta/raiz
```

**Ejemplo:**

```
cd /Users/test/IdeaProjects/S1_Tasca5_Utils
```

### PASO 2: Compilar el proyecto

Compila el proyecto con el siguiente comando:

```
javac -d out ruta/que/contiene/archivos/java/*.java
```

**Ejemplo:**

```
javac -d out src/main/java/org/example/nivell1/exercici1/*.java
```

- El comando `javac` compila los archivos Java.
- La opción `-d out` crea la carpeta `out`, donde se almacenarán los archivos compilados (.class) listos para su ejecución.

### PASO 3: Ejecutar el programa

Ejecuta el programa con el siguiente comando:

```
java -cp ruta/de/carpetaConArchivosCompilados NombreClasePrincipal
```

**Ejemplo:**

```
java -cp out org.example.nivell1.exercici1.Main
```

- El comando `java` ejecuta el programa.
- La opción `-cp out` indica la ruta de la carpeta (`out`) que contiene los archivos compilados.
- Asegúrate de especificar el nombre completo de la clase principal con su paquete (en este caso, `org.example.nivell1.exercici1.Main`).
