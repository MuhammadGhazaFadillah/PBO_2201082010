/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Ghaza.view;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author muham
 */
public class FormAnggotaTest {
    
    public FormAnggotaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTxtKodeAnggota method, of class Form.
     */
    @Test
    public void testGetTxtKodeAnggota() {
        System.out.println("getTxtKodeAnggota");
        Form instance = new Form();
        JTextField expResult = null;
        JTextField result = instance.getTxtKodeAnggota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtNamaAnggota method, of class Form.
     */
    @Test
    public void testGetTxtNamaAnggota() {
        System.out.println("getTxtNamaAnggota");
        Form instance = new Form();
        JTextField expResult = null;
        JTextField result = instance.getTxtNamaAnggota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTxtAlamat method, of class Form.
     */
    @Test
    public void testGetTxtAlamat() {
        System.out.println("getTxtAlamat");
        Form instance = new Form();
        JTextField expResult = null;
        JTextField result = instance.getTxtAlamat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCboJenisKelamin method, of class Form.
     */
    @Test
    public void testGetCboJenisKelamin() {
        System.out.println("getCboJenisKelamin");
        Form instance = new Form();
        JComboBox expResult = null;
        JComboBox result = instance.getCboJenisKelamin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableAnggota method, of class Form.
     */
    @Test
    public void testGetTableAnggota() {
        System.out.println("getTableAnggota");
        Form instance = new Form();
        JTable expResult = null;
        JTable result = instance.getTableAnggota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Form.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Form.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
