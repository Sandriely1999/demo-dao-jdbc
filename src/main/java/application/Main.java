package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Department obj = new Department(1,"Books");
        System.out.println(obj);

        Seller seller = new Seller(21,"Bob", "bob@gmail.com" , new Date() , 3000.0, obj);
        System.out.println(seller);
    }
}