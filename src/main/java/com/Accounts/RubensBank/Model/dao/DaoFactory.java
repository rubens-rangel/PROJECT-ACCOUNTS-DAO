package com.Accounts.RubensBank.Model.dao;


import com.Accounts.RubensBank.db.DB;
import com.Accounts.RubensBank.Model.dao.implementation.ContasDaoJDBC;

public class DaoFactory {

    public static ContasDao createContasDao(){
        return new ContasDaoJDBC(DB.getConnection());
    }

}
