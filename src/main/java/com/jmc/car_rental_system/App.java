package com.jmc.car_rental_system;

import com.jmc.car_rental_system.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage){
//        try{
//            Class.forName("org.sqlite.JDBC");
//        }
//        catch(ClassNotFoundException e){
//            System.out.println("Error in db forName in App");
//            e.printStackTrace();
//        }
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//
//        try{
//            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/icon2.png")));
//            stage.getIcons().add(icon);
//        } catch (Exception e){
//            System.out.println("Image not found!");
//        }
//
//        stage.setScene(scene);
//        stage.show();
        Model.getInstance().getViewFactory().showLoginWindow();
    }
    public static void main(String[] args){
        launch();
    }
}
