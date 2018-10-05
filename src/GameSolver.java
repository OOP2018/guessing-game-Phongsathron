/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phongsathron
 */
public class GameSolver {
//    public int play(NumberGame game){
//        int i = 1;
//        for(; i <= game.getUpperBound(); i++){
//            if(game.guess(i)){
//                break;
//            }
//        }
//        
//        return i;
//    }
    
    public int play(NumberGame game){
        int max = game.getUpperBound();
        int min = 1;
        while(true){
            int guess_num = min + (max - min)/2;
            boolean result = game.guess(guess_num);
            System.out.println("Answer: "+guess_num+"\n"+game.getMessage());
            if(!result){
                if(game.getMessage().equals("too large")){
                    max = guess_num;
                }
                else if(game.getMessage().equals("too small")){
                    min = guess_num;
                }
            }
            else{
                return guess_num;
            }
        }
    }
}
