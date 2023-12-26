# Clase 2

*fecha: 08/11/2023*

1. Abrir terminal
2. windows:             CTRL+SHIFT+P
3. quick ope:           CTRL+P  
4. toggle sidebar:      CTRL+B
5. multi-select cursor: CTRL+ALT, CTRL+F2, ALT+SHIFT+RATON
6. copy line:           SHIFT+ALT+UP, ALT+SHIFT+DOWN
7. comment code block:  SHIFT+ALTA+A (multi-line comment), CTRL+K+C (single-line)
8. goback/move forward ALT -> or+
9. Trigger suggestion and Trigger parameter hints: CTRL+SPACE,CTRL+SHIFT+SPACE
10. line cut:           CTRL+X
11. previsualizacion:   CTRL+SHIFT+V
12. limpiar terminal:   CTRL+L

----------------------------------
markdown

# titulo1

## subtitulo2

### titulo3

...
**palabras en negrita**

*palabras en cursiva*

***palabras en negrita y cursiva***

~~texto tachado~~

...
[google](www.google.com)
![imagen](img/img1.png)

------------------------------------------------------------
------------------------------------------------------------

# Clase 3

*09/11/2023*

-----------------------

Apuntes en el git
El git recopila las conexiones y cambios

-----------------------

### Git

Fue creado en 2005 por Linus Torvalds
Facilita el trabajo colaborativo

### Comandos de Git

- **Comprobar las versiones de git:**

  git --version
  git -v

- **Ayuda de git**

  git -h
  git --help

- **Pull:** para bajar cambios anteriores
- **Push:** para subir los cambios al proyecto
- **Clone:** copia un repositorio a tu computadora local
- **Commit:** guarda los cambios realizados en la carpeta actual
- **Fetch:** comando para forzar el proceso y hacer que el programa funcione

En la industria el 70% de la infraestructura esta en linux
El kernel de MacOs se basa o es linux

### Comandos de Linux

- todos los comandos de git llevan "git", y los que no entonces seran de windows

  limpiar terminal:   *clear*

  limpiar terminal:   *CTRL+L*

                      cd/home/usuario/proyecto_git 

listar:                      *ls -l*

ubicacion de las carpetas(directorio actual):  *pwd*

ver todos los directorio: *ls*

mostrar lo que hay dentro de un archivo:  *cat*

### Comando git

inicializar repositorio:       *git init*

ver la version del git:        *git --version*

configurar nombre:             *git config --global user.name "name"*

configurara correo:            *git config --global user.email "email"*

permite agregar archivos, archivos que no estan siendo respaldados:                   *git add*

como esta el estado en el background:                                                 *git status*

autocompletado:                 *tab*

 para subir todos los archivos:  *git add .*

 guardar cambios: *git commit*

 cear archivo: *touch*

 crear un archivo y escribir dentro de el: *echo "hola" > file.txt*

para abrir un archivo pero no en la terminal: *code .gitignore*

para crear archivo con su nombre: *touch name.txt*
unificar una rama: *git merge*
craer
 una rama: *git branch*

## Comandos terminal y git

- acceder a todos los directorios: ls
- volver hacia atras: cd ..

- directorio anterior: ls

- saber cual es la ruta(lugar en el que se encuentra en el equipo): pwd

- crear carpetas: mkdir "nombre_de_la_carpeta"

- desplazarce dentro de la carpeta: cd nombre_de_la_carpeta\ Git

- limpiar consola: clear

- configuracion global(cualquiera que tengo el usuario podra hacer cambios): git config --global

- crear un fichero de cogido: touch nombre.java

- cambiar el nombre de la rama: git branch -m main

- borrar una rama: git push origin :branchName
    main serea la rama principal del proyecto

- crear commits(toma fotografias de cada avance): git commit -m "Este es mi commit Nro"

- crear fotografias del proyecto (guardarlo): git add nombre_del_acrhivo.java

- como ver si la fotografia se ha realizado: git log

- para eliminar un archivo: rm nombre_del_archivo.java  
-- Para archivos sin guardar --

- volver para atras a la ultima fotografia: git checkout nombre_del_archivo.java

- para regresar mas antes: git reset

- para ver todo de mejor forma: git log --graph --pretty=oneline

- abreviar los commits: git log --graph --decorate --all --oneline

- archivo oculto(ocultar un fichero): touch .gitignore

- sin realizar una fotografia ver lo que ha ido cambiando: git diff

para ir al final de la rama:

# Clase 4

*Fecha: 13/11/2023*

# Clase 4

 *Fecha: 13/11/2023*

# Clase 5

 *Fecha: 14/11/2023*

- parametro: sirve para caracterizar al metodo, le da las particularidades para que ejecute
- todos los bucles siempre tienen un condicional definido
- ambito o tambien conocido como modificador de acceso:
¿Que es?
Tiene tres posibilidades que son: public (para todos, todos lo pueden ver, tiene acceso publico, en general las clases seran publicas)
                                 protected (solo "amigos")
                                 private   (solo "yo")

---------

# Clase 6

*16/11/2023*
*crear por medio del constructor
*el constructor, caracteristicas:
-es un "metodo" publico, no puedo ser privado porque alguien tiene que llamarlo.
-debe ser unico y tener el mismo nombre de la clase
-sino se lo coloca se autodefine
-se auto-ejecuta con "new" y una unica vez
-cada vez que se coloca "new" se crea un espacio en memoria para almacenar este objeto

(aquel que construye el objeto)
instancia= {crear -> utilizar un constructor - new(luego llamarlo, new lo llama)}

- el punto rojo que aparece al lado de cada linea de codigo se llama punto de corte para poder detener desde ahi el programa y poderlo arrancar

## objetos

- el computador lee la sentencia new, separa un espacio de memoria RAM para que pueda estar este objeto. Una vez en la RAM se necesita "algo" para poder ingresar y darle nombres

- recolector de basura esta encargado de limpiar la ram

# Clase

*06/12*

- Clase pública: para que el computador lo pueda ver.

- Código:

public class TarjetaCredito{   //en singular

  //propiedades de tipo privado ya que si fuese público esto crearía que pudiesen cambiar su valor (private es un nivel de protección)

  //luego se generará un canal para darle el nivel de acceso

  //declaración de variables y nombre completo

  //camelCase

  private String nombreUsuario;

  private String numeroTarjeta;

  private String dato;

  private String clave; //falta el get y el set

  private Date; //almacenar una fecha y hacer get y set

// string.format(“mm/yy”, fecha)

  //getter setter

//showTC(); para mostrar

   public void setDato(String Dato){

      if(Dato.length > 0)

         if(Dato.equals(“xyz”))

            this.dato = dato;
 }

public void getDato(){
   return dato.upperCase().substring(4);
}

//Metodos

public String cambiarClave(String claveAnterior, String claveNueva String ClaveNuevaReescribir){
    
    String observación = “”;
    
    if(!claveAnterior.equals(getClave())){
    
      observación += “Clave anterior no es igual \n”;

}

if(!claveNueva.equals(ClaveNuevaReescribir)){

    observación+= “clave nueva no coincide”;

}


//le dice que la clave está bien y que cambie la clave

if(observación .equals(“ ”)){

  setClave(claveNueva);

}


//operador ternario

return (observación.equals(“ ”)? “ok” : observacion);

}

/**regla de negocios: cada empresa tienen sus reglas
 * set: todo lo que ingresará (colocar)
 * get: trabajar la lectura del valor (traer)
 * sout (TarjetaCredito.getDato ()); es equivalente a sout(TarjetaCredito);
 * TarjetaCredito.setDato(“”) equivalente a TarjetaCredito = = “toma”;
*/

}
// método:

 retirar(cantidad)

 cambiarClase (claveAnterior , claveNueva)

 pagar(cantidad, localidad)

# Clase:

07/12
UML
## 1.- use case: 
Es el lugar donde estarán los objetos (ayudará a graficar). Procesos de negocios/módulos (acciones)




Flecha hacia la izquierda dice que primero se ejecuta el anterior y luego el que apunta 

Flecha hacia la derecha primero el anterior y luego el que le apunta la flecha 

Flecha cerrada indica jerarquía

Para empezar con el modelado primero se debe conocer a detalle el problema a solucionar 

Ejemplo:

Supermaxi requiere que las compras de sus clientes se paguen con 
tarjeta de crédito insitu con datafast 

- buscar un actor: supermaxi, clientes (todos los actores de representan con un muñeco) 

- use case: mapea procesos (ir, ar, er)
UC01 //etiquetas 


Finalidad de los use case es entender el proceso, el giro de un negocio 

El dibujo es el camino a seguir 

## 2.- Diagrama de clase 

¿Como se representa una clase?
￼
Para representar relaciones entre las clases se tiene también flechas 

Cuando se programa todo lo representado se pasará a código 

En programación orientada a objetos todo es un objeto 
￼

## 3- herencia 

Son los “hijos” de la clase 

Todo lo que tenga el “padre” lo tendrán los hijos 

La clase hijos utiliza la herencia para heredar características comunes de la clase padre

Representación de herencia 

￼
"+" : public

"-" : private

"#" : protected 

