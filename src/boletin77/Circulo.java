
package boletin77;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Circulo {
  
   static final float PI= 3.14f;
   float rad;
   
    public static float RecibirRadio(){       
       String res= JOptionPane.showInputDialog("Introduzca el radio del circulo: ");
       float rad = Float.parseFloat(res);
       return rad;
   }
    
    public static void calcularArea(float PI,float rad){
        float resultado= (float) Math.pow(rad,2);
    
        JOptionPane.showMessageDialog(null, "A area do circulo e:"+ PI*resultado);
    
    
    }
    
    
    
   
    
}
