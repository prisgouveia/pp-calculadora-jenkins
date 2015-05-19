/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author job
 */
public class SomaTest {
    private Calculadora calculadora=new Calculadora();
    
    public SomaTest() {
    }
    
    @Test
    public void testaSomaValoresPositivos(){
        assertEquals("deu certo", 5,calculadora.somar(3,2));
        assertEquals("deu certo", 5,calculadora.somar(2,3));
        assertTrue("deu certo", 5==calculadora.somar(2,3));
        assertFalse("deu certo", 4==calculadora.somar(3, 2));
        
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
    } 
    @Test
    public void testaSomaValoresNegativos(){
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
        assertEquals("deu certo", -5,calculadora.somar(-2,-3));
        assertTrue("deu certo", 1==calculadora.somar(-2,3));
        assertFalse("deu certo", 4==calculadora.somar(-3, -2));
        
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
    } 
    
    @Test(expected = CalculadoraException.class)
    public void testaSomaValoresNulos(){
//        assertEquals("deu certo", 0,calculadora.somar(null,3));
//        assertEquals("deu certo", -5,calculadora.somar(-2,null));
        assertEquals("deu certo", 1,calculadora.somar(3,-2));
      
        assertTrue("deu certo", 1==calculadora.somar(null,null));

}
}