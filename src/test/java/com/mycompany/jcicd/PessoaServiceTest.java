/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jcicd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author enzo.lima
 */
public class PessoaServiceTest {
    
    private PessoaService pessoaServive;
    
    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }


    /**
     * Test of getPessoaModelByNome method, of class PessoaService.
     */
    @org.junit.jupiter.api.Test
    public void testGetPessoaModelByNome() {
        System.out.println("getPessoaModelByNome");
        
        String nome = "Lori";
        
        PessoaService instance = new PessoaService();
        instance.addPessoa(PessoaModel.builder().nome(nome).build());
        
        PessoaModel expResult = null;
        
        PessoaModel result = instance.getPessoaModelByNome(nome);
        
        assertEquals(expResult.getNome(), result.getNome());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
