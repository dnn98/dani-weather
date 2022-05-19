# Introducción

**WeatherForecast** es un ejercicio similar a la [Weather kata](https://github.com/CodiumTeam/weather-kata) de [Codium Team](https://www.codium.team).

Se trata de una clase con un método público que devuelve la previsión del tiempo de una ciudad en una fecha concreta.

Para ello, esta clase utiliza una API externa (requiere conexión a internet): [www.metaweather.com](https://www.metaweather.com)

Ejemplo:

```java
WeatherForecast weatherForecast = new WeatherForecast();
weatherForecast.getCityWeather("Madrid", new Date());
```


# Ejercicio

El ejercicio consiste en **refactorizar** el código para hacerlo más **mantenible**, ya que el código existente, aunque **funciona**, es muy difícil de entender.

Para ello se pueden realizar múltiples modificaciones siempre que se mantenga el API público. Ejemplos de modificaciones: incluir tests automáticos, extraer métodos, renombrar variables, modificar tipos de datos, crear nuevas clases, añadir librerías, etc.


# Documentación

La solución debería contener un fichero README donde se respondan estas preguntas:
- ¿Qué has empezado implementando y por qué?

He empezado separando la lógica de la conexión a la API en una clase diferente, porque es la parte que he visto mas claramente que se podia diferenciar y la que mas sentido tenia ser separada.

- ¿Qué problemas te has encontrado al implementar los tests y cómo los has solventado?

El principal problema que he encontrado ha sido que no es posible hacer este test a un método que llama a una API externa, ya que puede devolver un valor diferente cada vez. Por lo tanto, hay que mockear la respuesta de la API y así comprobar que todo lo demás que no depende de la API funciona bien.

No he conseguido mockearlo correctamente pero he entendido el concepto, finalmente lo que he hecho es que la clase ConnectionTest devuelve lo que devolvería la api.

A partir del segundo día, la api ha estado caida, así que he trabajado como he podido con una respuesta de la api adquirida previamente.

- ¿Qué componentes has creado y por qué?

He creado la clase Connection para separar la lógica de la conexión a la api del procesamiento de los datos, y la clase ConnectionTest para devolver una respuesta como si fuera la api para los tests (y además porque la api se ha caído al segundo día de trabajo y no ha vuelto a ponerse online).

Además he separado las dos llamadas que hace a la api en WeatherForecast en dos funciones distintas, ya que lo he visto así mas limpio. La primera función tiene por parámetro el nombre de la ciudad y devuelve el id de dicha ciudad, y la segunda función tiene por parámetro el id de la ciudad y devuelve el tiempo que hace en esa ciudad.

- Si has utilizado dependencias externas, ¿por qué has escogido esas dependencias?

He usado Mockito para intentar y comprender como mockear la llamada de la api.

- ¿Has utilizado streams, lambdas y optionals de Java 8? ¿Qué te parece la programación funcional?

No los he usado pero he intentado poner en funciones todo aquello que he podido y veía que tenía sentido, con el objetivo en mente de que la función pueda ser reemplazada por un valor sin que esto afecte al funcionamiento del programa.

- ¿Qué piensas del rendimiento de la aplicación?

Es un rendimiento normal, los tests se ejecutan con normalidad. Cuando se llama a la api se tarda muchos segundos, pero esto es algo que depende de la api, no de nuestro programa.

- ¿Qué harías para mejorar el rendimiento si esta aplicación fuera a recibir al menos 100 peticiones por segundo?

Implementaría multithreading para las peticiones, para realizar varias a la vez y no ir una por una. (Primero obteniendo el id de la ciudad y luego el tiempo para cada tanda de peticiones)

- ¿Cuánto tiempo has invertido para implementar la solución?

En total unas 7 horas, a lo largo de 3 días. Como he mencionado anteriormente, la api se cayó después del primer dia, cosa que ha dificultado un poco la práctica pero no mucho.

- ¿Crees que en un escenario real valdría la pena dedicar tiempo a realizar esta refactorización?

Depende, si es un proyecto que se piensa en expandir en un futuro, si, pero si es un proyecto que no necesita aumentar de tamaño y actualmente hay otros proyectos mas importantes en el equipo, no sería una prioridad.


# A tener en cuenta

- Se valorará positivamente el uso de TDD, se revisarán los commits para comprobar su uso.
- Se valorará positivamente la aplicación de los principios SOLID y "código limpio".
- La aplicación ya tiene un API público: un método público que devuelve el tiempo en un String. No es necesario crear nuevas interfaces: REST, HTML, GraphQL, ni nada por el estilo.


# Entrega

La solución se puede subir a un repositorio de código público como [github](https://github.com/).

Otra opción sería comprimir la solución (incluyendo el directorio .git) en un fichero .zip/.tar.gz y enviarlo por email.
