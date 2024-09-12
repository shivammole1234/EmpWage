package bridgelabz.empwage.oops;

public class CompanyEmpWage   {
  final int is_part_time=1;
  final int is_full_time=2;

  final String company_name;
  final int max_working_days;
  final int max_working_hrs;
  final int wage_per_hr;
  int total_wage;
  int working_hrs;
  int working_day;
  int total_working_hr;
    CompanyEmpWage
          (String company_name,int wage_per_hr,int max_working_days,int max_working_hrs)
  {
      this.company_name=company_name;
      this.wage_per_hr=wage_per_hr;
      this.max_working_hrs=max_working_hrs;
      this.max_working_days=max_working_days;
      total_wage=0;
      working_hrs=0;
      working_day=0;
      total_working_hr=0;
      calculate_total_wage();
      display_company_wage_details();
  }

    private void display_company_wage_details() {
        System.out.println("printing the details of company");
        System.out.println("Company Name :-"+company_name+ "\n Max Working Days :- "
                +working_day+"\n Max Working hour:- "+max_working_hrs+
                " \n Wage per Hour:- "+wage_per_hr+" " +"\ntotal working hours:-" +total_working_hr+" \n Total wage of employee :- "
                +total_wage);
    }

    void calculate_total_wage(){
      System.out.println("calculating the eamployee wage for the specific comoany");

      while (total_working_hr<max_working_hrs && working_day<max_working_days)
      {
          working_day++;
          int emp_type=(int)(Math.random()*100)%3;

          switch (emp_type){
              case is_full_time:
                  working_hrs=8;
                  break;
              case is_part_time:
                  working_hrs=4;
                  break;
              default:
                  working_hrs=0;
                  break;
          }
          int wage=working_hrs*wage_per_hr;
          total_wage+=wage;
          total_working_hr+=working_hrs;

      }

  }

}
