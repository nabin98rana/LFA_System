/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.view;

import com.navin.lfas.entity.Course;
import com.navin.lfas.service.CourseService;
import com.navin.lfas.service.impl.CourseServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Navin
 */
public class CourseView extends AbstractView {

    CourseService courseService = new CourseServiceImpl();

    public void menu() {
        System.out.println("***************");
        System.out.println("1. ADD COURSE");
        System.out.println("2. SHOW COURSES");
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
            Course c = new Course();
            System.out.println("ENTER ID:");
            c.setId(input.nextInt());
            System.out.println("ENTER NAME:");
            c.setName(input.next());
            System.out.println("ENTER SUBJECT:");
            c.setSubject(input.next());
            System.out.println("ENTER MESSAGE:");
            c.setMessage(input.next());
            System.out.println("ENTER DESCREPTION:");
            c.setDescription(input.next());
            System.out.println("ENTER FEE:");
            c.setTotal(input.nextDouble());
            System.out.println("ENTER STATUS:");
            c.setStatus(input.nextBoolean());

            courseService.insert(c);
            System.out.println("DO YOU WANT TO ADD MORE? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void showAll() {
        courseService.getAll().forEach(c -> {
            System.out.println(c.toString());
        });

    }
}
