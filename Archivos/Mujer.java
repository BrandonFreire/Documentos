import java.util.Scanner;

public class Mujer{
    //atributos de clase mujer
    public String nombre;
    private int edad;
    private double altura;

    //Metodos 
    //Construnctor por defecto 
    public Mujer(){    //constructor
        nombre= "Ana";
        edad = 25;         //Atributos
        altura = 1.60;
        System.out.println("Mi nombre de construccion es: " + nombre);
    } 
    public void saludar(){
        System.out.println("Hola, soy una mujer y me llamo " + nombre);
    }
    public void cantar(){
        System.out.println("Estoy cantando...");    
    }
    public void bailar(){
        System.out.println("Bailo con pasos elegantes y lindos movimientos");   
    } 

    public void saludarMujer(){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Hola, soy una mujer y me llamo " + nombre);
        
        System.out.println("¿Cual es tu nombre?");
        String nombre = ((Scanner) App.sc).nextLine();
        System.out.println("Binvenido a mu casa: "+nombre);

        System.out.println("¿Cual es tu edad?");
        edad = ((Scanner) App.sc).nextInt();
        System.out.println("Tu edad es: "+edad);

        int resto = edad % 3;
        if (resto == 0){
            System.out.println("Tu edad es multiplo de 3.");
        }else{
            System.out.println("Tu edad no es multiplo de 3.");
        }
        String sim[] = {"/","|","-","\\"," "};
        for(int i = 0; i < 100 ; i++){
            
        }
    }  
}