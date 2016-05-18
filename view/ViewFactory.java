/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.view;

import java.util.HashMap;

/**
 *
 * @author Navin
 */
public class ViewFactory {

    private static HashMap<String, AbstractView> views = initViews();

    private static HashMap<String, AbstractView> initViews() {
        HashMap<String, AbstractView> allViews = new HashMap<>();
        allViews.put("1", new CourseView());
        allViews.put("2", new FacilitatorView());
        allViews.put("3", new StudentView());
        allViews.put("4", new ExitView());
        return allViews;
    }

    public static AbstractView get(String key) {
        if (isKey(key)) {
            return views.get(key);
        }
        return null;
    }

    public static boolean isKey(String key) {
        return views.containsKey(key);
    }
}
