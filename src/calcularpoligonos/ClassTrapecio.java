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
public class ClassTrapecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ClassPoligonos poli=new ClassPoligonos();	
    poli.setAltura(60);
    poli.setBase(50);
    poli.setBaseB(40);
    poli.CalcularTrapecio();
    
    System.out.println("total=  "+ poli.total);
    }
    
    
}
