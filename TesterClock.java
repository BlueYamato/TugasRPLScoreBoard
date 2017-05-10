/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesterModul;

import Model.Clock;
import java.util.Scanner;

/**
 *
 * @author Itsuka Kotori
 */
public class TesterClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread(new Clock());
        String s = sc.next();
        if(s.equals("start")){
            t.start();
        }
        String st = sc.next();
        if(st.equals("stop")){
            t.stop();
        }
    }
}
