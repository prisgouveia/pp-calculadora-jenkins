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
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class RaizTest {
    
    Calculadora calc = new Calculadora();
    
    @Test
    public void testaRaizQuadrada() {
        assertTrue("Resultado válido", 2==calc.raizQuadrada(4));
        assertTrue("Resultado válido", 3==calc.raizQuadrada(9));
        assertTrue("Resutado válido", 0==calc.raizQuadrada(0));
    }

    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNegativos() {
        assertEquals("Impossivel calcular raiz de numeros negativos", 2, calc.raizQuadrada(-1));        
    }
    
    @Test(expected = CalculadoraException.class)
    public void testaRaizQuadradaNulos() {
        assertEquals("Impossivel calcular raiz de um valor nulo", 2, calc.raizQuadrada(null));
    }    
}
