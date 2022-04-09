import java.util.Scanner;

import Employee.EmpOne;
import Employee.FullTimeSalaryEmp;
import Employee.PartTimeHourlyEmp;
import shoppingmall.ShoppingMall;

public class Main {
    public static void main(String[] args) {
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

//Customer Entering to Shopping Mall

            System.out.println("\n" + "**** You have entered Aanand Shopping Mall ****\n"
                    + "East Block\n" + "West Block\n" + "North Block\n" + "South Block\n");

            System.out.println("Where you are planning shop?\n" + "Please select here:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("East Block - Restaurents");
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
                    System.out.println("East Block - Restaurents");
                    System.out.println("West Block - Entertainment");
                    break;
                case 7:
                    System.out.println("**** Approved Pass for requested Block!****");
                    System.out.println("South Block - Cloths");
                    System.out.println("East Block - Restaurents");
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
                    System.out.println("East Block - Restaurents");
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
                    System.out.println("East Block - Restaurents");
                    System.out.println("West Block - Entertainment");
                    break;

                default:
                    System.out.println(" You are at Main Entrance,please choose where you wanted to Shop? ");
                    scanner.close();


            }

        }

        }



