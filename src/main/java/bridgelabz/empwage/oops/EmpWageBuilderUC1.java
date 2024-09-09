package bridgelabz.empwage.oops;

public class EmpWageBuilderUC1 {
    public  static void main(String[] args){

        //constat
        int is_full_time=0;
        int emp_Rate_per_hour=20;

        //varibales
        int emp_hrs=0;
        int emp_wage=0;

        double empCheck =Math.floor(Math.random() *10)%2;

        if(empCheck == is_full_time)
            emp_hrs=8;
        else
            emp_hrs=0;

        emp_wage=emp_hrs*emp_Rate_per_hour;
        System.out.println("Emp Wage is :-"+emp_wage);

    }
}
