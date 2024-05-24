package com.jmc.car_rental_system.Controller.Admin;

import com.jmc.car_rental_system.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminContrller implements Initializable {
    public BorderPane admin_parent;
    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "ManageCars" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getManageCarsView());
                case "AddUsers" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAddUsersView());
                case "ShowCustomer" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getShowCustomerView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminDashboardView());
            }
        });
    }
}
