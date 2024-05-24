package com.jmc.car_rental_system.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageCars implements Initializable {
    public TableColumn car_id_col;
    public TableColumn brand_col;
    public TableColumn model_col;
    public TableColumn year_col;
    public TableColumn plate_col;
    public TableColumn seat_col;
    public TableColumn price_col;
    public TextField brand;
    public TextField year;
    public TextField model;
    public TextField plate;
    public TextField seat;
    public TextField price;
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
