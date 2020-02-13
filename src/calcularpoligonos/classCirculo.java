/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularpoligonos;

/**
 *
 * @author foxte
 */
public class classCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ClassPoligonos poli=new ClassPoligonos();	
    
    poli.setRadio(70);
    poli.CalcularCirculo();
    
    System.out.println("total=  "+ poli.total);
    }
    
    
}
