import javax.swing.JOptionPane;

public class TryCatch {
    public static void main(String[] args) {
        try {
            //intentar hacer algo
        }catch(/* capturar la excepcion IOException ex */){
            /* y ejecutar alguna linea de codigo para continuar con el programa */
        }finally{
            /* esta linea se ejecutara siempre, si encuentra o no encuentra la excepcion */
            /* linea para imprimir un mensaje en un cuadro emergente */
            JOptionPane.showMessageDialog(null, "jejejeje");
        }

    }
}
