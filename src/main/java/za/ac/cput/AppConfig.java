package za.ac.cput;

import javax.management.MXBean;

@Configuration
public class AppConfig
{
    @MXBean(name = "emp")
    public SalaryInterface getService()
    {
        return new MonthlyEmployee();
    }
}
