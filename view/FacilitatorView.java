/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.view;

import com.navin.lfas.entity.Facilitator;
import com.navin.lfas.service.FacilitatorService;
import com.navin.lfas.service.impl.FacilitatorServiceImpl;

/**
 *
 * @author Navin
 */
public class FacilitatorView extends AbstractView {

    FacilitatorService facilitatorService = new FacilitatorServiceImpl();

    public void menu() {
        System.out.println("*********************");
        System.out.println("1. ADD FACILITATOR");
        System.out.println("2. SHOW FACILITATOR");
        System.out.println("3. BACK");

        System.out.println("ENTER YOUR CHOICE [1-3]:");
    }

    @Override
    public void controller() {
        while (true) {
            boolean back = false;
            menu();
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    back = true;
                    break;

            }
            if (back) {
                break;
            }
        }
    }

    private void add() {

        while (true) {
            Facilitator f = new Facilitator();
            System.out.println("ENTER ID:");
            f.setId(input.nextInt());
            System.out.println("ENTER FIRST NAME:");
            f.setFirstName(input.next());
            System.out.println("ENTER LAST NAME:");
            f.setLastName(input.next());
            System.out.println("ENTER EMAIL:");
            f.setEmail(input.next());
            System.out.println("ENTER CONTACT NUMBER:");
            f.setContactNo(input.next());
            System.out.println("ENTER STATUS:");
            f.setStatus(input.nextBoolean());

            facilitatorService.insert(f);
            System.out.println("DO YOUR WANT TO ADD MORE? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void showAll() {
        facilitatorService.getAll().forEach(f -> {
            System.out.println(f.toString());
        });

    }
}
