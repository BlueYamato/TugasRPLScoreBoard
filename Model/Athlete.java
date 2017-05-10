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
public class Athlete {

    private String name;
    private int age;
    private int weight;
    private boolean isMale;
    private String nationality;
    private int noUrut;
    private int snatchScore;
    private int cleanJerkScore;
    private int totalScore;
    private int numberAthlete;
    private boolean[] snatchAttempt;
    private boolean[] cjAttempt;

    public Athlete(String name, int age, int weight, String nationality, boolean isMale, int no) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nationality = nationality;
        this.snatchScore = 0;
        this.cleanJerkScore = 0;
        this.totalScore = 0;
        this.snatchAttempt = new boolean[3];
        this.cjAttempt = new boolean[3];
        this.isMale = isMale;
        this.noUrut = no;
    }

    public int getAge() {
        return age;
    }
    public int getNoUrut(){
        return this.noUrut;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getWeight() {
        return weight;
    }

    public int doSnatch(int score) {
        if (score > this.snatchScore) {
            this.snatchScore = score;
        }
        return this.snatchScore;
    }

    public int doCleanJerk(int score) {
        if (score > this.cleanJerkScore) {
            this.cleanJerkScore = score;
        }
        return this.cleanJerkScore;
    }

    public int getTotalScore() {
        this.totalScore = this.snatchScore + this.cleanJerkScore;
        return this.totalScore;
    }

    public void addNumberAthlete(int num) {
        this.numberAthlete = num;
    }

    public int getAthleteNumber() {
        return this.numberAthlete;
    }

    public void setTotalScore(int x) {
        this.totalScore = x;
    }
    public boolean[] getSnatchAttempt(){
        return this.snatchAttempt;
    }
    public boolean[] getCJAttempt(){
        return this.cjAttempt;
    }
    public void setSnatchAttempt(int i, boolean b){
        this.snatchAttempt[i] = b;
    }
    public void setCJAttempt(int i, boolean b){
        this.cjAttempt[i] = b;
    }
    public boolean getGender(){
        return this.isMale;
    }
}
