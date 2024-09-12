package bridgelabz.empwage.oops;
import  java.util.ArrayList;
public class EmpWageBuilder {

    private ArrayList<CompanyEmpWage> empWages;

    public EmpWageBuilder() {
        empWages = new ArrayList<>();
    }

    public void add_company_wage(String company_name,int wage_per_hr,int max_working_days,int max_wroking_hr){
        CompanyEmpWage company=new CompanyEmpWage(company_name,wage_per_hr,max_working_days,max_wroking_hr);
        empWages.add(company);
    }


    public static void main(String[] args) {

        EmpWageBuilder emp=new EmpWageBuilder();
        emp.add_company_wage("Meta",12,21,56);



    }
}
