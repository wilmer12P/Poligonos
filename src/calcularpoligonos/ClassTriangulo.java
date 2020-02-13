/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularpoligonos;

/**
 *
 * @author redes1
 */
public class ClassTriangulo {
    
    public static void main(String[]args) {
        ClassPoligonos poli=new ClassPoligonos();	
    poli.setAltura(10);
    poli.setBase(10);
    poli.CalcularTriangulo();
    
    System.out.println("total=  "+ poli.total);
    }
    
}
