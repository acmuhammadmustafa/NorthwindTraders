package com.pluralsight;

import java.sql.SQLException;
import java.util.List;

public class HomeScreen {
    DisplayData displayData = new DisplayData();

    public void homeScreen(){
//        String command = ConsoleHelper.promptForHelperMenu("Select an option:", List.of("Display all products","Display all customers"),true);
//        if (command == null)
//            return;
        System.out.printf("Select an option:\n1) Display all products\n2) Display all customers\n0) Exit");
        System.out.println();
      int command = ConsoleHelper.promptForInt("Selection");
      switch (command){
          case 1 -> displayData.showProducts();
          case 2 -> displayData.showCustomers();
          default -> {
              return;
          }
      }
    }

}
