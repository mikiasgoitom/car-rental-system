package com.jmc.car_rental_system.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {
    public Label total_cars;
    public Label total_users;
    public Label total_customers;
    public Label revenue;
    public Label rented_cars;
    public TableColumn car_id_col;
    public TableColumn brand_col;
    public TableColumn price_col;
    public TableColumn status_col;
    public TableColumn year_col;
    public TableColumn model_col;

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
