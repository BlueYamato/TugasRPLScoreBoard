/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TableController.Scoreboard;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ScoreboardGUIController implements Initializable {

    @FXML
    TableView<Scoreboard> scoreboard;
    
    ObservableList data;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data = FXCollections.observableArrayList();
        
        TableColumn kolomNama = new TableColumn("Nama");
        kolomNama.setMinWidth(100);
        kolomNama.setCellValueFactory(new PropertyValueFactory("nama"));
        
        TableColumn kolomKelas = new TableColumn("Kelas");
        kolomKelas.setMinWidth(100);
        kolomKelas.setCellValueFactory(new PropertyValueFactory("kelas"));
        
        TableColumn kolomWeight = new TableColumn("Berat");
        kolomWeight.setMinWidth(100);
        kolomWeight.setCellValueFactory(new PropertyValueFactory("berat"));
        
        TableColumn kolomSnatch1 = new TableColumn("Snatch 1");
        kolomSnatch1.setMinWidth(100);
        kolomSnatch1.setCellValueFactory(new PropertyValueFactory("snatch1"));
        
        TableColumn kolomSnatch2 = new TableColumn("Snatch 2");
        kolomSnatch2.setMinWidth(100);
        kolomSnatch2.setCellValueFactory(new PropertyValueFactory("snatch2"));
        
        TableColumn kolomSnatch3 = new TableColumn("Snatch 3");
        kolomSnatch3.setMinWidth(100);
        kolomSnatch3.setCellValueFactory(new PropertyValueFactory("snatch3"));
        
        TableColumn totalSnatch = new TableColumn("Total Snatch");
        totalSnatch.setMinWidth(100);
        totalSnatch.setCellValueFactory(new PropertyValueFactory("totalSnatch"));
        
        TableColumn kolomCaj1 = new TableColumn("Clean and Jerk 1");
        kolomCaj1.setMinWidth(100);
        kolomCaj1.setCellValueFactory(new PropertyValueFactory("caj1"));
        
        TableColumn kolomCaj2 = new TableColumn("Clean and Jerk 2");
        kolomCaj2.setMinWidth(100);
        kolomCaj2.setCellValueFactory(new PropertyValueFactory("caj2"));
        
        TableColumn kolomCaj3 = new TableColumn("Clean and Jerk 3");
        kolomCaj3.setMinWidth(100);
        kolomCaj3.setCellValueFactory(new PropertyValueFactory("caj3"));
        
        TableColumn totalCaj = new TableColumn("Total Clean and Jerk");
        totalCaj.setMinWidth(100);
        totalCaj.setCellValueFactory(new PropertyValueFactory("totalCaj"));
        
        TableColumn kolomTotalScore = new TableColumn("Total Score");
        kolomTotalScore.setMinWidth(100);
        kolomTotalScore.setCellValueFactory(new PropertyValueFactory("totalScore"));
        
        scoreboard.getColumns().addAll(kolomNama,kolomKelas,kolomWeight,kolomSnatch1,kolomSnatch2,kolomSnatch3,
                totalSnatch,kolomCaj1,kolomCaj2,kolomCaj3,totalCaj,kolomTotalScore);
        
        scoreboard.getColumns().get(0).setCellValueFactory(new PropertyValueFactory("nama"));
        scoreboard.getColumns().get(1).setCellValueFactory(new PropertyValueFactory("kelas"));
        scoreboard.getColumns().get(2).setCellValueFactory(new PropertyValueFactory("berat"));
        scoreboard.getColumns().get(3).setCellValueFactory(new PropertyValueFactory("snatch1"));
        scoreboard.getColumns().get(4).setCellValueFactory(new PropertyValueFactory("snatch2"));
        scoreboard.getColumns().get(5).setCellValueFactory(new PropertyValueFactory("snatch3"));
        scoreboard.getColumns().get(6).setCellValueFactory(new PropertyValueFactory("totalSnatch"));
        scoreboard.getColumns().get(7).setCellValueFactory(new PropertyValueFactory("caj1"));
        scoreboard.getColumns().get(8).setCellValueFactory(new PropertyValueFactory("caj2"));
        scoreboard.getColumns().get(9).setCellValueFactory(new PropertyValueFactory("caj3"));
        scoreboard.getColumns().get(10).setCellValueFactory(new PropertyValueFactory("totalCaj"));
        scoreboard.getColumns().get(11).setCellValueFactory(new PropertyValueFactory("totalScore"));
        
        
    }    
    
}
