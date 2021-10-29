package com.jdbc1.udemy_jdbc.application;

import com.jdbc1.udemy_jdbc.model.entities.Department;
import com.jdbc1.udemy_jdbc.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Computers");
        System.out.println(obj);

        Seller seller = new Seller(1, "TON", "ton@gmail", new Date(), 6700.0, obj);
        System.out.println(seller);
    }
}
