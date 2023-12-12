import java.util.Scanner;

public class Tarjeta_Credito {
    //Atributos de la clase tarjeta credito.
    private String nombreUsuario;
    private String numeroTarjeta;
    private String dato;
    private String clave;
    private String Date;
    //Metodos
    // getter/setter de NombreUsuario
    public String getNombreUsuario(){
        return this.nombreUsuario.toUpperCase();
    }
    public void setNombreUsuario(String nombreUsuario){
        if (nombreUsuario.isEmpty()) {
            this.nombreUsuario="No definido";
            this.nombreUsuario=nombreUsuario;
        }else{
            this.nombreUsuario=nombreUsuario;
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

    // getter/setter de numero de tarjeta
    public String getNumeroTarjeta(){
        return this.numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta){
        if (numeroTarjeta.length() > 0 && numeroTarjeta.length() < 17) {
            String part1= numeroTarjeta.substring(0, 4);
            String part2= numeroTarjeta.substring(4, 8);
            String part3= numeroTarjeta.substring(8, 12);
            String part4= numeroTarjeta.substring(12, 16);
            this.numeroTarjeta=(part1+"-"+part2+"-"+part3+"-"+part4);
        }else{
            this.numeroTarjeta="Numero de tarjeta incorrecto";
            this.numeroTarjeta=numeroTarjeta;
        }
    }


    //METODOS
    public void crearTC(){
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        setNombreUsuario(nombre);
        //System.out.println("\nCreando TarjetaCredito...");
        ingreso.close();
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
}
