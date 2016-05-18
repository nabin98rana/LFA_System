/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.dao.impl;

import com.navin.lfas.dao.CourseDAO;
import com.navin.lfas.entity.Course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navin
 */
public class CourseDAOImpl implements CourseDAO {

    private List<Course> courseList = new ArrayList<>();

    public CourseDAOImpl() {
        courseList = new ArrayList<>();
    }

    public CourseDAOImpl(List<Course> courseList) {
        this.courseList = courseList;
        courseList = new ArrayList<>();
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course getById(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public int insert(Course t) {
        courseList.add(t);
        return 1;
    }

    @Override
    public int update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                courseList.remove(c);
            }
        }
        return 0;
    }

    @Override
    public List<Course> search(String param) {
        List<Course> searchList = new ArrayList<>();
        for (Course c : courseList) {
            if (c.getName().startsWith(param) || c.getSubject().startsWith(param)) {
                courseList.add(c);
            }
        }
        return searchList;
    }

    @Override
    public void export(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

    @Override
    public void loadFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

}
