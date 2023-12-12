import java.util.Scanner;
import java.util.Calendar;

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
        Scanner ingresoDat = new Scanner(System.in);
        if (numeroTarjeta.length()==16) {
            String part1= numeroTarjeta.substring(0, 4);
            String part2= numeroTarjeta.substring(4, 8);
            String part3= numeroTarjeta.substring(8, 12);
            String part4= numeroTarjeta.substring(12, 16);
            this.numeroTarjeta=(part1+"-"+part2+"-"+part3+"-"+part4);
        }else{
            System.out.println("Numero de tarjeta incorrecto"+"\nIngrese nuevamente el numero de tarjeta");
            this.numeroTarjeta= ingresoDat.nextLine();
        }
    }

    // getter/stter de fecha de expedicion
    public String getFechaExpedicion(){
        return this.fechaExpedicion;
    }
    public void setFechaExpedicion(String fechaExpedicion){
        Scanner ingresoDat = new Scanner(System.in);
        int enteroFecha = Integer.parseInt(fechaExpedicion);
        if (enteroFecha < 2010 || enteroFecha > 2023) {
            System.out.println("Ha ingresado incorrectamente el año de EXPEDICION de su tarjeta"+"\nIngrese nuevamente el año:");
            this.fechaExpedicion = ingresoDat.nextLine();              
        }else{
            this.fechaExpedicion=fechaExpedicion;
        }        
    }
    
    // getter/setter de fecha de expiracion
    public String getFechaExpiracion(){
        return this.fechaExpiracion;
    }
    public void setFechaExpiracion(String fechaExpiracion){
        String dia,mes,anio;
        Calendar calendario = Calendar.getInstance();
        int anioActual = calendario.get(Calendar.YEAR);
        int mesActual = calendario.get(Calendar.MONTH) + 1;     
        String[] fechaPartes = fechaExpiracion.split("/");
        if ( fechaPartes.length==3 ) {
            dia = fechaPartes[0];
            mes = fechaPartes[1];
            anio = fechaPartes[2];
            int enteroMes = Integer.parseInt(mes);
            int enteroAnio = Integer.parseInt(anio);
            if ((enteroAnio < anioActual || (enteroAnio == anioActual && enteroMes < mesActual)) && enteroAnio <= 2023) {
                this.fechaExpiracion = "Su tarjeta ha expirado";
            }else{
                this.fechaExpiracion = fechaExpiracion;
            }
            /*if (fechaPartes[2].equals("2023")) {
                this.fechaExpiracion = "Su tarjeta ha expirado";
            }else{
                this.fechaExpiracion = fechaExpiracion;
            }*/
        }else if ( fechaPartes.length==2 ) {
            mes = fechaPartes[0];
            anio = fechaPartes[1];
            if (fechaPartes[1].equals("2023")) {
                this.fechaExpiracion = "Su tarjeta ha expirado";
            }else{
                this.fechaExpiracion = fechaExpiracion;
            }     
        }else{
            System.out.println("Error en la introduccion de la fecha de expiración.");
        }
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
        System.out.println(getNumeroTarjeta());

        //ingresar fecha de expedicion 
        System.out.println("Ingrese el año de expedicion de su tarjeta");
        fechaExpericacioString = ingreso.nextLine();
        setFechaExpedicion(fechaExpericacioString);
        System.out.println(getFechaExpedicion());
        /*System.out.println("Ingrese el año de expedicion de su tarjeta");
        fechaExpericacioString = ingreso.nextLine();
        
        System.out.println("Antes de setFechaExpedicion: " + fechaExpericacioString);
        setFechaExpedicion(fechaExpericacioString);
        System.out.println("Después de setFechaExpedicion: " + getFechaExpedicion());*/
                

        //ingresar fecha de expiracion
        System.out.println("Ingrese la fecha de expiracion de su tarjeta en el siguiente formato (mm/aa) o (dd/mm/aa)");
        fechaExpiracionString = ingreso.nextLine();
        setFechaExpiracion(fechaExpiracionString);
        System.out.println(getFechaExpiracion());




        //System.out.println("\nCreando TarjetaCredito...");
        //setFechaExpedicion(ingreso.nextInt(), ingreso.nextInt(), ingreso.nextInt());        
    }
}
