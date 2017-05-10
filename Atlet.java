/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class Atlet {
    
    private SimpleStringProperty nomorUrut;
    private SimpleStringProperty nama;
    private SimpleStringProperty age;
    private SimpleStringProperty nationality;
    private SimpleStringProperty kelas;
    private SimpleStringProperty beratBadan;
    private SimpleStringProperty gender;

    public Atlet(String nomorUrut, String nama, String age, String nationality,String kelas, String beratBadan, String gender) {
        this.nomorUrut = new SimpleStringProperty(nomorUrut);
        this.nama = new SimpleStringProperty(nama);
        this.age = new SimpleStringProperty(age);
        this.nationality = new SimpleStringProperty(nationality);
        this.kelas = new SimpleStringProperty(kelas);
        this.beratBadan = new SimpleStringProperty(beratBadan);
        this.gender = new SimpleStringProperty(gender);
    }
    

    public StringProperty getBeratBadan() {
        return beratBadan;
    }

    public StringProperty getKelas() {
        return kelas;
    }

    public StringProperty getNama() {
        return nama;
    }

    public StringProperty getAge() {
        return age;
    }

    public StringProperty getNomorUrut() {
        return nomorUrut;
    }

    public StringProperty getGender() {
        return gender;
    }

    public StringProperty getNationality() {
        return nationality;
    }
  
}
