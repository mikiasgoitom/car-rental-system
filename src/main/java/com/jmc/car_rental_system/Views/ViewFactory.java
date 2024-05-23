package com.jmc.car_rental_system.Views;

import com.jmc.car_rental_system.Controller.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.function.Predicate;

public class ViewFactory {
    private AnchorPane dashboardView;

    public ViewFactory() {
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
    public void closeStage(Stage stage){
        stage.close();
    }
}
