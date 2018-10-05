/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random; 
/**
 *
 * @author LAB203_29
 */
public class DumpGame extends NumberGame{
    private int upperBound;
    private int secret;
    
    public DumpGame(int upperBound) {
        this.upperBound = upperBound;
        long seed = System.nanoTime( );
        Random rand = new Random( seed );
        this.secret = rand.nextInt(upperBound) + 1;
        System.out.println(secret);
        super.setMessage("The number is between 1 and " + Integer.toString(upperBound));
    }
    
    public boolean guess(int number) {
        if (number == secret) {
    		setMessage("Correct! The decimal value is "+secret);
    		return true;
    	}
    	else if (number < secret) {
    		setMessage("Small!!");
    	}
    	else  {
    		setMessage("It Large!!");
    	}
    	return false;
    }
    public int getUpperBound() {
        return upperBound;
    }
    public String toString(){
        return "...";
    }
   
}
