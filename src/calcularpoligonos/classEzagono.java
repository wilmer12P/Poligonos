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
public class classEzagono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             ClassPoligonos poli=new ClassPoligonos();	
    poli.setLadoA(4);
    poli.setAltura(3.46);
    
    
    poli.CalcularExagono();
    
    System.out.println("total=  "+ poli.total);
    }
    
}
