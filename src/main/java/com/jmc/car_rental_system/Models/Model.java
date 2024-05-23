package com.jmc.car_rental_system.Models;

import com.jmc.car_rental_system.Views.ViewFactory;

import java.util.function.Predicate;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    public Model() {
        this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance() {
        Predicate<Model> condition1 = m -> (m == null);
        if (condition1.test(model)) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
