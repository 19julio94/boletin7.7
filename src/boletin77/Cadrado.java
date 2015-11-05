package boletin77;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Cadrado {
    
float lado;
  public static float introducelado(){
      float lado;
      String res= JOptionPane.showInputDialog("Introduce o lado:");
      lado=Float.parseFloat(res);
      return lado;
  
 }
    
    public static void calculaArea(float lado){
        
        JOptionPane.showMessageDialog(null, "A area do cadrado e"+(lado*lado));
    }
    
}
