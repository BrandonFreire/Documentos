import java.util.jar.Attributes.Name;

public class CadenaUtilities {
    public static void main(String[] args) {
        // Declaraciones
        byte asci[] = {71,70,71,72,73,75};
        byte characters[] = {'G', 'f', 'g'};
        String cad = new String(asci);
        System.out.println("Cadena original: " + cad);
        //Para escoger hasta que posicion de la cadena asci se quiere
        String cad2 = new String(asci,2,2);
        System.out.println("Cadena con posicion y longitud: " + cad2);
        //
        String cad3 = new String(characters);
        System.out.println("cadena de caracteres: " + cad3);

        String str = new String(cad3);
        System.out.println("Cadena de cadena: " + str);

        System.out.println("-------------------------------");
        System.out.println("[+] operaciones string");
        int len = str.length();
        System.out.println("Longitud de la cadena: "+len);
        


        //getDemoString();
    }

    private static void getDemoString() {
        //Formas para representar un String
        String name1 = "Geeks";
        String s = new String("Welcom");
        System.out.println(name1);
         System.out.println(s);
        //Existen veces que el compilador hace unaoptimizacion de memoria y puede guardar el mismo valor para ambos variables en un mismo espacio de memoria
        String s1 = "Tat";
        String s2 = "Tat";
        //el newo separa los espacios de memoria, para que no vaya a generar problemas
        String s3 = new String("Tat");
        String s4 = new String("Tat");
       

        //se utiliza cuando no se quiere alterar informacion
        //son secuencias inmutables
        StringBuffer demoString = new StringBuffer("Geeks");

        StringBuilder demoString1 = new StringBuilder();
        demoString1.append("Geeks");
        demoString1.insert(0,"Welcome to ");
        System.out.println(demoString1);

        //ahorra memoria 
        demoString1.append("GFG");
        demoString1.append("123");
        demoString1.append("abc");
        System.out.println(demoString1);

        name1 = name1.concat("hOLA");
        name1 = name1.concat("Hol");
    }
}
