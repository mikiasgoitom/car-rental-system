module com.jmc.car_rental_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires org.kordamp.ikonli.fontawesome5;
    requires de.jensd.fx.glyphs.fontawesome;

    opens com.jmc.car_rental_system to javafx.fxml;
    exports com.jmc.car_rental_system;
    exports com.jmc.car_rental_system.Controller;
    exports com.jmc.car_rental_system.Controller.Admin;
    exports com.jmc.car_rental_system.Controller.Client;
    exports com.jmc.car_rental_system.Models;
    exports com.jmc.car_rental_system.Views;
//    opens com.jmc.car_rental_system.Controller to javafx.fxml;
}