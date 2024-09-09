package bridgelabz.empwage.oops;

public class EmpWageBuilderUC {

    //constat
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static final int emp_Rate_per_hour=20;
    public static  final  int num_of_working_days=20;
    public static final int max_working_hr_month=100;


    public  static void main(String[] args){



        //varibales
        int emp_hrs=0;
        int total_emp_hr=0;
        int total_working_days=0;
        int emp_wage=0;
        int total_emp_wage=0;

        while(total_emp_hr<=max_working_hr_month &&
                total_working_days<num_of_working_days){

            total_working_days++;
            int empCheck=(int) Math.floor(Math.random()*10) % 3;

            switch(empCheck){
                case is_part_time:
                    emp_hrs=4;
                    break;
                case is_full_time:
                    emp_hrs=8;
                    break;
                default:
                    emp_hrs=0;
            }
            total_emp_hr+=emp_hrs;
            System.out.println("Days :- " + total_working_days + " ,Emp hour :- "+emp_hrs);

        }
        total_emp_wage =total_emp_hr*emp_Rate_per_hour;

        System.out.println("total Emp Wage is :-"+total_emp_wage);

    }
}
