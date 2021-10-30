package com.jdbc1.udemy_jdbc.application;

import com.jdbc1.udemy_jdbc.model.dao.DaoFactory;
import com.jdbc1.udemy_jdbc.model.dao.SellerDao;
import com.jdbc1.udemy_jdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 01: seller findById ====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);

        System.out.println("\n==== TEST 02: seller findByDepartment ====");
        List<Seller> list = sellerDao.findByDepartment(seller.getDepartment());
        list.forEach(System.out::println);
    }
}
