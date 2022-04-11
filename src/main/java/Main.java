import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import Employee.EmpOne;
import Employee.FullTimeSalaryEmp;
import Employee.PartTimeHourlyEmp;
import shoppingmall.ShoppingMallMain;

import static security.SecurityRedactedMessages.redactTextFile;

public class Main {
    public static void main(String[] args) {

        //Class Fields - Aanand Shopping Mall Information Map


        System.out.println("*** Announcement - Job Openings in Aanand Mall!! ***");
        EmpOne x=new PartTimeHourlyEmp("Technology Operations Manager",4.5);
        EmpOne y=new PartTimeHourlyEmp("Starbucks - Manager",4.0);
        EmpOne z=new FullTimeSalaryEmp("Creative Design Architect ",5.0);
        EmpOne p=new FullTimeSalaryEmp("Director - Management & Operations",8.0);

        System.out.println("Job Ratings!!");
        System.out.println(x+", "+y+", "+z+", "+", "+p);

        x.computePay(36);
        y.computePay(20);
        z.computePay(60);
        p.computePay(50);
        System.out.println("\n" + "***************************************************\n" + "\n");


        //Average Yearly Shopping Mall Revenue Data

        HashMap<String, Integer> avgYearlyRevenueData = new HashMap<String, Integer>();

        avgYearlyRevenueData.put("Technology - $", 5000000);
        avgYearlyRevenueData.put("Cloths - $", 7000000);
        avgYearlyRevenueData.put("Restaurants - $", 3000000);
        avgYearlyRevenueData.put("Entertainment - $", 9000000);
        avgYearlyRevenueData.put("Skill Training - $", 800000);

        System.out.println("Aanand Mall's Yearly Revenue: \n" + avgYearlyRevenueData + "\n");
//Customer Entering to Shopping Mall

            System.out.println("\n" + "**** You have entered Aanand Shopping Mall ****\n"
                    + "East Block\n" + "West Block\n" + "North Block\n" + "South Block\n");

        //Security Redacted Messages
        Scanner scanner = new Scanner(System.in);

        System.out.println("What file would you like to " +
                "redact information from?");
        String fileName = scanner.nextLine();

        System.out.println("What words would you like to redact? " +
                "Separate word or phrase with a comma. " +
                "If you phrase includes punctuation, include " +
                "that in your input.");
        String redactedWords = scanner.nextLine();
        String[] redactedWordsList = redactedWords.split(",");

        redactTextFile(fileName, redactedWordsList);

//Parking Availability information

        //Create a HashSet object called numbers
        HashSet<Integer> parkingSpaces = new HashSet<Integer>();

        //Add values to the set
        parkingSpaces.add(6);
        parkingSpaces.add(9);
        parkingSpaces.add(14);
        parkingSpaces.add(20);
        parkingSpaces.add(21);
        parkingSpaces.add(35);
        parkingSpaces.add(39);
        parkingSpaces.add(46);
        parkingSpaces.add(57);
        parkingSpaces.add(63);
        parkingSpaces.add(65);
        parkingSpaces.add(67);
        parkingSpaces.add(80);
        parkingSpaces.add(91);
        parkingSpaces.add(96);
        parkingSpaces.add(116);
        parkingSpaces.add(124);
        parkingSpaces.add(128);
        parkingSpaces.add(134);
        parkingSpaces.add(137);
        parkingSpaces.add(138);
        parkingSpaces.add(145);

        //Show which numbers between 1 and 150 are in the set
        System.out.println("*** Find parking Space Information Here ***");
        for (int i = 1; i <= 150; i++) {
            if (parkingSpaces.contains(i)) {
                System.out.println(i + " Parking Space is not available :(");
            } else {
                System.out.println(i + " Parking Space is available");
            }

        }


            System.out.println("Where you are planning shop?\n" + "Please select here:");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("East Block - Restaurants");
                    break;
                case 2:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("West Block - Entertainment");
                    break;
                case 3:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("North Block - Technology");
                    break;
                case 4:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    break;
                case 5:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("North Block - Technology");
                    break;
                case 6:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("East Block - Restaurants");
                    System.out.println("West Block - Entertainment");
                    break;
                case 7:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("East Block - Restaurants");
                    break;
                case 8:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("West Block - Technology");
                    break;
                case 9:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("North Block - Technology");
                    System.out.println("East Block - Restaurants");
                    break;
                case 10:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("North Block - Technology");
                    System.out.println("West Block - Entertainment");
                    break;
                case 11:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("North Block - Technology");
                    System.out.println("East Block - Restaurants");
                    System.out.println("West Block - Entertainment");
                    break;

                default:
                    System.out.println(" You are at Main Entrance,please choose where you wanted to Shop? ");

            }
        }
        }
