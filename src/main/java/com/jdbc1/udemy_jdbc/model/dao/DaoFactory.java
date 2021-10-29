package com.jdbc1.udemy_jdbc.model.dao;

import com.jdbc1.udemy_jdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
