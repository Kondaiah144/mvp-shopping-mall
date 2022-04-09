package Employee;

public class EmpOne {


        private String name;
        private double salaryRate;

        public EmpOne(String nm, double rate){
            name = nm;
            salaryRate = rate;
        }

        public void computePay(int hours){

            double pay=hours*salaryRate;
            System.out.println("The Salary for "+getName()+" is "+pay);

        }

        public String toString(){
            return name+" "+salaryRate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalaryRate() {
            return salaryRate;
        }

        public void setSalaryRate(double salaryRate) {
            this.salaryRate = salaryRate;
        }
    }

