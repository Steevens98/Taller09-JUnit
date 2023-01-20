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
public class MovieRentalTest {
    
    public MovieRentalTest() {
    }
    
    static MovieRental movieRental;
    static Movie  theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    
    @BeforeAll
    public static void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
        movieRental = new MovieRental(new Movie("Titanic",Movie.NEW_RELEASE),10);
    }
    
    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
    

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        MovieRental instance = movieRental;
        int expResult = 10;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        MovieRental instance = movieRental;
        Movie expResult = movieRental.getMovie();;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
    }
    
}
