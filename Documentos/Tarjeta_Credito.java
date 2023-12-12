import java.util.Scanner;
import java.util.Calendar;

public class Tarjeta_Credito {
    //Atributos de la clase tarjeta credito.
    private String nombreUsuario;
    private String numeroTarjeta;
    private String fechaExpedicion;
    private String fechaExpiracion;
    private String banco;
    private String tipoTC;
    private String CVV;
    private String clave;

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
        return this.fechaExpiracion.substring(3, 10);
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
        return this.clave.replaceAll(".","*");
    }
    public void setClave(String clave){
        Scanner ingresarDat = new Scanner(System.in);
        if (clave.length() > 0 && clave.length()<7) {
            /*if (clave.equals("1234")) {
                this.clave = clave;
            }*/
            this.clave=clave;
        }else{
            System.out.println("Ha excedido la cantidad maxima de caracteres para la clave"+"\nVuelva a ingresarla");
            this.clave = ingresarDat.nextLine();
        }
    }

    // getter/setter de CVV
    public String getCVV(){
        return this.CVV;
    }
    public void setCVV(String CVV){
        Scanner ingresoDat = new Scanner(System.in);
        if (CVV.length()==3) {
            this.CVV = CVV;
        }else{
            System.out.println("Codigo CVV incorrecto"+"\nVuelva a ingresarlo");
            this.CVV= ingresoDat.nextLine();
        }
    }

    // gettet/setter de banco
    public String getBanco(){
        return this.banco.toUpperCase();
    }
    public void setBanco(String banco){
        Scanner ingresoDat = new Scanner(System.in);
        if (banco.length()==9) {
            this.banco="Pichincha";
        }else{
            System.out.println("Banco ingresado es incorrecto, por favor intente nuevamente:");
            this.banco=ingresoDat.nextLine();
        }
        
    }

    // getter/setter de tipo de tarjeta de credito
    public String getTipoTC(){
        return this.tipoTC.toUpperCase();
    }
    public void setTipoTc(String tipoTC){
        tipoTC = tipoTC.toLowerCase();
        if (tipoTC.equals("visa")) {
            this.tipoTC = tipoTC;
        }else{
            System.out.println("El tipo de Tarjeta de Credito no es valido, solo se admiten VISA.");
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

        //ingresar banco
        System.out.println("Ingrese el nombre de su banco");
        setBanco(ingreso.nextLine());
        System.out.println(getBanco());

        //ingresar tipo de tarjeta
        System.out.println("Ingrese el tipo de tarjeta");
        setTipoTc(ingreso.nextLine());
        System.out.println(getTipoTC());

        //ingresar nombre
        System.out.println("Ingrese el nombre del titular de la tarjeta");
        setNombreUsuario(ingreso.nextLine());
        System.out.println(getNombreUsuario());

        //ingresar numero de tarjeta 
        System.out.println("Ingrese el numero de su tarjeta");
        setNumeroTarjeta(ingreso.nextLine());
        System.out.println(getNumeroTarjeta());

        //ingresar la clave
        System.out.println("Ingrese su clave personal para la tarjeta");
        setClave(ingreso.nextLine());
        System.out.println(getClave());

        //ingresar fecha de expedicion 
        System.out.println("Ingrese el año de expedicion de su tarjeta");
        setFechaExpedicion(ingreso.nextLine());
        System.out.println(getFechaExpedicion());

        //ingresar fecha de expiracion
        System.out.println("Ingrese la fecha de expiracion de su tarjeta en el siguiente formato (mm/aa) o (dd/mm/aa)");
        setFechaExpiracion(ingreso.nextLine());
        System.out.println(getFechaExpiracion());

        //ingreso codigo CVV
        System.out.println("Ingrese el codigo cvv de la tarjeta:");
        setCVV(ingreso.nextLine());
        System.out.println(getCVV());

        System.out.println("\nCreando TarjetaCredito...");
        for(int i=0 ; i<50 ; i++){
            System.out.print(" ");
            try {Thread.sleep(100);} 
            catch (InterruptedException ie) {}
        }
        System.out.println("¡La Tarjeta de Credito fue creada con exito!");       
    }

    public void mostrarTC(){
        System.out.println("frente");
        System.out.println("----------------------------------------------");
        System.out.println("| "+getBanco()+"                            "+getTipoTC()+"  |");
        System.out.println("|                                            |");
        System.out.println("| "+getNombreUsuario()+"                              |");
        System.out.println("| "+getFechaExpedicion()+"                              "+getFechaExpiracion()+"  |");
        System.out.println("|                                            |");
        System.out.println("|             "+getNumeroTarjeta()+"            |");
        System.out.println("----------------------------------------------");
        System.out.println("\nreverso");
        System.out.println("----------------------------------------------");
        System.out.println("|                                            |");
        System.out.println("|////////////////////////////////////////////|");
        System.out.println("|  *                                         |");
        System.out.println("|  * *                                       |");
        System.out.println("|  * * *                               "+getCVV()+"   |");
        System.out.println("|        SanaSana             Multicines     |");
        System.out.println("----------------------------------------------");
    }
}
