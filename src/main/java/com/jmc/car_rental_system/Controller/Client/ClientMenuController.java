package com.jmc.car_rental_system.Controller.Client;

import com.jmc.car_rental_system.Models.Model;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button rent_car_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListen();
    }

    public void addListen() {
        dashboard_btn.setOnAction(event -> onDashboard());
        rent_car_btn.setOnAction(event -> onRentCar());
        profile_btn.setOnAction(event -> onClientProfile());
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onRentCar() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("RentCar");
    }

    private void onClientProfile() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("ClientProfile");
    }
}
