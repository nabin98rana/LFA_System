/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.view;

import java.util.Scanner;

/**
 *
 * @author Navin
 */
public class ExitView extends AbstractView {

    @Override
    public void controller() {
        showExitScreen();
    }

    private void showExitScreen() {
        System.out.println("Do you really want to exit ?[Y/N]");
        if (input.next().equalsIgnoreCase("y")) {
            System.exit(0);
        }
    }

}
