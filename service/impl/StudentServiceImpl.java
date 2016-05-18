/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.service.impl;

import com.navin.lfas.dao.StudentDAO;
import com.navin.lfas.dao.impl.StudentDAOImpl;
import com.navin.lfas.entity.Student;
import com.navin.lfas.service.StudentService;
import java.util.List;

/**
 *
 * @author Navin
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    public StudentServiceImpl() {
        studentDAO = new StudentDAOImpl();
    }

    @Override

    public int insert(Student t) {
        return studentDAO.insert(t);
    }

    @Override
    public int update(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    @Override
    public List<Student> search(String param) {
        return studentDAO.search(param);
    }

}
