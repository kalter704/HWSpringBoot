package com.hw.sprngbt.demo.dao;

import java.util.List;

public interface Dao<T> {

    T getById(Long id);

    List<T> getAll();

    T insert(T data);

    T update(T data);

}
