/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.view;

import com.navin.lfas.entity.Student;
import com.navin.lfas.service.StudentService;
import com.navin.lfas.service.impl.StudentServiceImpl;

/**
 *
 * @author Navin
 */
public class StudentView extends AbstractView {

    StudentService studentService = new StudentServiceImpl();

    public void menu() {
        System.out.println("*****************");
        System.out.println("1. ADD STUDENT");
        System.out.println("2. SHOW STUENTS");
        System.out.println("3. BACK");

        System.out.println("ENTER YOUR CHOICE [1-3]:");
    }

    @Override
    public void controller() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                showAll();
                break;
            case 3:
                break;

        }
    }

    private void add() {

        while (true) {
            Student s = new Student();
            System.out.println("ENTER ID:");
            s.setId(input.nextInt());
            System.out.println("ENTER FIRST NAME:");
            s.setFirstName(input.next());
            System.out.println("ENTER LAST NAME:");
            s.setLastName(input.next());
            System.out.println("ENTER EMAIL:");
            s.setEmail(input.next());
            System.out.println("ENTER CONTACT NUMBER:");
            s.setContactNo(input.next());
            System.out.println("ENTER STATUS");
            s.setStatus(input.nextBoolean());

            studentService.insert(s);
            System.out.println("DO YOU WANT TO ADD MORE? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void showAll() {
        studentService.getAll().forEach(s -> {
            System.out.println(s.toString());
        });

    }
}
