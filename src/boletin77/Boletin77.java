

package boletin77;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin77 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Elige una de estas opciones: \n 1-Cadrado \n 2-Triangulo \n 3-Circulo ");
        String res= JOptionPane.showInputDialog("Introduzca la opcion elegida en numero: ");
        int num= Integer.parseInt(res);
               
        
        
    switch(num){
    case 1:
        float lado=Cadrado.introducelado();
        Cadrado.calculaArea(lado);
        
        break;
        
    
    case 2:
       
        float base=Triangulo.introduceBase();
        float altura= Triangulo.introduceAltura();
        Triangulo.calculaArea(base, altura);
            
        break;
        
    case 3:
        float rad=Circulo.RecibirRadio();
        Circulo.calcularArea(rad, rad);
        
        
            
     
        
        
        
        
        }
    
  
        
                
}
          
                
                
        
    
            
    
}
