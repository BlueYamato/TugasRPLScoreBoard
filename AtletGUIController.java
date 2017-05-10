/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import TableController.Atlet;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class AtletGUIController implements Initializable {

    @FXML
    TableView<Atlet> atlet;

    ObservableList<Atlet> data;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data = FXCollections.observableArrayList();

        TableColumn kolomNomorUrut = new TableColumn("Nomor Urut");
        kolomNomorUrut.setMinWidth(100);
        kolomNomorUrut.setCellValueFactory(new PropertyValueFactory("nomorUrut"));

        TableColumn kolomNama = new TableColumn("Nama");
        kolomNama.setMinWidth(100);
        kolomNama.setCellValueFactory(new PropertyValueFactory("nama"));

        TableColumn kolomAge = new TableColumn("Age");
        kolomAge.setMinWidth(100);
        kolomAge.setCellValueFactory(new PropertyValueFactory("age"));

        TableColumn kolomNationality = new TableColumn("Nationality");
        kolomNationality.setMinWidth(100);
        kolomNationality.setCellValueFactory(new PropertyValueFactory("nationality"));

        TableColumn kolomKelas = new TableColumn("Kelas");
        kolomKelas.setMinWidth(100);
        kolomKelas.setCellValueFactory(new PropertyValueFactory("kelas"));

        TableColumn kolomBeratBadan = new TableColumn("Berat Badan");
        kolomBeratBadan.setMinWidth(100);
        kolomBeratBadan.setCellValueFactory(new PropertyValueFactory("beratBadan"));

        TableColumn kolomGender = new TableColumn("Gender");
        kolomGender.setMinWidth(100);
        kolomGender.setCellValueFactory(new PropertyValueFactory("gender"));

        atlet.getColumns().addAll(kolomNomorUrut, kolomNama, kolomAge, kolomNationality, kolomKelas,
                kolomBeratBadan, kolomGender);

        atlet.getColumns().get(0).setCellValueFactory(new PropertyValueFactory("nomorUrut"));
        atlet.getColumns().get(1).setCellValueFactory(new PropertyValueFactory("nama"));
        atlet.getColumns().get(2).setCellValueFactory(new PropertyValueFactory("age"));
        atlet.getColumns().get(3).setCellValueFactory(new PropertyValueFactory("nationality"));
        atlet.getColumns().get(4).setCellValueFactory(new PropertyValueFactory("kelas"));
        atlet.getColumns().get(5).setCellValueFactory(new PropertyValueFactory("beratBadan"));
        atlet.getColumns().get(6).setCellValueFactory(new PropertyValueFactory("gender"));

    }
    
    public void loadTableAtlet() throws SQLException, ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connect = DriverManager.getConnection("jdbc:sqlserver://EVELYN:1433;databaseName=RPL;integratedSecurity=true");
        PreparedStatement pr = null;
        ResultSet rs = null;
        String query = "select * from atlet";
        try {
            pr = connect.prepareStatement(query);
            rs = pr.executeQuery();

            while (rs.next()) {
                String nomorUrut = rs.getString("nomorUrut");
                String nama = rs.getString("nama");
                String age = rs.getString("age");
                String nationality = rs.getString("nationality");
                String kelas = rs.getString("kelas");
                String beratBadan = rs.getString("beratBadan");
                String gender = rs.getString("gender");
                data.add(new Atlet(nomorUrut,nama,age,nationality,kelas,beratBadan,gender));
            }
            this.atlet.setItems(data);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            pr.close();
            rs.close();
        }
    }
}
