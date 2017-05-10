/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Clock implements Runnable{
    private long time = 0;
    private boolean timer;

    @Override
    public void run() {
        //START STOPNYA BARU LEWAT TESTER
        //THREAD.START()
        //THREAD.STOP()
        while(true){
            System.out.println(time);
            time ++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void clearTime(){
        time = 0;
    }
    public long getTime(){
        return this.time;
    }
}
