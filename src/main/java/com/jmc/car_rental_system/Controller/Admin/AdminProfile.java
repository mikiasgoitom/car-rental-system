package com.jmc.car_rental_system.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminProfile implements Initializable {
    public TextField full_name;
    public TextField email;
    public TextField phone_number;
    public TextField address;
    public ComboBox gender;
    public PasswordField pwd;
    public ComboBox role;
    public Button cancel_btn;
    public Button save_btn;

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
