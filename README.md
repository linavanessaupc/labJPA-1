# JAX-RS Template Application

This is a template for a lightweight RESTful API using JAX-RS. The sample code is a call for getting the current time.
    
## Running the application locally

First build with:

    $mvn clean install

Then run it with:

    $ java -cp target/classes:target/dependency/* com.example.Main

## Respuesta

Cuando se utiliza la anotación @OneToMany en la clase Competidor, junto con el atributo "productos" de tipo Set, se crea una conexión entre las dos entidades. Esto significa que en la tabla de la entidad Producto, se agrega una columna llamada "competitor_id" que guarda el identificador del competidor al que pertenece cada producto. De esta manera, se puede establecer una relación entre los competidores y sus productos. Por ejemplo, si se quieresaber qué productos tiene un competidor en particular, simplemente hay que ocnsultar la tabla Producto y buscar los registros que tengan el mismo "competitor_id" que el competidor que nos interesa.
