public class Simulador {

    /*public static void main(String[] args) {
        String nombre = "patmic";

        // Definir los arrays de coordenadas x e y
        char[] letras = nombre.toCharArray();
        int[] coordenadasX = new int[letras.length];
        int[] coordenadasY = new int[letras.length];

        // Asignar las coordenadas x e y según la función f(x) = 2x
        for (int i = 0; i < letras.length; i++) {
            coordenadasX[i] = i + 1;
            coordenadasY[i] = 2 * coordenadasX[i];
        }

        // Imprimir el gráfico
        imprimirGrafico(letras, coordenadasX, coordenadasY);
    }

    public static void imprimirGrafico(char[] letras, int[] coordenadasX, int[] coordenadasY) {
        int longitud = letras.length;

        // Imprimir el gráfico
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < longitud; j++) {
                if (i == coordenadasY[j]) {
                    System.out.print(letras[j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Imprimir el eje x
        for (int i = 0; i <= longitud * 2; i++) {
            System.out.print("_");
        }
        System.out.println();

        // Imprimir los números en el eje x
        for (int i = 0; i < longitud; i++) {
            System.out.print(coordenadasX[i] + " ");
        }
    }*/
    public static void main(String[] args) {
        //int tamMatriz = 8;
        grafico();
        
    }
    /*public static void grafico(){
        String nombre= "brandon";
        int tamMatriz = nombre.length();
        char[] letras = nombre.toCharArray();
        for(int i=tamMatriz ; i>=0 ; i--){
            System.out.println(i + "|");

            if (i==0) {
                for(int j=0 ; j<tamMatriz ; j++){
                    System.out.print("  _");
                    for(int k=0 ; k<nombre.length() ; k++){
                        if (k==j && k==(2*i)) {
                            System.out.print(letras[k]+" ");
                        }
                    }
                }                  
            }
        }
    }*/

    public static void grafico() {
        String nombre = "brandon";
        int tamMatriz = nombre.length();
    
        for (int i = tamMatriz; i > 0; i--) {
            System.out.print(i + " | ");
    
            for (int j = 0; j < tamMatriz; j++) {
                if (i * 2 == (j + 1) * 2) {
                    System.out.print(nombre.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // Imprimir el eje x
        System.out.print("    ");
        for (int i = 2; i <= tamMatriz * 2; i += 2) {
            System.out.print(" _");
        }
    }
    
}
