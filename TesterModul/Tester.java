/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesterModul;

import Controller.AthleteController;
import Controller.CompetitionController;
import Controller.DecisionController;
import Model.Athlete;
import Model.Jury;
import Model.Referee;

/**
 *
 * @author Itsuka Kotori
 */
public class Tester {
    public static void main(String[] args) {
        Jury juri = new Jury(3);
        Referee ref = new Referee(5);
       
        
        
        juri.giveDec("green");
        juri.giveDec("red");
        juri.giveDec("red");
        ref.giveDec("red");
        ref.giveDec("red");
        ref.giveDec("red");
        ref.giveDec("green");
        ref.giveDec("green");
        Athlete atlet = new Athlete("xxXXxx", 20, 70, "Honduras", true,1);
        AthleteController ac = new AthleteController();
        ac.addAthlete(atlet);
        DecisionController dc = new DecisionController(juri,ref);
        dc.validateMatch();
        CompetitionController cc = new CompetitionController(ac,  ac.m77kg);
        int num = atlet.getNoUrut();
        cc.setWeight(50, 60, 70, "snatch");
        cc.setWeight(70, 80, 90, "cleanAndJerk");
        cc.match(0, dc);
        cc.match(0, dc);
        cc.match(0, dc);
        cc.match(0, dc);
        cc.match(0, dc);
        cc.match(0, dc);
        System.out.println(atlet.getTotalScore());
    }
}
