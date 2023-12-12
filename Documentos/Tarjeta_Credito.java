import java.util.Scanner;

public class Tarjeta_Credito {
    //Atributos de la clase tarjeta credito.
    private String nombreUsuario;
    private String numeroTarjeta;
    private String fechaExpedicion;
    private String fechaExpiracion;
    //private String dato;
    private String clave;
    private String Date;

    //METODOS
    // getter/setter de NombreUsuario
    public String getNombreUsuario(){
        return this.nombreUsuario.toUpperCase();
    }
    public void setNombreUsuario(String nombreUsuario){
        if (nombreUsuario.isBlank() /*|| "Brandon".equals(nombreUsuario)*/) {
            this.nombreUsuario="No definido";
        }else{
            this.nombreUsuario=nombreUsuario;
        }
    }

    // getter/setter de numero de tarjeta
    public String getNumeroTarjeta(){
        return this.numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta){
        if (numeroTarjeta.length()==16) {
            String part1= numeroTarjeta.substring(0, 4);
            String part2= numeroTarjeta.substring(4, 8);
            String part3= numeroTarjeta.substring(8, 12);
            String part4= numeroTarjeta.substring(12, 16);
            this.numeroTarjeta=(part1+"-"+part2+"-"+part3+"-"+part4);
        }else{
            this.numeroTarjeta="Numero de tarjeta incorrecto";
        }
    }

    // getter/stter de fecha de expedicion
    public String getFechaExpedicion(){
        return this.fechaExpedicion;
    }
    public void setFechaExpedicion(String fechaExpedicion){
        this.fechaExpedicion=fechaExpedicion;
    }

    // getter/setter de fecha de expiracion
    public String getFechaExpiracion(){
        return this.fechaExpiracion;
    }
    public void setFechaExpiracion(String fechaExpiracion){
        String dia,mes,anio;
        String[] fechaPartes = fechaExpiracion.split("/");
        if (fechaPartes.length==3) {
            dia = fechaPartes[0];
            mes = fechaPartes[1];
            anio = fechaPartes[3];
                         
        }else if (fechaPartes.length ==2) {
            mes = fechaPartes[0];
            anio = fechaPartes[1];
        }
        //this.fechaExpiracion=fechaExpiracion;
    }    

    // getter/setter de clave
    public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        if (clave.length() > 0) {
            if (clave.equals("1234")) {
                this.clave = clave;
            }
        }
    }


    // getter/setter de Dato
    /*public void setDato(String dato){
        if (dato.length() > 0) {
            if (dato.equals("xyz")) {
                this.dato = dato;
            }
            System.out.println(" ");
        }
    }
    public String getDato(){
        return dato.toUpperCase().substring(4);
    }*/
    public void crearTC() {
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        String numeroTC;
        String fechaExpericacioString;
        String fechaExpiracionString;

        //ingresar nombre
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        setNombreUsuario(nombre);
        //-----System.out.println(getNombreUsuario());

        //ingresar numero de tarjeta 
        System.out.println("Ingrese el numero de su tarjeta");
        numeroTC = ingreso.nextLine();
        setNumeroTarjeta(numeroTC);
        //-----System.out.println(getNumeroTarjeta());

        //ingresar fecha de expedicion 
        System.out.println("Ingrese la fecha de expedicion de su tarjeta");
        fechaExpericacioString = ingreso.nextLine();
        setFechaExpedicion(fechaExpericacioString);

        //ingresar fecha de expiracion
        String mes;
        System.out.println("Ingrese la fecha de expiracion de su tarjeta en el siguiente formato (mm/aa) o (dd/mm/aa)");
        fechaExpiracionString = ingreso.nextLine();
        setFechaExpiracion(fechaExpiracionString);




        //System.out.println("\nCreando TarjetaCredito...");
        //setFechaExpedicion(ingreso.nextInt(), ingreso.nextInt(), ingreso.nextInt());        
    }
}
