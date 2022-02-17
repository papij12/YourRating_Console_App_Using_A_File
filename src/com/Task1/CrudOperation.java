package com.Task1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CrudOperation extends Notifications {
myFileConnection path = new myFileConnection();
    public void showData(){

        try {
            File mylist = new File(path.getPath());
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

    }
    public void saveData(){

        String [] restaurants =  {"1.Bordeaux","2.chez gusto","3.zahire kebab","4.KFC","5.Pizza taxi"};
        int [] ranks = {1,2,3,4,5};
        try {
            FileWriter obj = new FileWriter(path.getPath(), true);
            System.out.println("Available restaurants in your city");
            for (String restaurant : restaurants) {
                System.out.println(restaurant);
            }
            System.out.println("Which one do you want to rate?");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            int rate;
            switch (choice) {
                case 1 -> {
                    System.out.println("1.Bordeaux");
                    rankUsMessage();
                    Scanner input1 = new Scanner(System.in);
                    rate = input1.nextInt();
                    if (rate == ranks[0]) {

                        obj.write("1.Bordeaux || Rank 1 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();// repeat
                    } else if (rate == ranks[1]) {
                      
                        obj.write("1.Bordeaux || Rank 2 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[2]) {

                        obj.write("1.Bordeaux || Rank 3 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[3]) {

                        obj.write("1.Bordeaux || Rank 4 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[4]) {

                        obj.write("1.Bordeaux || Rank 5 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else {
                        wrongInputMessage();
                    }
                }
                case 2 -> {
                    System.out.println("2.chez gusto");
                    rankUsMessage();
                    Scanner input2 = new Scanner(System.in);
                    rate = input2.nextInt();
                    if (rate == ranks[0]) {

                        obj.write("2.chez gusto || Rank 1 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[1]) {

                        obj.write("2.chez gusto || Rank 2 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[2]) {

                        obj.write("2.chez gusto || Rank 3 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[3]) {

                        obj.write("2.chez gusto || Rank 4 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[4]) {

                        obj.write("2.chez gusto || Rank 5 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else {
                        wrongInputMessage();
                    }
                }
                case 3 -> {
                    System.out.println("3.zahire kebab");
                    rankUsMessage();
                    Scanner input3 = new Scanner(System.in);
                    rate = input3.nextInt();

                    if (rate == ranks[0]) {

                        obj.write("3.zahire kebab || Rank 1 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[1]) {

                        obj.write("3.zahire kebab || Rank 2 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[2]) {

                        obj.write("3.zahire kebab || Rank 3 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[3]) {

                        obj.write("3.zahire kebab || Rank 4 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[4]) {

                        obj.write("3.zahire kebab || Rank 5 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else {
                        wrongInputMessage();
                    }

                }
                case 4 -> {
                    System.out.println("4.KFC");
                    rankUsMessage();
                    Scanner input4 = new Scanner(System.in);
                    rate = input4.nextInt();

                    if (rate == ranks[0]) {

                        obj.write("4.KFC || Rank 1 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[1]) {

                        obj.write("4.KFC || Rank 2 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[2]) {

                        obj.write("4.KFC || Rank 3 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[3]) {

                        obj.write("4.KFC || Rank 4 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[4]) {

                        obj.write("4.KFC || Rank 5 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else {
                        wrongInputMessage();
                    }
                }
                case 5 -> {
                    System.out.println("Pizza taxi");
                    rankUsMessage();
                    Scanner input4 = new Scanner(System.in);
                    rate = input4.nextInt();

                    if (rate == ranks[0]) {

                        obj.write("5.Pizza taxi || Rank 1 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[1]) {

                        obj.write("5.Pizza taxi || Rank 2 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[2]) {

                        obj.write("5.Pizza taxi || Rank 3 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[3]) {

                        obj.write("5.Pizza taxi || Rank 4 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else if (rate == ranks[4]) {

                        obj.write("5.Pizza taxi || Rank 5 ");
                        obj.write("\n");
                        obj.close();
                        thankYouMessage();
                    } else {
                        wrongInputMessage();
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("an error occurred");
        }
    }
}
