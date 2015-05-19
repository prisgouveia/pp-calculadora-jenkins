package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Pris
 */
public class DivisaoTest {
    private Calculadora calc  = new Calculadora();
    
    @Test(expected = CalculadoraException.class)
    public void testaDivisaoPorZero(){
        assertFalse("divisão por zero",5==calc.dividir(5,0));
    }
    
    @Test
    public void testaDivisaoValoresPositivos(){
        assertTrue("divisão valores positivos", 2==calc.dividir(4,2));
        assertTrue("divisão valores positivos", 0==calc.dividir(0,2));
        assertTrue("divisão valores positivos", 2==calc.dividir(5,2));
        assertTrue("divisão valores positivos", 5 == calc.dividir(5,1));
    }
    
    @Test
    public void testaDivisaoValoresNegativos(){
        assertTrue("divisão valores negativos", -5==calc.dividir(5, -1));
        assertTrue("divisão valores negativos", -2==calc.dividir(4, -2));
    }
    
    
}
