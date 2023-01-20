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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }
    
    static VideoGameRental videoGameRental;
    @BeforeAll
    public static void setUp() {
        videoGameRental = new VideoGameRental(new Ps3Game("God Of War"),3,false);
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = videoGameRental;
        int expResult = 3;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = videoGameRental;
        Object expResult = videoGameRental.getVideoGame();
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = videoGameRental;
        double expResult = 4;
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = videoGameRental;
        int expResult = 2;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
