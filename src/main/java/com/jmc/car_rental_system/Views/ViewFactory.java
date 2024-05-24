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
    private final StringProperty adminSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane rentCarView;
    private AnchorPane clientProfileView;
    // Admin view
    private AnchorPane addUsersView;
    private AnchorPane adminDashboardView;
    private AnchorPane manageCarsView;
    private AnchorPane showCustomerView;
    private AnchorPane adminProfileView;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("");
        this.adminSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }
    public StringProperty getAdminSelectedMenuItem() {
        return adminSelectedMenuItem;
    }

    /*
     * Client view options
     * */
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

    public AnchorPane getClientProfileView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(clientProfileView)) {
            try {
                clientProfileView = new FXMLLoader(getClass().getResource("/Fxml/Client/ClientProfile.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load client profile");
//                e.printStackTrace();
            }
        }
        return clientProfileView;
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    /*
     * Admin view options
     * */
    public AnchorPane getAdminDashboardView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(adminDashboardView)) {
            try {
                adminDashboardView = new FXMLLoader(getClass().getResource("/Fxml/Admin/AdminDashboard.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load admin dashboard");
//                e.printStackTrace();
            }
        }
        return adminDashboardView;
    }

    public AnchorPane getAddUsersView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(addUsersView)) {
            try {
                addUsersView = new FXMLLoader(getClass().getResource("/Fxml/Admin/AddUsers.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load admin add user");
//                e.printStackTrace();
            }
        }
        return addUsersView;
    }

    public AnchorPane getManageCarsView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(manageCarsView)) {
            try {
                manageCarsView = new FXMLLoader(getClass().getResource("/Fxml/Admin/ManageCars.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load admin manage car");
//                e.printStackTrace();
            }
        }
        return manageCarsView;
    }

    public AnchorPane getShowCustomerView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(showCustomerView)) {
            try {
                addUsersView = new FXMLLoader(getClass().getResource("/Fxml/Admin/ShowCustomer.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load admin customer list");
//                e.printStackTrace();
            }
        }
        return showCustomerView;
    }

    public AnchorPane getAdminProfileView() {
        Predicate<AnchorPane> condition1 = pane -> (pane == null);
        if (condition1.test(adminProfileView)) {
            try {
                adminProfileView = new FXMLLoader(getClass().getResource("/Fxml/Admin/AdminProfile.fxml")).load();
            } catch (Exception e) {
                System.out.println("Failed to load admin profile");
//                e.printStackTrace();
            }
        }
        return adminProfileView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
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
