/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author AKLakshan
 */
public class Table {
    public static void main (String [] args){
        try{
            String userTable = "create table user (id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),status varchar(200),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,status) values('Admin','daily@gmail.com','1234567890','Colombo','admin','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200),price varchar(200))";         
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200),date varchar(50),total varchar (200),createdBy varchar(200))";
       
            dbo.setDataOrDelete(userTable, "User table created successfully");
            dbo.setDataOrDelete(adminDetails, "Admin details added successfully");  
            dbo.setDataOrDelete(categoryTable, "Category table created successfully");
            dbo.setDataOrDelete(productTable, "Product table created successfully");
            dbo.setDataOrDelete(billTable, "Bill table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    
}
