package bridgelabz.empwage.oops;

public class EmpWageBuilderUC {

    //constat
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static final int emp_Rate_per_hour=20;

    public  static void main(String[] args){



        //varibales
        int emp_hrs=0;
        int emp_wage=0;

        int empCheck = (int) (Math.floor(Math.random() *10)%3);

//        if(empCheck == is_full_time)
//            emp_hrs=8;
//        else if(is_part_time ==empCheck)
//            emp_hrs=4;
//        else
//            emp_hrs=0;

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
        System.out.println("Emp Wage is :-"+emp_wage);

    }
}
