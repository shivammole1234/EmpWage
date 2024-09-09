package bridgelabz.empwage.oops;

public class EmpWageBuilderUC1 {
    public  static void main(String[] args){

        int is_full_time=0;

        double empCheck =Math.floor(Math.random() *10)%2;

        if(empCheck == is_full_time)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is abscent");

    }
}
