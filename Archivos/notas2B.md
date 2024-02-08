# Clase 

*30/01/2024*

Cada vez que se usa new, se invoca a espacios dinámicos 


¿como se puede tener un espacio de memoria sin referencia?

si se puede, y solo usando un "new"

si se agregara un for con el new dentro...se crearian muchos espacios de memoria y se dañaria la computadora. Pero por esa razon exiten el garbage collection, para borrar los espacios de memoria excedentes 

Si se puede tener espacios sueltos

Se puede tener muchas variables pero ligadas a un tipode dato

en la parte de Exobot no se tiene un puntero que apunte al espacio de memoria (papá) requerido, por lo que esta forma no funciona 

# Clase 

*01/02/2024*

Modelado de base de datos

cardinalidad/ relacion / son estructuras estaticos (se almacenan en el disco duro) 

1...1
1...*
*...*   -->  1 -> * -> 1  se puede ir de uno a muchos o de muchos a uno

1Pk...1Pk
1Pk...*Fk
*...* 

- en la base de datos no se corre el riesgo de perder los datos

se busca atomicidad para colocar en un solo punto todos los cambios (en actualizar registros)

integridad: permiso para acceder 

- los archivos binarios evolucionaron al mundo de la base de datos (al json)

"Marcas o empresas" que prestan servicios de base de datos:

- SQL Server : a nivel empresarial

- SQL

- Orange

- Posgnet

**siempre en una base de datos se podra:**

C : create

R : read

U : update

D : delete

- instrucciones que se ejcutan sobre una tabla (como un excel)

- primera analogia de la tabla --> es la clase (los atributos de esta clase se transformaran en las columas de la tala) *(en lugar de llamarse clases se llaman tablas)*

- flecha no entre cortada de persistencia (guardar): <-----

- al hacer un "new" se crea un objeto con su respectivo espacio de memoria y se almacena los datos de las filas, es decir, cada fila genera un objeto en memoria.

- cuando se crea un dato se crea con su respectivo espacio unico de memoria

ej:

si una persona tiene una mascota:

*Persona:*

tabla maestro

- no se necesita colocar un "new", la informacion se almacena  

- al campo unico en la tabla se le llama *"Pk: primary key"*

- se puede crear tablas sin "Pk" pero al querer hacer cambios o actualizacions se tendra problemas

- toda tabla debe tener su *"Pk" puede ser un "id : identificador unico"*
  
Pk
cedula | nomre | apellido | edad
  1701 | Jorge | Silva    | 16
  1101 | Ana   | Soña     | 20

*Mascota:*

tabla detalle (relacion 1 a muchos):

- en el campo que se repite se le llama *"Fk : foreign key"*

    Pk           Fk
idMascota | cedPersona | nomre  |   apodo   | edad
1         |     1701   | Pocha  |           | 10
2         |     1101   | Gordo  | chiquito  | 9
          |            | Gordo  | gordis    | 
          |     1701   | Scooby |           |

 no se puede tener un registro sin Fk, tal como en la fila 3; eso no es posible
 en la anterior tabla se tiene la relacion 1...* (1 a muchos) lo que quiere decir que Jorge tiene dos mascotas

- suponiendo quu ahora se desea guardar mas informacion de esa persona (cosas unicas) la tabla puede creecer infinitamente

- **regla de atomicidad:** de atomico que significa uno 

- cuando se genera una tabla muy larga se vuelve complicado el mantenimiento. Si la tabla es inmensa en largo se puede hacer una particion(fragmentar), a cada particion se le debe asignar un nombre, por ejemplo:

Persona(nombre de una parte de la tabla persona), PersonaBiometrica(nombre de la otra parte de la tabla persona) -> en estas particiones se le debe asignar el mismo Pk pr ejemplo colocar la cedula a la una y a otra particion. A esto se le llama: *relacion 1 a 1: Persona 1 ... 1 PersonaBiometrica*, esto permita crear la relacion respectiva entre las dos tablas (mismo Pk en la primera y mismo Pk en la segunda)

- el fraccionamiento permite almacenar datos por partes, la primera tabla solicita el ingreso de datos primero y en un segundo momento ingresar los datos de la segunda tabla 

retroalmentacion: 

1- tomar los datos, solo aquellos que solo son unicos

2- si la tabla crece demasiado se puede usar la tecnica 1 a 1 para que se almacene por partes la informacion, es decir, que se pueda solicitar un parte y guardarla, y despues otra.

*estrategia:* colocar el nombre de la tabla original en las tablas fraccionadas, para que se pueda organizar y saber que son una, solo que divididas

*Caso mucho a muchos*

como una persona puede tener mas de una mascota, tambien se puede que una mascota tenga varios dueños

1 persona tiene muchas mascotas, o 1 mascota tiene muchos dueños (muchos a muchos :*...*)

Pk
cedula | nomre     | apellido | edad
  1701 | Jorge     | Silva    | 16
  1101 | Ana       | Soña     | 20
  1102 | Janneth   |          | 20
  1109 | Pablo     |          | 30

    Pk           Fk
idMascota | cedPersona | nomre  |   apodo   | edad
1         |     1701   | Pocha  |           | 10
2         |     1101   | Gordo  | chiquito  | 9
3         |            | Tadeo  | gordis    | 
4         |     1701   | Scooby |           |


- crear otra tabla para representar la relacion

- relacion 1 pesona a muchos en esta tabla:

- relacion 1 mascota a muchos en esta tabla:

se quiere saber quien es dueño de Scooby, entonces se ven en la tabla PersonaMascota a quien pertenece 4

ahora si se quiere que la persona 1102 cuide a Gordo y tadeo seria de la siguiente forma:

PersonaMascota

    Fk         Fk
| cedula | idMascota |
|  1701  |     4     |
|  1109  |     4     |
|  1102  |     2     |
|  1102  |     3     |

ahora teniendo la tabla, para poder acceder a ella sin problemas, se debe colocar un Pk:

Pk      Fk         Fk
1    | cedula | idMascota |
2    |  1701  |     4     |
3    |  1109  |     4     |
4    |  1102  |     2     |
5    |  1102  |     3     |

se puede registrar datos extras para saber cuando sucedio algo, de la siguente manera:

Pk      Fk         Fk
1    | cedula | idMascota |  Hora | Fecha
2    |  1701  |     4     |       |
3    |  1109  |     4     |       |
4    |  1102  |     2     |  9am  | 2000
5    |  1102  |     3     |  10am | 2014


# Clase

*07/06/2024*

Las entidaddes son sutantivos, no puede ser plural 

Se debe tener una carpeta donde estan los scripts(es en donde se crea toda la base de datos)

para el borrado: primero se elimina el hijo y luego al padre
para crear: primero se crea el padre y luego el hijo

# Clase 

*08/02/2024*

Para poder llenar cada tabla se requiere tener una interface 

¿que se puede hacer para abreviar ciertas cosas?

una sola tabla puede llamarse a si misma, es decir el id de esta tabla se la puede llamar dentro de la misma tabla. Sin embargo, se debe analizar el conexto ya que si por ejemplo es una app para entregas...se debe desglosar la informacion

latencia es como decir "esperar en un sistema" de forma mas tecnica 

**pull**: son todos los usuarios que ingresan 

sentencias para sqlite 

**WHERE** : permite ubicarse en un campo en especifico 

**LIKE** : palabaras que tengan una letra

**LIKE "%o"**

**UNIQUE** : valida que solo debe tener una sola vez un campo. Evite duplicados en un campo
