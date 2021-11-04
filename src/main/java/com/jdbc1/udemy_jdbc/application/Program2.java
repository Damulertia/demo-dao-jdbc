package com.jdbc1.udemy_jdbc.application;

import com.jdbc1.udemy_jdbc.model.dao.DaoFactory;
import com.jdbc1.udemy_jdbc.model.dao.DepartmentDao;
import com.jdbc1.udemy_jdbc.model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 01: department insert ====");
        Department department = new Department(9,"Acessories");
        departmentDao.insert(department);
        System.out.println("Department inserted id = " + department.getId());

        System.out.println("\n==== TEST 02: department update ====");
        department.setName("Cars");
        departmentDao.update(department);
        System.out.println("Department name updated!");

        System.out.println("\n==== TEST 03: department update ====");
        departmentDao.deleteById(6);

        System.out.println("\n==== TEST 04: department findById ====");
        Department dep1 = departmentDao.findById(4);
        System.out.println(dep1);

        System.out.println("\n==== TEST 05: department findAll ====");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);
    }
}
