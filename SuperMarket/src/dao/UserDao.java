/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author AKLakshan
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,address,password,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','false')";
        dbo.setDataOrDelete(query, "Registered successfully! Wait for admin approval.");
    }
    
    public static User login(String email, String password){
        User user = null;
        try{
            ResultSet rs = dbo.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
                
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = dbo.getData("select *from user where email like '%"+email+"%'");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return arrayList;
    }
    
    public static void changeStatus(String email, String status){
        String query = "Update user set status='"+status+"' where email ='"+email+"'";
        dbo.setDataOrDelete(query, "Status changed successfully");
    }
}
