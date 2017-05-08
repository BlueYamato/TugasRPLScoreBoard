/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Atlet {
    
    private String name;
    private int age;
    private int weight;
    private String nationality;
    private int snatchScore;
    private int cleanJerkScore;
    private int totalScore;
    private int numberAthlete;

    public Atlet(String name,int age,int weight,String nationality) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nationality = nationality;
        this.snatchScore = 0;
        this.cleanJerkScore = 0;
        this.totalScore = 0;
    }

    public int getAge() {
        return age;
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
    
    public void setTotalScore(int x){
        this.totalScore = x;
    }
    
    public int doSnatch(int score){
        if(score > this.snatchScore){
            this.snatchScore = score;
        }
        return this.snatchScore;
    }
    public int doCleanJerk(int score){
        if(score > this.cleanJerkScore){
           this.cleanJerkScore = score;
        }
        return this.cleanJerkScore;
    }
    public int getTotalScore(){
        this.totalScore = this.snatchScore + this.cleanJerkScore;
        return this.totalScore;
    }
    public void addNumberAthlete(int num){
        this.numberAthlete = num;
    }
    public int getAthleteNumber(){
        return this.numberAthlete;
    }
}
