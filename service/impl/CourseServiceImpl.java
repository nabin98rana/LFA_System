/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.service.impl;

import com.navin.lfas.dao.CourseDAO;
import com.navin.lfas.dao.impl.CourseDAOImpl;
import com.navin.lfas.entity.Course;
import com.navin.lfas.service.CourseService;
import java.util.List;

/**
 *
 * @author Navin
 */
public class CourseServiceImpl implements CourseService {

    private CourseDAO courseDAO;

    public CourseServiceImpl() {
        courseDAO = new CourseDAOImpl();
    }

    @Override
    public int insert(Course t) {
        return courseDAO.insert(t);
    }

    @Override
    public int update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getById(int id) {
        return courseDAO.getById(id);
    }

    @Override
    public List<Course> getAll() {
        return courseDAO.getAll();
    }

    @Override
    public List<Course> search(String param) {
        return courseDAO.search(param);
    }

}
