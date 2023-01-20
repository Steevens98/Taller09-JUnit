/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author portatil
 */
public class MovieTest {
    
    public MovieTest() {
    }
    
    private final Movie movie = new Movie("Titanic",Movie.NEW_RELEASE);

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = movie;
        int expResult = Movie.NEW_RELEASE;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 0;
        Movie instance = movie;
        instance.setPriceCode(arg);
    }
    
}
