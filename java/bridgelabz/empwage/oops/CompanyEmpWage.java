package bridgelabz.empwage.oops;

public class CompanyEmpWage {
    final int is_part_time = 1;
    final int is_full_time = 2;

    final String company_name;
    final int max_working_days;
    final int max_working_hrs;
    final int wage_per_hr;
    int total_wage;
    int working_hrs;
    int working_day;
    int total_working_hr;

    // Constructor to initialize company details
    CompanyEmpWage(String company_name, int wage_per_hr, int max_working_days, int max_working_hrs) {
        this.company_name = company_name;
        this.wage_per_hr = wage_per_hr;
        this.max_working_hrs = max_working_hrs;
        this.max_working_days = max_working_days;
        this.total_wage = 0;
        this.working_hrs = 0;
        this.working_day = 0;
        this.total_working_hr = 0;
    }

    // Method to display company wage details
    public void display_company_wage_details() {
        System.out.println("\nPrinting the details of the company");
        System.out.println("Company Name: " + company_name + "\n Max Working Days: " + max_working_days +
                "\n Max Working Hours: " + max_working_hrs +
                "\n Wage per Hour: " + wage_per_hr +
                "\n Total Working Hours: " + total_working_hr +
                "\n Total Wage of Employee: " + total_wage);
    }

    // Method to calculate the total wage of the employees in the company
    public void calculate_total_wage() {
        System.out.println("Calculating the employee wage for the company: " + company_name);

        while (total_working_hr < max_working_hrs && working_day < max_working_days) {
            working_day++;
            int emp_type = (int) (Math.random() * 100) % 3;

            switch (emp_type) {
                case is_full_time:
                    working_hrs = 8;
                    break;
                case is_part_time:
                    working_hrs = 4;
                    break;
                default:
                    working_hrs = 0;
                    break;
            }
            int wage = working_hrs * wage_per_hr;
            total_wage += wage;
            total_working_hr += working_hrs;

            System.out.println("The wage for day " + working_day + " is " + wage);
        }
    }

    // Method to get total wage for this company
    public int getTotalWage() {
        return total_wage;
    }

    // Method to get the company name
    public String getCompanyName() {
        return company_name;
    }
}
