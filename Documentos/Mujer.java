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
}