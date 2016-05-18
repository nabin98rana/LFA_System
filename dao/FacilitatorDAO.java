/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.dao;

import com.navin.lfas.entity.Facilitator;
import java.io.IOException;

/**
 *
 * @author Navin
 */
public interface FacilitatorDAO extends GenericDAO<Facilitator> {

    void export(String fileName, String content) throws IOException;

    void loadFromFile(String fileName) throws IOException;
}
