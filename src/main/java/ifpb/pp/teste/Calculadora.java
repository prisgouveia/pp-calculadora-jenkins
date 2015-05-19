/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.teste;

/**
 * @author job
 */
public class Calculadora {

    public int somar(Integer a, Integer b) {

        if (a == null || b == null) {
            throw new CalculadoraException("Nao e possivel somar com valores nulos");
        }
        return a + b;
    }
    

    public double dividir(Integer a, Integer b){
        if(a==null || b==null){
            throw new CalculadoraException("Não é possivel dividir com valores nulos");
        }
        else if(b==0){
            throw new CalculadoraException("Não é possivel dividir um valor por 0");
        }
        
        return a/b;
    }

    public int multiplicar(Integer a,Integer b){
        
        if(a==null || b==null)

        if (a == null || b == null) {
            throw new CalculadoraException("Nao e possivel multiplicar com valores nulos");
        }
        return a * b;
    }

    public double raizQuadrada(Integer value) {
        if (value < 0) {
            throw new CalculadoraException("Não é possivel efetuar raiz quadrada de número negativo");
        }
        return Math.sqrt(value);
    }

    public int subtrair(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new CalculadoraException("Não é possivel subtrair com valores nulos");
        }
        return a - b;
    }
}

