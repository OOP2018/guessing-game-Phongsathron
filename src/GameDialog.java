import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phongsathron
 */
public class GameDialog {
    public int play(NumberGame game){
        String title = "Guessing Game";
        String description = game.toString();
        int guessNum, type;
        
        while(true){
            type = JOptionPane.QUESTION_MESSAGE;
            String userInput = JOptionPane.showInputDialog(null, description, title, type);
            guessNum = Integer.parseInt(userInput);
            
            if(!game.guess(guessNum)){
                type = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showConfirmDialog(null, game.getMessage() + "\nPlay again!", title, type);
            }
            else{
                break;
            }
        }
        
        description = "Right! The secret number is "+guessNum+"\n";
        description += "You played "+game.getCount()+" times.";
        
        type = JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(null, description, title, type);
        
        type = JOptionPane.YES_NO_OPTION;
        int again = JOptionPane.showConfirmDialog(null, "Play again!", title, type);
        if(again == JOptionPane.YES_OPTION){
            this.play(game);
        }
        
        return guessNum;
    }
}
