/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas.dao;

import java.util.List;

/**
 *
 * @author Navin
 */
public interface GenericDAO <T>{
List<T>getAll();
T getById(int id);
int insert(T t);
int update(T t);
int delete(int id);
List<T> search(String param);
}
