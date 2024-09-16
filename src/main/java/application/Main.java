package application;
import java.sql.*;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n === Test 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}