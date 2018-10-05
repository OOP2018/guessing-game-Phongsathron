import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Game of guessing a secret number.
 * @author phongsathron
 */
public class PhongsathronGame extends NumberGame {
    private final int upperBound;
    private final int secret;
    private int count = 0;
    
    public PhongsathronGame(int upperBound){
        this.upperBound = upperBound;
        super.setMessage("I'm thinking of a number between 1 and " + this.upperBound);
        
        long seed = System.nanoTime(); 
        Random rand = new Random(seed);
        this.secret = rand.nextInt(this.upperBound) + 1;
    }
    
    @Override
    public boolean guess(int number){
        this.count++;
        if(number > this.secret){
            super.setMessage("too large");
            return false;
        }
        else if(number < this.secret){
            super.setMessage("too small");
            return false;
        }
        else{
            return true;
        }
    }
    
    @Override
    public int getUpperBound(){
        return upperBound;
    }
    
    @Override
    public String toString(){
        return "Guess a secret number.";
    }
    
    /**
     * Get count of user played game
     * @return
     */
    @Override
    public int getCount(){
        return this.count;
    }
}
