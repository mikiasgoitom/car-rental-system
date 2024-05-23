package com.jmc.car_rental_system.Controller.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RentCarController implements Initializable {
    public ComboBox gender;
    public ComboBox brand;
    public ComboBox year;
    public ComboBox model;
    public ComboBox car_id;
    public DatePicker from;
    public DatePicker to;
    public TableColumn car_id_col;
    public TableColumn brand_col;
    public TableColumn model_col;
    public TableColumn year_col;
    public TableColumn status_col;
    public Label total_price;
    public Button cancel_btn;
    public Button rent_btn;

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
