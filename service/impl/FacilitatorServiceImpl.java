/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.service.impl;

import com.navin.lfas.dao.FacilitatorDAO;
import com.navin.lfas.dao.impl.FacilitatorDAOImpl;
import com.navin.lfas.entity.Facilitator;
import com.navin.lfas.service.FacilitatorService;
import java.util.List;

/**
 *
 * @author Navin
 */
public class FacilitatorServiceImpl implements FacilitatorService {

    private FacilitatorDAO facilitatorDAO;

    public FacilitatorServiceImpl() {
        facilitatorDAO = new FacilitatorDAOImpl();
    }

    @Override
    public int insert(Facilitator t) {
        return facilitatorDAO.insert(t);
    }

    @Override
    public int update(Facilitator t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Facilitator getById(int id) {
        return facilitatorDAO.getById(id);
    }

    @Override
    public List<Facilitator> getAll() {
        return facilitatorDAO.getAll();
    }

    @Override
    public List<Facilitator> search(String param) {
        return facilitatorDAO.search(param);
    }

}
