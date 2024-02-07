public class Bucle {
    // propiedades
    private int nroTerminos;

    /**
     *Constructor  
     * @param nroTerminos
     */
    public Bucle(int nroTerminos) 
    {
        this.nroTerminos = nroTerminos;
    }
    public void cicloRepetitivo(){
        for (int i=0;i<this.nroTerminos;i++){ 
           System.out.println("Este es el termino: " +i);       
        }  
    }
}
