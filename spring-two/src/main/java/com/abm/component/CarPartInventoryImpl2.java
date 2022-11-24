package com.abm.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("carpart2")
public class CarPartInventoryImpl2 implements CarPartInventory {
	@Autowired
	private DataSource dataSource;

	public void addNewPart(CarPart carPart) {
		Connection conn = null;
        PreparedStatement stmt = null;
        try {
           conn= dataSource.getConnection();
            //System.out.println("got connected...");
            String sql = "insert into tbl_car_parts(part_name,car_model,price,quantity) values(?,?,?,?)";
            stmt = conn.prepareStatement(sql);
           stmt.setString(1, carPart.getPartName());
           stmt.setString(2, carPart.getCarModel());
           stmt.setDouble(3, carPart.getPrice());
           stmt.setInt(4, carPart.getQuantity());
           stmt.executeUpdate();
	}
        catch(SQLException e) {
        	System.out.println("Exception");
        	e.printStackTrace();
        	}
        finally {
        	try {conn.close();}
        	catch(Exception e) {}
        }
        }
	 
	public List<CarPart> getAvailableParts() {
		Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //loading the JDBC Driver
        	conn= dataSource.getConnection();
           
            //System.out.println("got connected...");
            String sql = "select * from tbl_car_parts";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            List<CarPart> list = new ArrayList<CarPart>();
            while(rs.next()) {
            	CarPart cp = new CarPart();
            	cp.setPartNo(rs.getInt("part_no"));
            	cp.setPartName(rs.getString("part_name"));
            	cp.setCarModel(rs.getString("Car_model"));
            	cp.setPrice(rs.getDouble("price"));
            	cp.setQuantity(rs.getInt("Quantity"));
            	list.add(cp);
            	
            }
            return list;
            
          
	}
        catch(Exception e) {
        	System.out.println("Exception");
        	e.printStackTrace();
        	return null;
        	
        	}
        finally {
        	try {conn.close();}
        	catch(Exception e) {}
        }
		
		
		
	}
	

}
