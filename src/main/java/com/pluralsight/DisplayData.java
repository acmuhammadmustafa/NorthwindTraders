package com.pluralsight;

import java.sql.*;

public class DisplayData {
    String username = "root";
    String password = "yearup";
    String database = "northwind";
    String databaseurl = "jdbc:mysql://localhost:3306/" + database;

    public void showProducts() throws ClassNotFoundException, SQLException {
        try {
            Connection connection = DriverManager.getConnection(databaseurl, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement("select productid, productname, unitprice from products");

            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                System.out.printf("Product ID: %d \n Name: %s \n Price : $%.2f \n",
                        resultSet.getInt("ProductID"),
                        resultSet.getString("ProductName"),
                        resultSet.getDouble("UnitPrice"));

            }

            resultSet.close();
            preparedStatement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }

    }

    public void showCustomers(){
        String username = "root";
        String password = "yearup";
        String database = "northwind";
        String databaseurl = "jdbc:mysql://localhost:3306/" + database;

        try {
            Connection connection = DriverManager.getConnection(databaseurl, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement("select contactname, companyname, city, country, phone from customers");

            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                System.out.printf( "Contact Name: %s\nCompany Name: %s\nCity: %s\nCountry: %s\nPhone Number: %s\n\n",
                        resultSet.getString("ContactName"),
                        resultSet.getString("CompanyName"),
                        resultSet.getString("City"),
                        resultSet.getString("Country"),
                        resultSet.getString("Phone"));

            }

            resultSet.close();
            preparedStatement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }

    }

}

