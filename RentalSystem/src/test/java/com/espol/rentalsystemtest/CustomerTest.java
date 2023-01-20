/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
public class CustomerTest {
    
    public CustomerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
     
    private final MovieRental movieRental = new MovieRental(new Movie("Titanic",Movie.NEW_RELEASE),10);
    private final Customer customer = new Customer("Mario");
    private final VideoGameRental videogameRental = new VideoGameRental(new Ps3Game("God Of War"),3,false);
    /**
     * Test of addMovieRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = movieRental;
        Customer instance = customer;
        instance.addMovieRental(arg);
    }

    
    
    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = videogameRental;
        Customer instance = customer;
        instance.addVideoGameRental(arg);    
    }

    /**
     * Test of statement method, of class Customer.
     */
    @org.junit.jupiter.api.Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = customer;
        String expResult;
        expResult = "Rental Record for Mario\n" +
                "	Titanic	30.0\n" +
                "	God Of War	4.0\n" +
                "Amount owed is 34.0\n" +
                "You earned 4 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
