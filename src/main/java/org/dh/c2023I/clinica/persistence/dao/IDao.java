package org.dh.c2023I.clinica.persistence.dao;

import java.util.List;

public interface IDao<E> {

    List<E> findAll();

    E findById(Integer id);

    //Insert
    E create(E e);
    //Delete

    //Update
}
