# Taller de Adriano

## Explicación del código

##### Dispongo de una clase Vehículo con los atributos "Matrícula","Color" y "Marca y Modelo" con sus getters y sus setters.
##### De esta clase Vehículo parten como subclases, las clases Coche, Moto, Camión, Tractor y Grúa. Cada una de las subclases tiene un atributo donde se almacenan sus piezas y el método GET para ese atributo. 
##### Aquí es donde aplica la HERENCIA, ya que las subclases heredan atributos de la superclase Vehiculo.

##### Dispongo de una clase Taller que es la clase en la que se incluirán los métodos del programa. Esta clase tiene como atributos listas para almacenar los diferentes vehículos que se añaden en el constructor de la clase. Se añaden en esta clase los getters de los atributos y se crean los métodos REPARAR.
##### Aquí es donde aplica el POLIMORFISMO, ya que el programa escoge que método REPARAR ejecuta según lo que se le pase como parámetro.

##### En la clase ejecutable (Main) he creado un menú en el que para uno de los casos recupero el vehiculo a reparar y llamo al método REPARAR con el vehículo seleccionado

## Preguntas
### ¿Puede existir una subclase que herede de una superclase y esta a su vez herede de otra superclase?
##### Si, esto es llamado herencia en cascada y esto se implementa para facilitar la reutilización del código y la organización jerárquica de las clases en una aplicación

### ¿Puede una subclase heredar de dos superclases diferentes?
##### No, en la mayoría de los lenguajes de programación no se puede heredar directamente de dos superclases diferentes debido a problemas de ambigüedad y complejidad.
