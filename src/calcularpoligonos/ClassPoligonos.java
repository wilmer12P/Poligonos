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
public class ClassPoligonos {
    double altura;
    int base;
    int baseB;
    double total;
    double ladoA;
    double ladoB;
    double radio;

    public ClassPoligonos() {
    }

    public ClassPoligonos(double altura, int base, int baseB, double total, double ladoA, double ladoB, double radio) {
        this.altura = altura;
        this.base = base;
        this.baseB = baseB;
        this.total = total;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

  

       

    public void CalcularTriangulo(){
        this.total=(this.altura*this.base)/2;
    }

    public void CalcularCuadrado(){
        this.total=(this.ladoA*this.ladoB);
    }
    
    public void CalcularCirculo(){
        this.total=(3.14*(this.radio*this.radio));
    }
    
    public void CalcularTrapecio(){
        this.total=(this.altura*(this.base+this.baseB)/2);
    }
    
    public void CalcularExagono(){
        this.total=((6*this.ladoA)*(this.altura)/2);
    }
}

