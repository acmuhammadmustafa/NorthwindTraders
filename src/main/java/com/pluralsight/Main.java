package com.pluralsight;


import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "yearup";
        String database = "northwind";

        String databaseurl = "jdbc:mysql://localhost:3306/" + database;


        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        //  open a connection to the database
        Connection connection;
        connection = DriverManager.getConnection(
                databaseurl,
                username,
                password);

        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();

        // define your query
        String query = "SELECT * FROM products";

        // 2. execute your query
        ResultSet results = statement.executeQuery(query);


        // 3. process the results
        while (results.next()) {
            String productID = results.getString("ProductID");
            String productName = results.getString("ProductName");

            System.out.printf("%-5s %-30s\n", productID, productName);
        }

    }

    // Add dependencies

    // Get connection creating statement and resultSet

    // Open connection, define query, print the query with Sout



}