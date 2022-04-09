package Employee;

public class FullTimeSalaryEmp extends EmpOne {

        public FullTimeSalaryEmp(String nm, double rate){
            super(nm,rate);
        }

        public void computePay(int hours){
            double pay=40*getSalaryRate();
            System.out.println("The salary for "+getName()+" is "+pay);

        }
    }
