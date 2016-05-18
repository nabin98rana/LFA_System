/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.service;

import java.util.List;

/**
 *
 * @author Navin
 */
public interface GenericService<T> {

    int insert(T t);

    int update(T t);

    T getById(int id);

    List<T> getAll();

    List<T> search(String param);
}
