/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Athlete;
import Model.Clock;
import Model.Jury;
import Model.Referee;

/**
 *
 * @author Itsuka Kotori
 */
public class CompetitionController {

    private Athlete[] athlete;
    private String tournamentClass;
    private int[] snatch;
    private int[] cleanAndJerk;
    private int altetKeBerapa;
    private Thread t;
    //private Clock clock;
    private AthleteController ac;
    private DecisionController dc;
    private Referee ref;
    private Jury jury;

    public CompetitionController(String tournamentClass, int jumlahAtlet, Referee ref, Jury jury) {
        this.athlete = new Athlete[jumlahAtlet];
        this.tournamentClass = tournamentClass;
        this.snatch = new int[3];
        this.cleanAndJerk = new int[3];
        this.t = new Thread(new Clock());
        this.ac = new AthleteController();
        this.ref = ref;
        this.jury = jury;
        this.dc = new DecisionController(this.jury, this.ref);
        // clock,atlet control, desicion control inisialisasi di sini
    }

    public void setWeight(int w1, int w2, int w3, String methode,int atletKeBerapa) {
        startTime();
        if (methode.equalsIgnoreCase("cleanAndJerk")) {
            this.cleanAndJerk[0] = w1;
            this.cleanAndJerk[1] = w2;
            this.cleanAndJerk[2] = w3;
        } else {
            this.snatch[0] = w1;
            this.snatch[1] = w2;
            this.snatch[2] = w3;
        }
        stopTime();
        calculatePoint(atletKeBerapa);
    }
    private void startTime(){
        t.start();
    }
    private void stopTime(){
        t.stop();
    }
    private void calculatePoint(int atletKeBerapa){
//        int score = 0;
//        //perhitungan score di sini
//        this.athlete[atletKeBerapa].plusScore(score);
    }
    public void match(int num){
        boolean[] snatchAttempt = athlete[num].getSnatchAttempt();
       boolean[] cjAttempt = athlete[num].getCJAttempt();
        int i = 0;
        while(snatchAttempt[i] == true){
            i++;
        }
        if (i == 3){
            int j = 0;
            while(cjAttempt[j] == true){
                j ++;
            }
            if(j < 3){
                //Kyknya perlu dikontrol di interfacenya
                this.startTime();
                int cjWeight = cleanAndJerk[j];
                this.stopTime();
                if(dc.getDecision()){
                    athlete[num].doCleanJerk(cjWeight);
                }
            }
        }
        else{
            //Kyknya perlu dikontrol di interfacenya
            this.startTime();
            int snatchWeight = snatch[i];
            this.stopTime();
            if(dc.getDecision()){
                athlete[num].doSnatch(snatchWeight);
            }
        }
    }
    private void sortAtlet() {
        int scorelength = athlete.length;
        quicksort(0, scorelength - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = athlete[low + (high - low) / 2].getTotalScore();
        while (i <= j) {
            while (athlete[i].getTotalScore() < pivot) {
                i++;
            }
            while (athlete[j].getTotalScore() > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = athlete[i].getTotalScore();
        athlete[i].setTotalScore(athlete[j].getTotalScore());
        athlete[j].setTotalScore(temp);
    }
    public void getTop5(){
        String[] hasil = new String[5];
        for(int i = 0; i<5 ;i++){
           hasil[i] = athlete[i].getName();
        }
        for(int i = 0;i<5;i++){
            System.out.println(hasil[i]);
        }
    }
    
    public void getTop3(){
        String[] hasil = new String[3];
        for(int i = 0; i<3 ;i++){
           hasil[i] = athlete[i].getName();
        }
        for(int i = 0;i<3;i++){
            System.out.println(hasil[i]);
        }
    }
    public Athlete[] giveAtletOrder(){
        return this.athlete;
    }
}
