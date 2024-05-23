package com.jmc.car_rental_system.Views;

import com.jmc.car_rental_system.Controller.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.function.Predicate;

public class ViewFactory {
    //    Client view
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane rentCarView;


    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }


    public AnchorPane getDashboardView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(dashboardView)) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load client dashboard");
//                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public AnchorPane getRentCarView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(rentCarView)) {
            try {
                rentCarView = new FXMLLoader(getClass().getResource("/Fxml/Client/RentCar.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load client dashboard");
//                e.printStackTrace();
            }
        }
        return rentCarView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            System.out.println("Failed to load client.fxml");
//            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Car Rental System");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
