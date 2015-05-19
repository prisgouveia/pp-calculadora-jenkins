/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import ifpb.pp.teste.Calculadora;
import ifpb.pp.teste.CalculadoraException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author DouglasGabriel
 */
public class SubtracaoTest {

    private Calculadora calc = new Calculadora();
    
    @Test
    public void testarSubtracaoNumPositivos (){
        assertEquals("1 - 2", -1, calc.subtrair(1,2));
        assertEquals("20 - 10", 10, calc.subtrair(20,10));
        assertFalse("4 - 2", 5==calc.subtrair(4, 2));
    }
    
    @Test
    public void testarSubtracaoNumNegativos (){
        assertEquals("2 - (-1)", 3, calc.subtrair(2, -1));
        assertEquals("-2 - 3", -5 ,calc.subtrair(-2, 3));
    }
    
    @Test(expected = CalculadoraException.class)
    public void testarSubtracaoValoresNulos(){
        assertEquals("10 - null",calc.subtrair(10, null));
        assertEquals("null - null", calc.subtrair(null, null));
    }
    
}
