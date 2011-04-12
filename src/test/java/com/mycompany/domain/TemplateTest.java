/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roofimon
 */
public class TemplateTest {

    public TemplateTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void oneParameter() {
        Template template = new Template("Hello ${name}");
        template.set("Twin");
        assertEquals("Hello Twin", template.evaluate());
     }

}