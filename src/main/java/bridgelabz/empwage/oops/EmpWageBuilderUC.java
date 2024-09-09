package bridgelabz.empwage.oops;

public class EmpWageBuilderUC {

    //constat
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static final int emp_Rate_per_hour=20;
    public static  final  int num_of_working_days=20;


    public  static void main(String[] args){



        //varibales
        int emp_hrs=0;
        int emp_wage=0;
        int total_emp_wage=0;

        for(int i=0;i<num_of_working_days;i++)
        {
            int empCheck = (int) (Math.floor(Math.random() *10)%3);
            switch (empCheck){
                case is_part_time:
                    emp_hrs=4;
                    break;
                case is_full_time:
                    emp_hrs =8;
                    break;
                default:
                    emp_hrs=0;
            }
            emp_wage=emp_hrs*emp_Rate_per_hour;
            total_emp_wage +=emp_wage;

            System.out.println("emp wage individual day is :- "+emp_wage);
        }

//        if(empCheck == is_full_time)
//            emp_hrs=8;
//        else if(is_part_time ==empCheck)
//            emp_hrs=4;
//        else
//            emp_hrs=0;




        System.out.println("total Emp Wage is :-"+total_emp_wage);

    }
}
