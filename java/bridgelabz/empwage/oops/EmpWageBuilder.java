package bridgelabz.empwage.oops;
import  java.util.ArrayList;
public class EmpWageBuilder implements EmpWageCalculator {

    public ArrayList<CompanyEmpWage> empWages;

    public EmpWageBuilder() {
        empWages = new ArrayList<>();
    }

    @Override
    public void add_company_wage(String company_name,int wage_per_hr,int max_working_days,int max_wroking_hr){
        CompanyEmpWage company=new CompanyEmpWage(company_name,wage_per_hr,max_working_days,max_wroking_hr);
        empWages.add(company);
    }

    @Override
    public void calculateEmpWage(){
    for(CompanyEmpWage companyEmpWage:empWages) {
        companyEmpWage.calculate_total_wage();
       // companyEmpWage.display_company_wage_details();
    }
    }
    public static void main(String[] args) {

        EmpWageBuilder emp=new EmpWageBuilder();
        emp.add_company_wage("Meta",12,21,56);
        emp.add_company_wage("Amazon", 4, 30, 150);
       emp.calculateEmpWage();

    }
}
