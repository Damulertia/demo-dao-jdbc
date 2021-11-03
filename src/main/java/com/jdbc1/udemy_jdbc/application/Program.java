package com.jdbc1.udemy_jdbc.application;

import com.jdbc1.udemy_jdbc.model.dao.DaoFactory;
import com.jdbc1.udemy_jdbc.model.dao.SellerDao;
import com.jdbc1.udemy_jdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 01: seller findById ====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);

        System.out.println("\n==== TEST 02: seller findByDepartment ====");
        List<Seller> list = sellerDao.findByDepartment(seller.getDepartment());
        list.forEach(System.out::println);

        System.out.println("\n==== TEST 03: seller findAll ====");
        List<Seller> listAllSellers = sellerDao.findAll();
        listAllSellers.forEach(System.out::println);

//        System.out.println("\n==== TEST 04: seller insert ====");
//        Seller sellerToInsert = new Seller(88, "Valéria Buss" , "valeria@gmail", new Date(), 8500.0, seller.getDepartment());
//        sellerDao.insert(sellerToInsert);
//        listAllSellers =sellerDao.findAll();
//        listAllSellers.forEach(System.out::println);
//        System.out.println("Inserted! New id = " + sellerToInsert.getId());

//        System.out.println("\n==== TEST 05: seller update ====");
//        seller = sellerDao.findById(11);
//        seller.setName("Valeria Boobs");
//        sellerDao.update(seller);
//        System.out.println(seller);
//        System.out.println("Update completed!");

        System.out.println("\n==== TEST 05: seller delete ====");
        System.out.print("Insert ID to remove(delete) from data bank: ");
        int idToDelete = sc.nextInt();
        sellerDao.deleteById(idToDelete);
        System.out.println("Delete complete!");
        sellerDao.findById(idToDelete);

        sc.close();
    }
}
