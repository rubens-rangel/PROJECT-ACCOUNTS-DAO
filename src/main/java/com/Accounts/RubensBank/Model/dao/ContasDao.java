package com.Accounts.RubensBank.Model.dao;


import com.Accounts.RubensBank.Model.entities.Conta;

import java.util.List;

public interface ContasDao {

    void insert(Conta obj);
    void update(Conta obj);
    Conta findById(Integer id);
    List<Conta> findAll();
}

