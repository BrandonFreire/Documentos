import java.util.Scanner;

public class AppTarjetaCredito {
    public static void main(String[] args) {
        Tarjeta_CreditoOriginal tarjetaCredito = new Tarjeta_CreditoOriginal();
        Scanner sc = new Scanner(System.in);
        //Nombre usuario
        tarjetaCredito.setNombreUsuario("Brandon Freire");
        System.out.println(tarjetaCredito.getNombreUsuario());
        //Numero de tarjeta
        tarjetaCredito.setNumeroTarjeta("0123456789123478");
        System.out.println(tarjetaCredito.getNumeroTarjeta());
        //Fecha
        
    }
}
