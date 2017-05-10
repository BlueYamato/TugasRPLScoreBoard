package TableController;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Scoreboard {
    
    private SimpleStringProperty nama;
    private SimpleStringProperty kelas;
    private SimpleStringProperty berat;
    private SimpleStringProperty snatch1;
    private SimpleStringProperty snatch2;
    private SimpleStringProperty snatch3;
    private SimpleStringProperty totalSnatch;
    private SimpleStringProperty caj1;
    private SimpleStringProperty caj2;
    private SimpleStringProperty caj3;
    private SimpleStringProperty totalCaj;
    private SimpleStringProperty totalScore;

    public Scoreboard(String nama, String kelas, String berat, String snatch1, String snatch2, String snatch3, String totalSnatch, String caj1, String caj2, String caj3, String totalCaj, String totalScore) {
        this.nama = new SimpleStringProperty(nama);
        this.kelas = new SimpleStringProperty(kelas);
        this.berat = new SimpleStringProperty(berat);
        this.snatch1 = new SimpleStringProperty(snatch1);
        this.snatch2 = new SimpleStringProperty(snatch2);
        this.snatch3 = new SimpleStringProperty(snatch3);
        this.totalSnatch = new SimpleStringProperty(totalSnatch);
        this.caj1 = new SimpleStringProperty(caj1);
        this.caj2 = new SimpleStringProperty(caj2);
        this.caj3 = new SimpleStringProperty(caj3);
        this.totalCaj = new SimpleStringProperty(totalCaj);
        this.totalScore = new SimpleStringProperty(totalScore);
    }

    public StringProperty getNama() {
        return this.nama;
    }

    public StringProperty getKelas() {
        return kelas;
    }

    public StringProperty getBerat() {
        return berat;
    }
    
    public StringProperty getSnatch1() {
        return snatch1;
    }

    public StringProperty getSnatch2() {
        return snatch2;
    }

    public StringProperty getSnatch3() {
        return snatch3;
    }

    public StringProperty getTotalSnatch() {
        return totalSnatch;
    }

    public StringProperty getCaj1() {
        return caj1;
    }

    public StringProperty getCaj2() {
        return caj2;
    }

    public StringProperty getCaj3() {
        return caj3;
    }

    public StringProperty getTotalCaj() {
        return totalCaj;
    }

    public StringProperty getTotalScore() {
        return totalScore;
    }
    
    
    
}
