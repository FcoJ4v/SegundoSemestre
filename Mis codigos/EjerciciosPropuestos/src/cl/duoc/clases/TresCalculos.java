
package cl.duoc.clases;

public class TresCalculos {
    private int num1,num2,calculo;

    public TresCalculos() {
    }

    public TresCalculos(int num1, int num2, int calculo) {
        this.num1 = num1;
        this.num2 = num2;
        this.calculo = calculo;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getCalculo() {
        return calculo;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setCalculo(int calculo) {
        this.calculo = calculo;
    }
    
    
    //metodo calculo suma
    
    public int CalculoSuma(){
        calculo = num1 + num2;
        return calculo;
    }
    
    public int CalculoResta(){
        calculo = num1 - num2;
        return calculo;
    }
    
    public int CalculoMult(){
        calculo = num1 * num2;
        return calculo;
    }
    
    public int CalculoDiv(){
        calculo = num1 / num2;
        return calculo;
    }
}
