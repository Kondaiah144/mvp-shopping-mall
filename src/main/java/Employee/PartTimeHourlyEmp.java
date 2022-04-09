package Employee;
import Employee.EmpOne;

public class PartTimeHourlyEmp extends EmpOne {

        public PartTimeHourlyEmp(String nm, double rate) {
            super(nm, rate);

        }

        public void computePay(int hours){

            if (hours>40){
                double extraPay=(hours-40)*1.5*getSalaryRate();
                double pay=40*getSalaryRate();
                double total=extraPay+pay;
                System.out.println("The salary for "+getName()+" is "+total);
            }
            else{
                super.computePay(hours);

            }
        }
    }

