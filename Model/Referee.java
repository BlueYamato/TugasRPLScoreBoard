/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Itsuka Kotori
 */
public class Referee implements Keypad{
    private Boolean[] refree;
    private int refreeCount;
    private static int counter;

    public Referee(int count) {
        this.refreeCount = count;
        refree = new Boolean[count];
        counter = 0;
    }
    
     public void giveDec(String button) {
        if (counter != refreeCount) {
            if (button.equalsIgnoreCase("green")) {
                refree[counter] = greenButton;
                counter++;
            } else {
                refree[counter] = redButton;
                counter++;
            }
        }
        else{
            System.out.println("all already give decision");
        }
    }
    
    public void giveDecision(int index, String tombol){
        if(tombol.equalsIgnoreCase("green"))
        refree[index] = greenButton;
        else
        refree[index] = redButton;
    }
    
    public void changeDecision(int index){
        if(refree[index]==false){
            refree[index]= true;
        }
        else{
            refree[index]=false;
        }
    }
    
    private Boolean isRefreeGiveDecision(){
        Boolean hasil = true;
        for (int i = 0; i < refree.length; i++) {
            if (refree[i] == null) {
                return false;
            }
        }
        return hasil;
    }
    
    public Boolean getCompDecFromRefree(){
        if(isRefreeGiveDecision()){
            int count = 0;
            for(int i = 0;i<refree.length;i++){
                if(refree[i]==true){
                    count++;
                }
            }
            double countInDouble = refreeCount*1.0;
            double checkInDouble = count*1.0;
            if(checkInDouble>(countInDouble/2))
                return true;
            else
                return false;
        }
        else{
            return false;
        }
    }
}