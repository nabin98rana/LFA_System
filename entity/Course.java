/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.entity;

/**
 *
 * @author Navin
 */
public class Course {
    private int id;
    private String name,subject,description,message;
    private double fee;
    private boolean status;

    public Course() {
    }

    public Course(int id, String name, String subject, String description, String message, double fee, boolean status) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.description = description;
        this.message = message;
        this.fee = fee;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getTotal() {
        return fee;
    }

    public void setTotal(double fee) {
        this.fee = fee;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", subject=" + subject + ", description=" + description + ", message=" + message + ", fee=" + fee + ", status=" + status + '}';
    }
}
