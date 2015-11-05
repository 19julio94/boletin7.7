

package boletin77;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Triangulo {
    float base,altura;
    
    public static float introduceBase(){
      float base;
      String res= JOptionPane.showInputDialog("Introduce a base:");
      base=Float.parseFloat(res);
      return base;
      
      
      
    
}

    public static float introduceAltura(){
      float altura;
      String res= JOptionPane.showInputDialog("Introduce a altura:");
      altura=Float.parseFloat(res);
      return altura; 
    }
    
    public static void calculaArea(float base,float altura){
        
        JOptionPane.showMessageDialog(null, "A area do triangulo e"+(base*altura/2));
        
    }
    
     
}