package bridgelabz.empwage.oops;

import java.util.ArrayList;

public class EmpWageBuilder implements EmpWageCalculator {

    public ArrayList<CompanyEmpWage> empWages;

    // Constructor to initialize the list
    public EmpWageBuilder() {
        empWages = new ArrayList<>();
    }

    // Add a company wage object to the list
    @Override
    public void add_company_wage(String company_name, int wage_per_hr, int max_working_days, int max_working_hr) {
        CompanyEmpWage company = new CompanyEmpWage(company_name, wage_per_hr, max_working_days, max_working_hr);
        empWages.add(company);
    }

    // Calculate the wages for all companies
    @Override
    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : empWages) {
            companyEmpWage.calculate_total_wage(); // Calculate total wage for each company
            companyEmpWage.display_company_wage_details();
        }
    }

    // Method to get total wage by company name
    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage companyEmpWage : empWages) {
            if (companyEmpWage.getCompanyName().equalsIgnoreCase(companyName)) {
                return companyEmpWage.getTotalWage();
            }
        }
        return -1;  // Return -1 if company not found
    }

    // Main method to add companies and calculate their wages
    public static void main(String[] args) {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.add_company_wage("Meta", 12, 21, 56);
        emp.add_company_wage("Amazon", 4, 30, 150);
        emp.calculateEmpWage();

        // Query the total wage by company name
        System.out.println("Total wage for Meta: " + emp.getTotalWageByCompany("Meta"));
        System.out.println("Total wage for Amazon: " + emp.getTotalWageByCompany("Amazon"));
    }
}
