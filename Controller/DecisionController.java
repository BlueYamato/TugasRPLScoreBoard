/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jury;
import Model.Referee;

/**
 *
 * @author Itsuka Kotori
 */
public class DecisionController {
    private boolean decision;
    private Jury jury;
    private Referee referee;
    
    public DecisionController(Jury jury, Referee referee){
        this.jury = jury;
        this.referee = referee;
    }
    public void validateMatch(){
        if(this.referee.getCompDecFromRefree()){
            if(this.jury.isJuryGiveDecision()){
                this.decision = true;
            }
            else{
                this.decision = false;
            }
        }
        else{
            this.decision = false;
        }
    }
    
    public boolean getDecision(){
        return decision;
    }
    
    private void setJuryDecision(int jury){
        this.jury.changeDecision(jury);
    }
    
    private void setRefereeDecision(int referee){
        this.referee.changeDecision(referee);
    }
    
    public void changeAttemp(String who, int index){
        if(who.equalsIgnoreCase("referee")){
            this.setRefereeDecision(index);
        }else{
            this.setJuryDecision(index);
        }
    }
}
