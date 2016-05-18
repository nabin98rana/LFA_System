/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.dao.impl;

import com.navin.lfas.dao.FacilitatorDAO;
import com.navin.lfas.entity.Facilitator;
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
public class FacilitatorDAOImpl implements FacilitatorDAO {

    private List<Facilitator> facilitatorList = new ArrayList<>();

    public FacilitatorDAOImpl() {
        facilitatorList = new ArrayList<>();
    }

    public FacilitatorDAOImpl(List<Facilitator> facilitatorList) {
        this.facilitatorList = facilitatorList;
    }

    @Override
    public List<Facilitator> getAll() {
        return facilitatorList;
    }

    @Override
    public Facilitator getById(int id) {
        for (Facilitator f : facilitatorList) {
            if (f.getId() == id) {
                return f;
            }

        }
        return null;
    }

    @Override
    public int insert(Facilitator t) {
        facilitatorList.add(t);
        return 1;
    }

    @Override
    public int update(Facilitator t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        for (Facilitator f : facilitatorList) {
            if (f.getId() == id) {
                facilitatorList.add(f);
            }
        }
        return 0;
    }

    @Override
    public List<Facilitator> search(String param) {
        List<Facilitator> searchList = new ArrayList<>();
        for (Facilitator f : facilitatorList) {
            if (f.getFirstName().startsWith(param) || f.getLastName().startsWith(param)) {
                facilitatorList.add(f);
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
