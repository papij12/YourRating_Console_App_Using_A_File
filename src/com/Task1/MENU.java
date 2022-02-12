package com.Task1;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class MENU extends CrudOperation {
    public  enum Menu {
        LOAD,
        SAVE
    }
   public static void My_menu(Menu menu) {
       CrudOperation L = new CrudOperation();
      switch (menu) {
          case LOAD :

           L.showData();
break;

          case SAVE :

            L.saveData();
              break;
      }
   }
}
