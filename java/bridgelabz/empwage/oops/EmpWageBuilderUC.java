package bridgelabz.empwage.oops;

public class EmpWageBuilderUC {

        public static void calculateTotalWage(String company, int emp_Rate_per_hour, int num_of_working_days, int max_working_hr_month)
        {

            final int is_full_time = 2;
            final int is_part_time = 1;

            int total_emp_wage = 0;
            int total_emp_hr = 0;
            int total_working_days=0;
            int emp_hrs=0;
            System.out.println("\n Details of "+company+ " employee");
            System.out.println("Wage per hour "+emp_Rate_per_hour);
            System.out.println("Maximum working hours "+max_working_hr_month);
            System.out.println("Maximum working days "+num_of_working_days);



            while(total_emp_hr<=max_working_hr_month &&
                    total_working_days<num_of_working_days) {

                total_working_days++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {
                    case is_part_time:
                        emp_hrs = 4;
                        break;
                    case is_full_time:
                        emp_hrs = 8;
                        break;
                    default:
                        emp_hrs = 0;
                }
                total_emp_hr += emp_hrs;
                System.out.println("Days :- " + total_working_days + " ,Emp hour :- " + emp_hrs);

            }
            total_emp_wage =total_emp_hr*emp_Rate_per_hour;
            System.out.println("Total wage for a month of "+ company+ " employee is " + total_emp_wage);
        }
        public static void main( String[] args )
        {
            System.out.println( "Welcome to Employee Wage Computation Program" );
            calculateTotalWage("Cogni", 20,16, 150);
            calculateTotalWage("Capg",40,20,100);
            calculateTotalWage("Nike",30,15,100);
            calculateTotalWage("Sparx",20,20,200);
            calculateTotalWage("HP", 25,25, 150);
        }
    }