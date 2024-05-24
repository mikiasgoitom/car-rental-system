package com.jmc.car_rental_system.Controller.Admin;

import com.jmc.car_rental_system.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button dashboard_btn;
    public Button manage_cars_btn;
    public Button add_users_btn;
    public Button profile_btn;
    public Button logout_btn;

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListen();
    }
    public void addListen() {
        dashboard_btn.setOnAction(event -> onDashboard());
        manage_cars_btn.setOnAction(event -> onManageCars());
        add_users_btn.setOnAction(event -> onAddUsers());
        profile_btn.setOnAction(event -> onAdminProfile());
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onManageCars() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("ManageCars");
    }

    private void onAdminProfile() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("AdminProfile");
    }
    private void onAddUsers() {
        Model.getInstance().getViewFactory().getAddUsersView();
    }
}
