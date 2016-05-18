/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.dao.impl;

import com.navin.lfas.dao.StudentDAO;
import com.navin.lfas.entity.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navin
 */
public class StudentDAOImpl implements StudentDAO {

    private List<Student> studentList = new ArrayList<>();

    public StudentDAOImpl() {
        studentList = new ArrayList<>();
    }

    public StudentDAOImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public Student getById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int insert(Student t) {
        studentList.add(t);
        return 1;
    }

    @Override
    public int update(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
            }
        }
        return 0;
    }

    @Override
    public List<Student> search(String param) {
        List<Student> searchList = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getFirstName().startsWith(param) || s.getLastName().startsWith(param)) {
                studentList.add(s);
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
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }
}
