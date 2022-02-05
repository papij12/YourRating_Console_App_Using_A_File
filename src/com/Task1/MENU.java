package com.Task1;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class MENU {
    public  enum Menu {
        LOAD,
        SAVE
    }
   public static void My_menu(Menu menu) {
      switch (menu) {
          case LOAD :
              try {
                  File mylist = new File("C:\\Users\\irene's file\\Desktop\\5 semester\\Advanced OOP in Java\\Task1\\src\\com\\Task1\\Restaurant_in_my_city.txt");
                Scanner myReader = new Scanner(mylist);
                while(myReader.hasNextLine())
                {
                    String data =myReader.nextLine();
                    System.out.println(data);
                }
              }catch(Exception e)
              {
                  System.out.println("an error occurred ");
              }
break;

          case SAVE:
              String [] restaurants =  {"1.Bordeaux","2.chez gusto","3.zahire kebab","4.KFC","5.Pizza taxi"};
              int [] ranks = {1,2,3,4,5};
              try {
                  FileWriter obj = new FileWriter("C:\\Users\\irene's file\\Desktop\\5 semester\\Advanced OOP in Java\\Task1\\src\\com\\Task1\\Restaurant_in_my_city.txt",true);
                  System.out.println("Available restaurants in your city");
                  for (String restaurant : restaurants) {
                      System.out.println(restaurant);
                  }
                  System.out.println("Which one do you want to rate?");
                  Scanner input = new Scanner(System.in);
                  int choice = input.nextInt();
                  int count1 =0;
                  int count2 =0;
                  int count3 =0;
                  int count4 =0;
                  int count5 =0;
                  int rate;
                  switch (choice) {
                      case 1 -> {
                          System.out.println("1.Bordeaux");
                          System.out.println("How would you rank this restaurant on a scale of 1 - 5?");
                          Scanner input1 = new Scanner(System.in);
                          rate = input1.nextInt();
                          if (rate == ranks[0]) {
                              count1++;
                              obj.write("1.Bordeaux || Rank 1 (" + count1 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[1]) {
                              count2++;
                              obj.write("1.Bordeaux || Rank 2 (" + count2 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[2]) {
                              count3++;
                              obj.write("1.Bordeaux || Rank 3 (" + count3 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[3]) {
                              count4++;
                              obj.write("1.Bordeaux || Rank 4 (" + count4 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[4]) {
                              count5++;
                              obj.write("1.Bordeaux || Rank 5 (" + count5 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else {
                              System.out.println("Wrong rating");
                          }
                      }
                      case 2 -> {
                          System.out.println("2.chez gusto");
                          System.out.println("How would you rank this restaurant on a scale of 1 - 5?");
                          Scanner input2 = new Scanner(System.in);
                          rate = input2.nextInt();
                          if (rate == ranks[0]) {
                              count1++;
                              obj.write("2.chez gusto || Rank 1 (" + count1 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[1]) {
                              count2++;
                              obj.write("2.chez gusto || Rank 2 (" + count2 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[2]) {
                              count3++;
                              obj.write("2.chez gusto || Rank 3 (" + count3 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[3]) {
                              count4++;
                              obj.write("2.chez gusto || Rank 4 (" + count4 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[4]) {
                              count5++;
                              obj.write("2.chez gusto || Rank 5 (" + count5 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else {
                              System.out.println("Wrong rating");
                          }
                      }
                      case 3 -> {
                          System.out.println("3.zahire kebab");
                          System.out.println("How would you rank this restaurant on a scale of 1 - 5?");
                          Scanner input3 = new Scanner(System.in);
                          rate = input3.nextInt();

                          if (rate == ranks[0]) {
                              count1++;
                              obj.write("3.zahire kebab || Rank 1 (" + count1 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[1]) {
                              count2++;
                              obj.write("3.zahire kebab || Rank 2 (" + count2 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[2]) {
                              count3++;
                              obj.write("3.zahire kebab || Rank 3 (" + count3 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[3]) {
                              count4++;
                              obj.write("3.zahire kebab || Rank 4 (" + count4 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[4]) {
                              count5++;
                              obj.write("3.zahire kebab || Rank 5 (" + count5 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else {
                              System.out.println("Wrong rating");
                          }

                      }
                      case 4 -> {
                          System.out.println("4.KFC");
                          System.out.println("How would you rank this restaurant on a scale of 1 - 5?");
                          Scanner input4 = new Scanner(System.in);
                          rate = input4.nextInt();

                          if (rate == ranks[0]) {
                              count1++;
                              obj.write("4.KFC || Rank 1 (" + count1 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[1]) {
                              count2++;
                              obj.write("4.KFC || Rank 2 (" + count2 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[2]) {
                              count3++;
                              obj.write("4.KFC || Rank 3 (" + count3 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[3]) {
                              count4++;
                              obj.write("4.KFC || Rank 4 (" + count4 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[4]) {
                              count5++;
                              obj.write("4.KFC || Rank 5 (" + count5 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else {
                              System.out.println("Wrong rating");
                          }
                      }
                      case 5 -> {
                          System.out.println("Pizza taxi");
                          System.out.println("How would you rank this restaurant on a scale of 1 - 5?");
                          Scanner input4 = new Scanner(System.in);
                          rate = input4.nextInt();

                          if (rate == ranks[0]) {
                              count1++;
                              obj.write("5.Pizza taxi || Rank 1 (" + count1 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[1]) {
                              count2++;
                              obj.write("5.Pizza taxi || Rank 2 (" + count2 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[2]) {
                              count3++;
                              obj.write("5.Pizza taxi || Rank 3 (" + count3 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[3]) {
                              count4++;
                              obj.write("5.Pizza taxi || Rank 4 (" + count4 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else if (rate == ranks[4]) {
                              count5++;
                              obj.write("5.Pizza taxi || Rank 5 (" + count5 + ")");
                              obj.write("\n");
                              obj.close();
                              System.out.println("Thank you for your ranking us!");
                          } else {
                              System.out.println("Wrong rating");
                          }
                      }

                  }
              } catch (Exception e) {
                  System.out.println("an error occurred");
              }
      }
   }
}
